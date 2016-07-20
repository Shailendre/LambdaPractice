/**
 * Created by shailendra.singh on 7/20/16.
 */
public class FuntionalInterfaceDemo1 {

    public static void execute(WorkInterface workInterface){
        workInterface.work();
    }
    /*
    * implemented through annoymous inner class
    * */
    public static void main(String[] args) {
        execute(new WorkInterface() {
            @Override
            public void work() {
                System.out.println("implemeted through annoymous inner class");
            }
        });
    }


}
