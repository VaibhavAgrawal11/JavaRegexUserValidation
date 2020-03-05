import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {
    public static void main(String[] args) {
        System.out.println("Added feature to validate email address");
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