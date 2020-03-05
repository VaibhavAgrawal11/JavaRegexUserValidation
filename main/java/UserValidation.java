import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {
    public static void main(String[] args) {
        System.out.println("Added feature to validate password having atleast one upper case");
        //VALIDATING FIRST NAME
        System.out.println("Enter your first name:");
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        boolean firstNameCheck = checkFirstName(firstName);
        if (firstNameCheck)
            System.out.println("Valid first name");
        else
            System.out.println("Invalid first name");
        //VALIDATING LAST NAME
        System.out.println("Enter your last name:");
        String lastName = sc.nextLine();
        boolean lastNameCheck = checkLastName(lastName);
        if (lastNameCheck)
            System.out.println("Valid last name");
        else
            System.out.println("Invalid last name");
        //VALIDATE EMAIL ADDRESS
        System.out.println("Enter your email address:");
        String email = sc.nextLine();
        boolean emailCheck = checkEmail(email);
        if (emailCheck)
            System.out.println("Valid email address");
        else
            System.out.println("Invalid email address");
        //VALIDATING MOBILE NUMBER
        System.out.println("Enter your mobile number:");
        String mobNum = sc.nextLine();
        boolean mobileNumberCheck = checkMobileNumber(mobNum);
        if (mobileNumberCheck)
            System.out.println("Valid mobile number");
        else
            System.out.println("Invalid mobile number");
        //VALIDATING PASSWORD
        System.out.println("Enter your password:");
        String password = sc.nextLine();
        boolean passwordCheck = checkPassword(password);
        if (passwordCheck)
            System.out.println("Valid password");
        else
            System.out.println("Invalid password");
    }

    //VALIDATE ALL CASES OF PASSWORD
    private static boolean checkPassword(String password) {
        boolean checkLength=checkPasswordLength(password);
        if(checkLength) {
            boolean checkUppercase = checkAtLeastOneUppercase(password);
            if(checkUppercase==false)
                return false;
        }
        else
            return false;
        return true;

    }
    //VALIDATE PASSWORD HAVING AT LEAST ONE UPPER CASE CHARACTER
    static boolean checkAtLeastOneUppercase(String password) {
        Pattern passwordUpperCasePat = Pattern.compile(".*[A-Z]+.*");
        Matcher check = passwordUpperCasePat.matcher(password);
        boolean passwordUpperCaseCheck = check.matches();
        return passwordUpperCaseCheck;
    }

    //VALIDATE PASSWORD LENGTH
    static boolean checkPasswordLength(String password) {
        Pattern passwordLengthPat = Pattern.compile("^.{8,}");
        Matcher check = passwordLengthPat.matcher(password);
        boolean passwordLengthCheck = check.matches();
        return passwordLengthCheck;
    }

    //VALIDATE MOBILE NUMBER
    static boolean checkMobileNumber(String mobNum) {
        Pattern mobPat = Pattern.compile("^91[ ][0-9]{10}$");
        Matcher check = mobPat.matcher(mobNum);
        boolean mobCheck = check.matches();
        return mobCheck;
    }

    //VALIDATE EMAIL ADDRESS
    static boolean checkEmail(String email) {
        Pattern emailPat = Pattern.compile("^abc([+]?[-]?[.]?[_]?[\\w]+)?[@][a-z]+[.][a-z]{2,}([.]?[a-z]+)?$");
        Matcher check = emailPat.matcher(email);
        boolean emailCheck = check.matches();
        return emailCheck;
    }

    //VALIDATE THE LAST NAME
    static boolean checkLastName(String lastName) {
        Pattern namePat = Pattern.compile("^[A-Z][a-z]{2,}");
        Matcher check = namePat.matcher(lastName);
        boolean lastNameCheck = check.matches();
        return lastNameCheck;
    }

    //VALIDATE THE FIRST NAME
    public static boolean checkFirstName(String firstName) {
        Pattern namePat = Pattern.compile("^[A-Z][a-z]{2,}");
        Matcher check = namePat.matcher(firstName);
        boolean firstNameCheck = check.matches();
        return firstNameCheck;
    }
}