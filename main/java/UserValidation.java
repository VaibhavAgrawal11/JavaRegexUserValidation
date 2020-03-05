import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {
    public static void main(String[] args) {
        System.out.println("Added feature to validate last name");
        //VALIDATING FIRST NAME
        System.out.println("Enter your first name:");
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        boolean firstNameCheck= checkFirstName(firstName);
        if (firstNameCheck)
            System.out.println("Valid first name");
        else
            System.out.println("Invalid first name");
        //VALIDATING LAST NAME
        System.out.println("Enter your last name:");
        String lastName = sc.nextLine();
        boolean lastNameCheck= checklastName(lastName);
        if (lastNameCheck)
            System.out.println("Valid last name");
        else
            System.out.println("Invalid last name");

    }

    //VALIDATE THE LAST NAME
    static boolean checklastName(String lastName) {
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