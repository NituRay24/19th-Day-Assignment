import java.util.regex.*;
import java.util.*;
public class EmailValidation {
    public void checkValidEmailId(){
        ArrayList<String> emails = new ArrayList<String>();

        emails.add("abc@yahoo.com");
        emails.add("abc-100@yahoo.com");
        emails.add("abc.100@yahoo.com");
        emails.add("abc111abc.com");
        emails.add("abc-100@abc.com");
        emails.add("abc-100@abc.net");
        emails.add("abc.100@abc.com.au");
        emails.add("abc.100@1.com");
        emails.add("abc2gmail.com.com");
        emails.add("abc+100@gmail.com");
        //Add invalid emails in list
        emails.add("abc");
        emails.add("abc@.com.my");
        emails.add("abc123@gmail.a");
        emails.add("abc123@.com");
        emails.add("abc@abc.com");
        emails.add("abc()*@gmail.com");
        emails.add("abc@%*.com");
        emails.add("abc..2002@gmail.com");
        emails.add("abc.@gmail.com");
        emails.add("abc@abc@gmail.com");
        emails.add("abc@gmail.com.1a");
        emails.add("abc@gmail.com.aa.au"); String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}";

        Pattern pattern = Pattern.compile(regex);//Compile regular expression to get the pattern

        for(String n : emails) //Iterate emails array list
        {

            Matcher matcher = pattern.matcher(n);   //Create instance of matcher
            System.out.println(n +" : "+ matcher.matches()+"\n");
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Email ID validation.");

        EmailValidation ev=new EmailValidation();
        ev.checkValidEmailId();

    }
    }


