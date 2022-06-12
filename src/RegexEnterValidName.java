import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEnterValidName {
    public void checkValidLastName(){
        Pattern pattern = Pattern.compile("Ram", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("maR");
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");
        } else System.out.println("Match not found");
    }

    public static void main(String[] args) {
        RegexEnterValidName rvl = new RegexEnterValidName();
        rvl.checkValidLastName();

    }



    }

