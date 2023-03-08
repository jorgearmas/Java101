import java.util.Scanner;

public class ConditionalsIF_14 {
    public static void main(String[] args) {
        /*Defining the flow of the program with If*/
        System.out.println("Enter the temperature in Fahrenheit: ");
        Scanner tempInput = new Scanner(System.in);
        int temperature = tempInput.nextInt();

        //After collecting data, Scanner object is no longer required
        tempInput.close();
        System.out.println("Temperature: "+temperature);

        //If condition is true the statement will be executed
        if(temperature >=84){
            System.out.println("It's a hot day!");
        }
    }
}
