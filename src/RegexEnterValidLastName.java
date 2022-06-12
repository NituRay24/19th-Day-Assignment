import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEnterValidLastName {
    public void checkValidLastName(){
        Pattern pattern = Pattern.compile("Garg", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("graG");
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");
        } else System.out.println("Match not found");
    }
       public static void main(String[] args) {
        RegexEnterValidName rvg=new RegexEnterValidName();
        rvg.checkValidLastName();


    }

}
