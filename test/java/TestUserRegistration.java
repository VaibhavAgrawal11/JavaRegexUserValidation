import org.junit.Assert;
import org.junit.Test;

public class TestUserRegistration {
    UserValidation validator = new UserValidation();
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue(){
        boolean result = validator.checkFirstName("Vailbhav");
        Assert.assertTrue(result);
    }
    @Test
    public void givenFirstName_WhenImproper_ShouldReturnFalse(){
        boolean result = validator.checkFirstName("vAilbhav");
        Assert.assertFalse(result);
    }

}
