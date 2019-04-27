package my.practice.projects;

/**
 * Created by Nandini on 4/9/2019.
 */
public class EvenOrOdd {

    public static boolean evenOrOdd (int b) {
        if (b%2 == 0) {
            return true;
        } else {

            return false;
        }
    }



public static void main (String args[])
{

    System.out.println("is the number even:" + evenOrOdd(10890));
 }
}