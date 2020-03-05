import org.junit.Assert;
import org.junit.Test;

public class TestUserRegistration {
    UserValidation validator = new UserValidation();
    //TEST CASES FOR VALIDATING FIRST NAME
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

    //TEST CASES FOR VALIDATING LAST NAME
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue(){
        boolean result = validator.checkLastName("Agrawal");
        Assert.assertTrue(result);
    }
    @Test
    public void givenLastName_WhenImproper_ShouldReturnFalse(){
        boolean result = validator.checkLastName("aGraHGwal");
        Assert.assertFalse(result);
    }

    //TEST CASES FOR EMAIL VALIDATION
    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue(){
        boolean result = validator.checkEmail("abc.xyz@bl.co.in");
        Assert.assertTrue(result);
    }
    @Test
    public void givenEmail_WhenImproper_ShouldReturnFalse(){
        boolean result = validator.checkEmail("abc.xyz@dhsco");
        Assert.assertFalse(result);
    }
}
