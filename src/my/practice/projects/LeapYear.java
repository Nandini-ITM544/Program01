package my.practice.projects;

/**
 * Created by Nandini on 4/30/2019.
 */

/* fix the code */

public class LeapYear {

    public static void checkLeapYear ( long year)
    {
        if(year%4 == 0)
        {
            if ((year%100!=0) && (year%400 == 0))


                {
                    System.out.println("year is leap");
                }
                else
                {
                    System.out.println("year is not leap");
                }
            }

        }

  //  }

    public static void main(String[] args)
    {

       checkLeapYear(2020);
                
    }
}
