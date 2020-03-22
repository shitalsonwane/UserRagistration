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
        boolean Email=obj.checkEmail("abc-100@yahoo.com");
        Assert.assertTrue(Email);
    }
    @Test
    public void givenEmail_wheninValid_thenFalse() {
        boolean Email=obj.checkEmail("abc-100yahoo.com");
        Assert.assertFalse(Email);
    }
    @Test
    public void givenMobileNumber_whenValid_thenTrue() {
        boolean MobileNumber=obj.checkMobileNumber("91 1234567890");
        Assert.assertTrue(MobileNumber);
    }
    @Test
    public void givenPassword1_whenValid_thenTrue() {
        boolean Password1=obj.checkPassword1("asdfgghh");
        Assert.assertTrue(Password1);
    }
    @Test
    public void givenPassword1_whenInvalid_thenFalse() {
        boolean Password1=obj.checkPassword1("asdgh");
        Assert.assertFalse(Password1);
    }
    @Test
    public void givenPassword2_whenvalid_thenTrue() {
        boolean Password2=obj.checkPassword3("RevatiTT");
        Assert.assertTrue(Password2);
    }
    @Test
    public void givenPassword2_whenInvalid_thenFalse() {
        boolean Password2=obj.checkPassword3("adjadfgh");
        Assert.assertFalse(Password2);
    }
    @Test
    public void givenPassword3_whenvalid_thenTrue() {
        boolean Password3=obj.checkPassword3("19RevatiTT");
        Assert.assertTrue(Password3);
    }
    @Test
    public void givenPassword3_whenInvalid_thenFalse() {
        boolean Password3=obj.checkPassword3("adjadfgh");
        Assert.assertFalse(Password3);
    }
    @Test
    public void givenPassword4_whenValid_thenTrue() {
        boolean Password4=obj.checkPassword4("Revati@1904");
        Assert.assertTrue(Password4);
    }
    @Test
    public void givenPassword4_whenInvalid_thenFalse() {
        boolean Password4=obj.checkPassword4("Revati@19@04");
        Assert.assertFalse(Password4);
    }
}
