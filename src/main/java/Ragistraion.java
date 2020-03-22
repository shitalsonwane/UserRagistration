import java.util.regex.Pattern;

public class Ragistraion {
    String pattern1="^[A-Z][a-zA-Z]{2,}$";
    String pattern2="^[a-zA-Z]+([+]?[-]?[.]?[_]?[a-zA-Z0-9]+)?[@]{1}[a-z]+[.]{1}[a-z]{2,}([.]?[a-z]+)?$";
    public static void main(String args[])
    {
        System.out.println("---Welcome to User Ragistration---");
    }
    public boolean checkName(String username) {
        return Pattern.matches(pattern1,username);
    }
    public boolean checkEmail(String email) {
        return Pattern.matches(pattern2,email);
    }
}
