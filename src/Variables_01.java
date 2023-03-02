public class Variables_01 {

    public static void main(String[] args) {
        /*Variable declaration*/
        int varInt;
        /*Variable assignation*/
        varInt = 100;
        System.out.println(varInt);

        /*Blocking the value of a variable,
        * 'final' will avoid a new assignation,
        * 'final' can be used as a constant*/
        final int setVarInt = 20;
        System.out.println(setVarInt);

        /*Multiple declarations - assignations*/
        int x = 5, y = 6, z =50;
        System.out.println("\nX value is: "+x);
        System.out.println("\nY value is: "+y);
        System.out.println("\nZ value is: "+z);
    }
}
