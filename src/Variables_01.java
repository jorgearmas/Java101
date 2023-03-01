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
    }
}
