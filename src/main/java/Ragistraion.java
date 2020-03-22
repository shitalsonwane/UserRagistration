import java.util.regex.Pattern;

public class Ragistraion {
    String pattern1="^[A-Z][a-zA-Z]{2,}$";
    String pattern2="^[a-zA-Z]+([+]?[-]?[.]?[_]?[a-zA-Z0-9]+)?[@]{1}[a-z]+[.]{1}[a-z]{2,}([.]?[a-z]+)?$";
    String pattern3="[0-9]{2}[ ]{1}[0-9]{10}$";
    String pattern4="[a-zA-Z0-9]{8,}$";
    String pattern5="^([a-zA-Z0-9]*[A-Z]+[a-zA-Z0-9]*)+$";
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
    public boolean checkMobileNumber(String number) {
        return Pattern.matches(pattern3,number);
    }
    public boolean checkPassword1(String pass) {
        return Pattern.matches(pattern4,pass);
    }

    public boolean checkPassword2(String pass) {
        if(pass.length()>=8) {
            return (Pattern.matches(pattern5, pass));
        }
        else {
            return false;
        }
    }
}
