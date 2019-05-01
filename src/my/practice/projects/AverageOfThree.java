package my.practice.projects;

/**
 * Created by Nandini on 5/1/2019.
 */
public class AverageOfThree {

    private static void average ( double a, double b, double c) {

        double avg =  ( a + b + c )/3;

        System.out.println("average is" + avg);
    }

    public static void main (String[] args)
    {
        average(3.0,5.0,0.0);
    }
}
