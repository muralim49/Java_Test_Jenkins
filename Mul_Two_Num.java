import java.util.Scanner;
import java.io.ByteArrayInputStream;

public class Mul_Two_Num {

    public static void main(String[] args) {

        /* This reads the input provided by user
         * using keyboard
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");

        // This method reads the number provided using keyboard
        int num1 = scan.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();

        // Closing Scanner after the use
        scan.close();
        
        // Calculating product of two numbers
        int product = num1*num2;
        
        // Displaying the multiplication result
        System.out.println("Output: "+product);
    }
}
