package my.practice.projects;

/**
 * Created by Nandini on 4/9/2019.
 */
public class Factorial {

    public static int factorial(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++)

            result = result * i;
        return result;

    }

    public static void main(String args[]) {
        int n = 100;
        for (int i = 1; i <= n; i++) {
            System.out.println("get the factorial of" + n + "!" + " " + factorial(i));
        }
    }
}
