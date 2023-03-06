public class OperatorPrecedence_09 {
    public static void main(String[] args) {

        double a = 2, b = 5, c = 6, d = 10;

        System.out.println("a+b*d = "+(a+b*d));
        System.out.println("(a+b)*d = "+(a+b)*d);
        System.out.println("a+(b*d) = "+(a+(b*d)));

        System.out.println("\na+b/d = "+(a+b/d));
        System.out.println("a+b/d = "+((a+b)/d));
        System.out.println("a+b/c-d = "+(a+b/c-d));
        System.out.println("a+b/(c-d) = "+(a+b/(c-d)));
    }
}
