package my.practice.projects;

/**
 * Created by Nandini on 5/12/2019.
 */
public class ArrayForEach {

    public static void main(String[] args) {
        double[] mylist = {12, 2.5, 16.7, 8.9};
        double sum = 0;
        double x = mylist[0];
        
        /* print all the elements */
        for (double element : mylist) {
            System.out.println(element);
        }


    /* print sum of all elements */
        for (double element : mylist) {
            sum += element;
        }
        System.out.println("sum is" + sum);


    /* find the largest element */

        for (double element : mylist
                ) {
            if (element > x) {
                x = element;
            }

        }
        System.out.println("greater element is " + x);
    }
}

