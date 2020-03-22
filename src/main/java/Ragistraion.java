import java.util.regex.Pattern;

public class Ragistraion {
    String pattern1="^[A-Z][a-zA-Z]{2,}$";
    public static void main(String args[])
    {
        System.out.println("---Welcome to User Ragistration---");
    }
    public boolean checkName(String username) {
        return Pattern.matches(pattern1,username);
    }
}
