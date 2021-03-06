import org.junit.Assert;
import org.junit.Test;

public class TestRagistration {
    Ragistraion obj=new Ragistraion();
    @Test
    public void givenfirstName_whenValid_thenTrue() {
        boolean firstname=obj.checkName("Ganga");
        Assert.assertTrue(firstname);
    }

    @Test
    public void givenfirstName_whenInvalid_thenFalse() {
        boolean firstname=obj.checkName("ganga");
        Assert.assertFalse(firstname);
    }
    @Test
    public void givenlastName_whenValid_thenTrue() {
        boolean lastname=obj.checkName("Capital");
        Assert.assertTrue(lastname);
    }
    @Test
    public void givenlastName_wheninValid_thenFalse() {
        boolean lastname=obj.checkName("capital");
        Assert.assertFalse(lastname);
    }
    @Test
    public void givenEmail_whenValid_thenTrue() {
        String array[]={"abc.xyz@bl.co.in","abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com",
                "abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au",
                "abc@gmail.com.com","abc+100@gmail.com"};
        for(int index=0;index<array.length;index++){
            boolean email=obj.checkEmail(array[index]);
            Assert.assertTrue(email);
        }
    }
    @Test
    public void givenEmail_wheninValid_thenFalse() {
        String array1[]={"abc","abc()*@gmail.com","abc@.com.my","abc123@gmail.a",
                "abc123@.com","abc123@.com.com",".abc@abc.com","abc()*@gmail.com",
                "abc@%*.com","abc..2002@gmail.com","abc.@gmail.com","abc@abc@gmail.com",
                "abc@gmail.com.1a","abc@gmail.com.aa.au"};
        for(int index1=0;index1<array1.length;index1++) {
            boolean Email = obj.checkEmail(array1[index1]);
            Assert.assertFalse(Email);
        }
    }
    @Test
    public void givenMobileNumber_whenValid_thenTrue() {
        boolean MobileNumber=obj.checkMobileNumber("91 1234567890");
        Assert.assertTrue(MobileNumber);
    }
    @Test
    public void givenPassword1_whenValid_thenTrue() {
        boolean Password1=obj.checkPassword("asdfgghh");
        Assert.assertTrue(Password1);
    }
    @Test
    public void givenPassword1_whenInvalid_thenFalse() {
        boolean Password1=obj.checkPassword("asdgh");
        Assert.assertFalse(Password1);
    }
    @Test
    public void givenPassword2_whenvalid_thenTrue() {
        boolean Password2=obj.checkPassword("RevatiTT");
        Assert.assertTrue(Password2);
    }
    @Test
    public void givenPassword2_whenInvalid_thenFalse() {
        boolean Password2=obj.checkPassword("adjadfgh");
        Assert.assertFalse(Password2);
    }
    @Test
    public void givenPassword3_whenvalid_thenTrue() {
        boolean Password3=obj.checkPassword("19RevatiTT");
        Assert.assertTrue(Password3);
    }
    @Test
    public void givenPassword3_whenInvalid_thenFalse() {
        boolean Password3=obj.checkPassword("adjadfgh");
        Assert.assertFalse(Password3);
    }
    @Test
    public void givenPassword4_whenValid_thenTrue() {
        boolean Password4=obj.checkPassword("Revati@1904");
        Assert.assertTrue(Password4);
    }
    @Test
    public void givenPassword4_whenInvalid_thenFalse() {
        boolean Password4=obj.checkPassword("Revati@19@04");
        Assert.assertFalse(Password4);
    }
}
