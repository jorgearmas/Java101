public class StringsPrint_02 {
    public static void main(String[] args) {
        /*String declaration - assgination*/
        String varString = "This is a string";

        /*"format" method allows formatting options to print out*/
        System.out.format(varString);

        /*concat strings in print*/
        System.out.format("\nThe string value is: "+varString);

        /*concat int and string in print*/
        Integer varInt = 100;
        System.out.format("\nThe integer value is: "+varInt);

        /*formatting the output, "%d" indicates that the var
        * inserted within the string is an integer type*/
        System.out.format("\nThe integer %d is the variable value",varInt);

        /*formatting the output, "%s" indicates that the var
         * inserted within the string is a string type*/
        String message = "Good morning!";
        System.out.format("\nThe string %s is the variable value", varString);
    }
}
