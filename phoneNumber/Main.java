import java.util.regex.*;

/**
 * Write a description of class phone here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        String validNum = "1-310-430-1284";
        String invalidNum1 = "1-111-10a-1029";
        
        System.out.println("Phone Number: " + validNum + " returns " + phoneNumber(validNum));
        System.out.println("Phone Number: " + invalidNum1 + " returns " + phoneNumber(invalidNum1));
   
    }
    
    public static String phoneNumber(String a)
    {
        return (Pattern.compile("([0-9]-){1}([0-9]{3}-){2}[0-9]{4}").matcher(a).matches() ? "TRUE" : "FALSE");
    }
}
