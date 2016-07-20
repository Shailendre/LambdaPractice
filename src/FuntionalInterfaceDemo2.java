/**
 * Created by shailendra.singh on 7/20/16.
 */
public class FuntionalInterfaceDemo2 {

    public void execute(WorkInterface workInterface){
        workInterface.work();
    }

    public static void main(String[] args) {
        new FuntionalInterfaceDemo2().execute(() -> System.out.println("implemeted through lambda expression:"));
    }
}
