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
        String[] testCaseArray= {"abc@yahoo.com" ,"abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au","abc@1.com","abc@gmail.com.com"};
        for (int iterate=0; iterate<testCaseArray.length; iterate++) {
            boolean result = validator.checkEmail(testCaseArray[iterate]);
            Assert.assertTrue(result);
        }
    }
    @Test
    public void givenEmail_WhenImproper_ShouldReturnFalse(){
        String[] testCaseArray= {"abc","abc@.com.my","abc123@gmail.a","abc123@.com","abc123@.com.com",".abc@abc.com","abc()*@gmail.com","abc@%*.com","abc..2002@gmail.com","abc.@gmail.com ","abc@abc@gmail.com","abc@gmail.com.1a","abc@gmail.com.aa.au"};
        for (int iterate=0; iterate<testCaseArray.length; iterate++) {
            boolean result = validator.checkEmail(testCaseArray[iterate]);
            Assert.assertFalse(result);
        }
    }

    //TEST CASES FOR MOBILE NUMBER VALIDATION
    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue(){
        boolean result = validator.checkMobileNumber("91 9157981679");
        Assert.assertTrue(result);
    }
    @Test
    public void givenMobileNumber_WhenImproper_ShouldReturnFalse(){
        boolean result = validator.checkEmail("91232231");
        Assert.assertFalse(result);
    }
    @Test
    public void givenMobileNumber_WhenImproper_ShouldReturnFalse2(){
        boolean result = validator.checkEmail("919157981679");
        Assert.assertFalse(result);
    }

    //TEST CASES FOR PASSWORD LENGTH CHECK
    @Test
    public void givenPassword_WhenProper_ShouldBeGreaterThenEight() {
        boolean result = validator.checkPasswordLength("njsahnadsbh");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPassword_WhenImproper_ShouldNotBeGreaterThenEight() {
        boolean result = validator.checkPasswordLength("njsh");
        Assert.assertFalse(result);
    }

    //TEST CASES FOR PASSWORD HAVING ATLEAST ONE USPPER CASE LETTER
    @Test
    public void givenPassword_WhenProper_ShouldHaveAtLeastOneUpperCase() {
        boolean result = validator.checkAtLeastOneUppercase("jakjswkwA");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPassword_WhenImproper_ShouldNotHaveUpperCase() {
        boolean result = validator.checkAtLeastOneUppercase("jakjswkw");
        Assert.assertFalse(result);
    }

    //TEST CASES FOR PASSWORD HAVING ATLEAST ONE NUMERIC LETTER
    @Test
    public void givenPassword_WhenProper_ShouldHaveAtLeastOneNumber() {
        boolean result = validator.checkAtLeastOneNumber("jak85j4swkwA");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPassword_WhenImproper_ShouldNotHaveNumber() {
        boolean result = validator.checkAtLeastOneNumber("jJUakjswkw");
        Assert.assertFalse(result);
    }

    //TEST CASES FOR PASSWORD HAVING EXACTLY ONE SPECIAL CHARACTER
    @Test
    public void givenPassword_WhenProper_ShouldHaveExactlyOneSpecialChar() {
        boolean result = validator.checkExactlyOneSpecialCharacter("bgsdhj%HSsgs4");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPassword_WhenImproper_ShouldNotHaveExactlyOneSpecialChar() {
        boolean result = validator.checkAtLeastOneNumber("jJUakjsw$%kw");
        Assert.assertFalse(result);
    }
    @Test
    public void givenPassword_WhenImproper_ShouldNotHaveExactlyOneSpecialChar2() {
        boolean result = validator.checkAtLeastOneNumber("jJUakjswkw");
        Assert.assertFalse(result);
    }
}
