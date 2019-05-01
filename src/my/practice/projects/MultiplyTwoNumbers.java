package my.practice.projects;

/**
 * Created by Nandini on 5/1/2019.
 */
public class MultiplyTwoNumbers {

    private static float multiply(float first, float second) {

        float product = first * second;

        return product;


    }

    public static void main(String[] args) {

        float x = multiply(25.17f, 50.09f);

        System.out.println("product is:" + x);
    }

}
