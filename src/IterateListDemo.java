import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by shailendra.singh on 7/20/16.
 */
public class IterateListDemo {

    private List<Integer> list = Arrays.asList(1,2,3,4,5);

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    //use iterators
    public void useIterator(){
        Iterator<Integer> iterator = getList().iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next());
        }
        System.out.println();
    }

    //use for loop
    public void useForLoop(){
        List<Integer> list = getList();
        for(int e : list)
            System.out.print(e);
        System.out.println();
    }

    //use forEach & lambda
    public void useForEach(){
        getList().forEach(n -> System.out.print(n));
        System.out.println();
    }

    //use of :: operator; java8
    public void useDCO(){
        getList().forEach(System.out::print);
        System.out.println();
    }

    public static void main(String[] args) {
        IterateListDemo iterateListDemo = new IterateListDemo();
        iterateListDemo.useIterator();
        iterateListDemo.useForLoop();
        iterateListDemo.useForEach();
        iterateListDemo.useDCO();
    }

}
