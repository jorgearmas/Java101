import java.util.Arrays;

public class StringsArrays_04 {
    public static void main(String[] args) {
        /*String declaration-assignation*/
        String name =  "Fiona";
        System.out.println("The name is: "+name);

        /*String declaration as instance*/
        String name_2 = new String("Fiona");
        System.out.println("The name is: "+name_2+" as an instance of a String");

        /*"\n" represents an enter in the output*/
        String message_1 = "Fiona says: \nHello";
        System.out.println("n -> "+message_1);

        /*"\t" represents a tab in the output*/
        String message_2 = "Fiona\tsays: Hello";
        System.out.println("t -> "+message_2);

        /*"\b" represents a backspace in the output*/
        String message_3 = "Fiona\b says: Hello";
        System.out.println("b -> "+message_3);

        /*------------Arrays----------
        An array is a sequence of values of the same type,
        array declaration and assignation:*/
        String[] carBrands = {"Volvo", "Ford", "BMW", "Mazda"};

        /*Converting array into String to be printed*/
        String carBrandsString = Arrays.toString(carBrands);

        /*Output*/
        System.out.println("Car brands: "+carBrandsString);

        /*length: Get array size*/
        System.out.println("Array size: "+carBrands.length);

        /*Accesing array elements, each element has a position starting with 0*/
        System.out.println("carBrands[0]: "+carBrands[0]);
        System.out.println("carBrands[1]: "+carBrands[1]);
        System.out.println("carBrands[2]: "+carBrands[2]);
        System.out.println("carBrands[3]: "+carBrands[3]);

        /*Modifing the value of an element*/
        carBrands[0] = "Kia";
        String carBrandsString_2 = Arrays.toString(carBrands);
        System.out.println("Car brands new list: "+carBrandsString_2);

    }
}
