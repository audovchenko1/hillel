import java.util.*;

public class Main {
    public static void main(String[] args) {

        int myarr[] = new int[]{1,2,3,4,5};

        try {
            System.out.println(myarr[5]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index out of range");
        }

       try {
           int f = getF();

           if (f == 12) {
               throw new F12Exception("f is equals to 12");
           }
       } catch (F12Exception exception) {
           System.out.println(exception.getMessage());
       }

        boolean isAllOkay = true;
        try {
            int b = getSomething();
            System.out.println(b);

            int a = 10;
            int c = getSomeInt();

            double dd = a / c;

            System.out.println(dd);

        } catch (NullPointerException exception) {
            System.out.println("Wait for int get Null. Please check");
            isAllOkay = false;
        } catch (ArithmeticException exception) {
            System.out.println("Zero devision, not good");
            isAllOkay = false;
        } finally {
            if (isAllOkay == true) {
                System.out.println("All tests passed OK");
            } else {
                System.out.println("failed :(");
            }
        }

    }

    public static Integer getSomething()
    {
        //uncomment for exception
//        return null;
        return 10;
    }

    public static int getSomeInt()
    {
        return 0;
    }

    public static int getF()
    {
        return 12;
    }
}