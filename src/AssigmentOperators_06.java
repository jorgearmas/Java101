public class AssigmentOperators_06 {
    public static void main(String[] args) {
        int varInt1 = 10, varInt2 = 5;

        System.out.println("varInt1 = "+varInt1);
        System.out.println("varInt2 = "+varInt2);

        //Assigment - increment/decrement
        varInt1 += 1;
        System.out.println("\nvarInt1 after increment = "+varInt1);

        varInt2 -= 1;
        System.out.println(("varInt2 after decrement = "+varInt2));

        //Assigment - increment/decrement with ++/--
        int varInt3 = 10, varInt4 = 5;

        varInt3 ++;
        System.out.println("\nvarInt3 after increment = "+varInt3);

        varInt4 --;
        System.out.println("varInt4 after increment = "+varInt4);
    }
}
