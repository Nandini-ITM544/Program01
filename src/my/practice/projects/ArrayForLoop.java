package my.practice.projects;

/**
 * Created by Nandini on 5/12/2019.
 */
public class ArrayForLoop {

    public static void main(String[] args) {
        double[] myArray = {1.2, 2.2, 3.5, 4.5, 9.12, 3.0};
        double sum = 0;


        /* print all the elements in the array */
        for (int i = 0; i <= myArray.length - 1; i++) {
            System.out.println(myArray[i]);
        }

        /* print the sum of all elements */

        for (int i = 0; i <= myArray.length - 1; i++) {

            sum += myArray[i];
        }
        System.out.println("sum is" + sum);



    /* print the largest element in the array */

        double max = myArray[0];

        for (int i =1; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }

        System.out.println("the greatest element is" + max);
    }
}





