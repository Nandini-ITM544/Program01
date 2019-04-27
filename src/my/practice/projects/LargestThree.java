package my.practice.projects;

/**
 * Created by Nandini on 4/9/2019.
 */
public class LargestThree {

    public static int largestOfThree(int a, int b, int c) {
        int largest;

        if ((a > b) && (a > c)) {
            largest = a;
        } else if (((b > a) && (b > c))) {
            largest = b;
        } else {
            largest = c;
        }

        return largest;
    }

    public static void main(String args[]) {

        System.out.println("the largest of all is" + largestOfThree(567,1009,1076));

    }
}
