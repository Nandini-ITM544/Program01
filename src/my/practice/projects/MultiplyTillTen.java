package my.practice.projects;

/**
 * Created by Nandini on 5/1/2019.
 */
public class MultiplyTillTen {

    private static void multiplyWithTen(int num) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("product of" + i + " " + num + "" + "is:" + " " + num * i);
        }
    }

    public static void main(String[] args) {

        multiplyWithTen(8);

    }


}
