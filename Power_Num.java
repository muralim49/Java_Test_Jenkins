public class JavaExample {
    public static void main(String[] args) {
    	//Here number is the base and p is the exponent
        int number = 2, p = 5;
        long result = 1;
        
        //Copying the exponent value to the loop counter
        int i = p;
        for (;i != 0; --i)
        {
            result *= number
        }
        
        //Displaying the output
        System.out.println(number+"^"+p+" = "+result);
    }
}
