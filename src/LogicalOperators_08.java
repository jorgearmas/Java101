public class LogicalOperators_08 {
    public static void main(String[] args) {

        boolean isJavaFun = true;
        boolean isCoffeeBitter = true;
        boolean isTheSkyPurple = false;
        boolean isTheEarthFlat = false;

        /*OR operator:
        * At least one value must be true for the comparison to return true.*/
        System.out.println("isJavaFun || isCoffeeBitter: "+(isJavaFun||isCoffeeBitter));
        System.out.println("isJavaFun || isTheSkyPurple: "+(isJavaFun||isTheSkyPurple));
        System.out.println("isTheEarthFlat || isCoffeeBitter: "+(isTheEarthFlat||isCoffeeBitter));
        System.out.println("isTheSkyPurple || isTheEarthFlat: "+(isTheSkyPurple||isTheEarthFlat));

        /*AND operator:
        * All the values must be false for the comparison to return true*/
        System.out.println("\nisJavaFun && isCoffeeBitter: "+(isJavaFun&&isCoffeeBitter));
        System.out.println("isJavaFun && isTheSkyPurple: "+(isJavaFun&&isTheSkyPurple));
        System.out.println("isTheEarthFlat && isCoffeeBitter: "+(isTheEarthFlat&&isCoffeeBitter));
        System.out.println("isTheSkyPurple && isTheEarthFlat: "+(isTheSkyPurple&&isTheEarthFlat));

        //Multiple operators in comparison
        boolean isWatchInStock = true;
        int watchPrice = 200;
        int myBudget = 180;
        boolean isThereASale = false;
        int salesDiscount = 30;

        System.out.println("\nIs the watch available and affordable? "+(isWatchInStock && (watchPrice <= myBudget)));
        System.out.println("Is the watc available and affordable on a sale? "+(isWatchInStock && ((watchPrice-salesDiscount)<=myBudget)));
        System.out.println("Can I buy the watch today? "
                +(isWatchInStock&&((watchPrice <= myBudget)
                || (isThereASale && (watchPrice-salesDiscount) <= myBudget))));
    }
}
