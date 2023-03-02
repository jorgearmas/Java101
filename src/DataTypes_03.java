public class DataTypes_03 {
    public static void main(String[] args) {
        /*Data types in Java*/
        boolean isJavaFun = true;
        byte numCredits = 3; //Integer values (capacity of 8 bits)
        char myGrade = 'A'; //char saves one single character (capacity of 16 bits)
        short numCourses = 4; //Integer values (capacity of 16 bits)
        int age = 19; //Integer values (capacity of 32 bits)
        long tuitionPaid = 23983L; //Integer values (capacity of 64 bits), the 'L' has to be placed at the end of value
        float gpa = 3.21f; //Decimal values (capacity of 32 bits), the 'f' has to be placed at the end of the value
        double incomeEarned = 8283.98d; //Decimal values (capacity of 64 bits), the 'd' has to be placed at the end of the value

        System.out.println("Is Java fun to learn?: "+isJavaFun);
        System.out.println("Number of credits: "+numCredits);
        System.out.println("The student's grade in the course: "+myGrade);
        System.out.println("The number of courses the student has enrolled: "+numCourses);
        System.out.println("The age of the student: "+age);
        System.out.println("Cumulative tuition paid by the student: "+tuitionPaid);
        System.out.println("The student's GPA: "+gpa);
        System.out.println("Total income earned by the student: "+incomeEarned);
    }
}
