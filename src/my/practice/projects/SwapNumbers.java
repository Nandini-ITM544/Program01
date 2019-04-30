package my.practice.projects;

/**
 * Created by Nandini on 4/9/2019.
 */
public class SwapNumbers {

    private static void swapNumbers(int a, int b) {

        System.out.println("a is" + a);



        System.out.println("b is" + b);

        int temp = a;

        a = b;

        b = temp;

        System.out.println("swapped numbers are" + " " +  "a:" + a + " " +  "b:" + b);

    }

    public static void main(String[] args) {

        swapNumbers(26, 37);
    }

}
