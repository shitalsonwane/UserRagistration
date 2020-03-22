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
}
