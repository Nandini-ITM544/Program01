package my.practice.projects;

/**
 * Created by Nandini on 5/1/2019.
 */
public class CircleArea {

    private static final double PI_VALUE = 3.14;

    private static double areaOfCircle(int radius) {

        return PI_VALUE * (radius * radius);
    }

    private static double perimeterOfCircle(int radius) {

        return 2 * (PI_VALUE * radius);

    }

    public static void main(String args[]) {

        double x = areaOfCircle(20);
        double y = perimeterOfCircle(40);

        System.out.println(x);
        System.out.println(y);
    }
}
