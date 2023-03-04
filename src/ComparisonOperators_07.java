public class ComparisonOperators_07 {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        //Equal (==)
        boolean result = x == true;
        System.out.println("Is X Equal to true: "+result);

        result = x == false;
        System.out.println("Is X Equal to false: "+result);

        //Difference
        result = x != false;
        System.out.println("Is X not equal to false: "+result);
        System.out.println(("Is X different from Y? "+(x!=y)));

        //greater that - less that
        int num1 = 5, num2 = 7;
        System.out.println("num1 < 10: "+(num1 < 10));
        System.out.println("num1 > 10: "+(num1 > 10));
        System.out.println("num1 < num2: "+(num1 < num2));
        System.out.println("num1 < 5: "+(num1 < 5));
        System.out.println("num1 <= 5: "+(num1 <= 5));
        System.out.println("num1 > 5: "+(num1 > 5));
        System.out.println("num1 >= 5: "+(num1 >= 5));
        System.out.format("\nFinal num1 = %d \t Final num2 = %d",num1,num2);

        //equals with String
        String str1 = "Java", str2 = "Beverage";
        System.out.println("str1.equals(\"Java\"): "+(str1.equals("Java")));
        System.out.println("str1.equals(str2): "+(str1.equals(str2)));

        //equals ignoring case sensitivity
        System.out.println("str1.equals(\"Java\"):"+(str1.equalsIgnoreCase("java")));
        System.out.println("!str1.equals(\"Java\"):"+(!str1.equalsIgnoreCase("java")));
    }
}
