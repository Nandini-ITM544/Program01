package my.practice.projects;

/**
 * Created by Nandini on 4/30/2019.
 */
public class FrequencyOfCharacter {

    private static void calculateFrequencyOfCharacter( String s, char ch)
    {
         int counter =0;

        for (int i=0;i<s.length();i++)
        {
            if(ch == s.charAt(i))
            {
                counter++;
            }
        }

        System.out.println("the frequency is counter" + counter);
    }

    public static void main (String[] args)
    {
        calculateFrequencyOfCharacter("hi da how are you",'a');
    }
}
