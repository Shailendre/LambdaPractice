import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by shailendra.singh on 7/20/16.
 */
class Dog{// implements Comparator<Dog>{

    private String name;
    private int weight;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*@Override
    public int compare(Dog o1, Dog o2) {
        return o1.getWeight() - o2.getWeight();
    }*/
}
class SortDog {

    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.setName("browny");
        d1.setAge(2);
        d1.setWeight(20);

        Dog d2 = new Dog();
        d2.setName("lucy");
        d2.setAge(2);
        d2.setWeight(11);

        Dog[] darr = {d1,d2};


        /*
        * old way to pass the comparator instance
        * -> since Dog class already implements Comparator<Dog>; no need to create annoymous class instance
        * */

        //Arrays.sort(darr,new Dog());

        /*
        * also old way to pass comparator as annoymous class
        * */

        /*
        Arrays.sort(darr, new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.getWeight() - o2.getWeight();
            }
        });
        */


        //use of lambda exoression to pass the comparator object

        Arrays.sort(darr,(o1, o2) -> o1.getWeight() - o2.getWeight());

        for (Dog dog : darr) {
            System.out.println(dog.getName());
        }
    }
}
