public class MultiplicationTable {
    public static void main(String[] args) {
        // Define the number for which the multiplication table will be printed
        int number = 5;  // You can change this number as needed
        
        // Display the multiplication table
        System.out.println("Multiplication Table for " + number + ":");
        
        // Loop to print multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
