import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class IClicker {
    public void test1() {
        try {
            System.out.println("");
        } catch (Exception e) {

        }/*catch (ArithmeticException e){

        }*/
    }

    public void test3() {
        try {
            System.out.println("");
        } finally {
            System.out.println("");
        }
    }

    public void test4(){
        FileInputStream fis = null;
//        try{
//            fis = new FileInputStream("");
//        }finally {
//            System.out.println();
//        } catch (FileNotFoundException e){
//            System.out.println();
//        }
    }
}
