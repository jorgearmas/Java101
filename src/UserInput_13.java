import java.util.Scanner;

public class UserInput_13 {
    public static void main(String[] args) {
        System.out.println("Enter the temperature in Fahrenheit: ");
        /*User Input:
        Instance Scanner will allow user input the data while
        'tempInput.nextInt()' will capture the data*/
        Scanner tempInput = new Scanner(System.in);
        float temperature = tempInput.nextFloat();

        System.out.println("The input temperature is: "+temperature);

        /*User Input - String
         .next() will capture the token without filtering the data type*/
        System.out.println("Enter a name: ");
        Scanner nameInput = new Scanner(System.in);
        String name = nameInput.next();
        System.out.println("The name entered is: "+name);

        /*.nextLine() will capture the entire line
        * trim() will cut spaces at the beggining and at the end of
        * the chain*/
        System.out.println("Enter a name and last name: ");
        Scanner nameLastInput = new Scanner(System.in);
        String fullName = nameLastInput.nextLine().trim();
        System.out.println("The name entered is: "+fullName);

    }
}
