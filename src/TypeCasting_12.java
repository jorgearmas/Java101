public class TypeCasting_12 {
    public static void main(String[] args) {
        int myInt = 9;

        //Interoperability only from lower to higher presition
        double myDouble = myInt;

        float myFloat = 8.5f;
        double floatToDouble = myFloat;
        float intToFloat = myInt;

        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println("Float to Double: "+floatToDouble);
        System.out.println("Int to Float: "+intToFloat);

        //Interoperability char to int-float
        char myChar = 'A';
        int charToInt = myChar;
        float charToFloat = myChar;

        System.out.println("Integer value is: "+charToInt);
        System.out.println("Float value is:  "+charToFloat);

        //Cast higher to lower presition
        float doubleToFloat = (float)myDouble;
        int floatToInt = (int)myInt;

        System.out.println("Double to Float: "+doubleToFloat);
        System.out.println("Float to Int: "+floatToInt);
    }
}
