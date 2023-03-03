public class ArithmeticOperators_05 {
    public static void main(String[] args) {

        //Sum
        int num1 = 20, num2 = 10, result;
        result = num1 + num2;
        System.out.println("num1 + num2 = "+result);

        //Substraction
        double numS1 = 20D, numS2 = 10D, resultS;
        resultS = numS1 - numS2;
        System.out.println("num1 - nym2 = "+resultS);

        //Product
        float numP1 = 20F, numP2 = 10F, resultP;
        resultP = numP1 * numP2;
        System.out.println("num1 * num2 = "+resultP);

        //Division
        //float values will return an integer result
        double numD1 = 20L, numD2 = 8L, resultD;
        resultD = numD1 / numD2;
        System.out.println("num1 / num2 = "+resultD);

        //Module
        int numM1 = 20, numM2 = 8, resultM;
        resultM = numM1 % numM2;
        System.out.println("num1 + num2 = "+resultM);

        //Sum with Strings
        String firstName = "Robert", lastName = "De Niro", fullName;
        fullName = firstName +" "+lastName;
        System.out.println("Full name: "+fullName);
    }
}
