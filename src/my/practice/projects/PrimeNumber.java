package my.practice.projects;

/**
 * Created by Nandini on 4/9/2019.
 */
public class PrimeNumber {

    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;

            } else {
                return true;
            }

        }

        return false;
    }

    public static void main(String args[]) {
        int n = 10;
        System.out.println(isPrime(n));
    }


}
