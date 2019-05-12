package my.practice.projects;

/**
 * Created by Nandini on 5/12/2019.
 */
public class PassArrays {

    private static void printArray(double[] mylist) {

        for (double element : mylist
                ) {

            System.out.println("elements are" + element);

        }

    }

    private static double sumArray(double[] mylist) {
        double sum = 0;
        for (double element : mylist
                ) {
            sum += element;
        }

        return sum;
    }

    private static double largest(double[] myarray) {

        double max = myarray[0];

        for (double element : myarray
                ) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        largest(new double[]{4.5, 6.0, 7.8, 9.0});
        printArray(new double[]{4.5, 6.0, 7.8, 9.0});
        sumArray(new double[]{4.5, 6.0, 7.8, 9.0});

    }
}
