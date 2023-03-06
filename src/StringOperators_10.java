public class StringOperators_10 {
    public static void main(String[] args) {

        //Concatenation
        String firstName = "John";
        String lastName = "Doe";

        System.out.println(firstName+" "+lastName);

        //Concatenation of different data types
        String x = "100";
        int y = 50;

        System.out.println("String x + int y: "+(x+y));

        //Array of characters
        char[] ch = {'L','O','O','N','Y','C','O','R','N'};

        //Transformation from array to String
        String name = new String(ch);

        System.out.println("The character array is: "+ch);
        System.out.println("The string: "+name);

        //Common methods of Stringss
        String phrase = " Live and let live! ";
        System.out.println("\nThe original string: "+phrase);
        System.out.println("The length of the string: "+phrase.length());
        System.out.println("The String in uppercase: "+phrase.toUpperCase());
        System.out.println("The String in lowercase: "+phrase.toLowerCase());
        System.out.println("The trimmed String: "+phrase.trim());

        //Getting index position of char in String
        System.out.println("\nWhat is the location of the first 't'? "+phrase.indexOf('t'));
        System.out.println("What is the location of the first 'v'? "+phrase.indexOf('v'));
        System.out.println("What is the location of the first 'l'? "+phrase.indexOf('!'));
        //If the char id not within the String, the method will return a -1
        System.out.println("What is the location of the first 'x'? "+phrase.indexOf('x'));

        //Getting last index position of char in String
        System.out.println("\nWhat is the location of the last 't'? "+phrase.lastIndexOf('t'));
        System.out.println("What is the location of the last 'v'? "+phrase.lastIndexOf('v'));

        //Getting the char of certain index
        System.out.println("\nWhat is the character in position 3? "+phrase.charAt(3));
        //If we are our of range, there will be an error in the execution
        System.out.println("What is the character at position 33? "+phrase.charAt(33));
    }
}
