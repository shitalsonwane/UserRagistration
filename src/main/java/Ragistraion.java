import java.util.regex.Pattern;

public class Ragistraion {
    String namePattern="^[A-Z][a-zA-Z]{2,}$";
    String emailPattern="^[a-zA-Z]+([+]?[-]?[.]?[_]?[a-zA-Z0-9]+)?[@]{1}[a-z]+[.]{1}[a-z]{2,}([.]?[a-z]+)?$";
    String mobilePattern="[0-9]{2}[ ]{1}[0-9]{10}$";
    String passwordPattern1="[a-zA-Z0-9]{8,}$";
    String passwordPattern2="^([a-zA-Z0-9]*[A-Z]+[a-zA-Z0-9]*)+$";
    String passwordPattern3="^([A-Z0-9]*[A-Z]+[a-zA-Z0-9]*[0-9]+[a-zA-Z0-9]*)|([a-zA-Z0-9]*[0-9]+[a-zA-Z0-9]*[A-Z]+[a-zA-Z0-9]*)$";
    String passwordPattern4="^([a-zA-Z0-9]*[A-Z]+[a-zA-Z0-9]*[0-9]*[a-zA-Z0-9]*[@#$&]*[a-zA-Z0-9]*)|([a-zA-Z0-9]*[@#$&]*[a-zA-Z0-9]*[A-Z]*[a-zA-Z0-9]*[0-9]+[a-zA-Z0-9]*)|([a-zA-Z0-9]*[0-9]*[a-zA-Z0-9]*[@#$&]+[a-zA-Z0-9]*[A-Z]*[a-zA-Z0-9]*)$";
    public static void main(String args[])
    {
        System.out.println("---Welcome to User Ragistration---");
    }
    //function for check username
    public boolean checkName(String username) {
        return Pattern.matches(namePattern,username);
    }
    //function for check email
    public boolean checkEmail(String email) {
        return Pattern.matches(emailPattern,email);
    }
    //check mobile number
    public boolean checkMobileNumber(String number) {
        return Pattern.matches(mobilePattern,number);
    }
    //check password
    public boolean checkPassword(String pass) {
        if(pass.length()>=8) {
            return (Pattern.matches(passwordPattern4,pass));
        }
        else {
            return false;
        }
    }
}
