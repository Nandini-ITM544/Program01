package my.practice.projects;

/**
 * Created by Nandini on 5/1/2019.
 */
public class RectangleareaPerimeter {

    private static void areaOfRact(int length, int breadth) {

        int area = length * breadth;

        System.out.println("area is" + area);
    }


    private static void perimeterOfRect(int length, int breadth) {

        int perimeter = 2 * (length + breadth);

        System.out.println("perimeter is" + perimeter);
    }

    public static void main (String[] args)
    {
        areaOfRact(10,99);
        perimeterOfRect(70,90);
    }
}
