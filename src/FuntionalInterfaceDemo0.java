/**
 * Created by shailendra.singh on 7/20/16.
 */
public class FuntionalInterfaceDemo0 implements WorkInterface {
    @Override
    public void work() {
        System.out.println("used implements");
    }
    /*
    * Used implements to call work function
    * */
    public static void main(String[] args) {
        WorkInterface workInterface = new FuntionalInterfaceDemo0();
        workInterface.work();
    }
}
