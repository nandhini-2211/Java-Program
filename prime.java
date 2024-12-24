package Day5;
import java.util.Scanner;
public class prime {
	 public static void main(String[] args) {
	        Scanner obj = new Scanner(System.in);
	        System.out.println("Enter a Number: ");
	        int n = obj.nextInt();
	        System.out.println("The Prime Numbers are ");
	        
	        
	        int num = 2; 
	        
	        while (num <= n) {
	            boolean isPrime = true;
	            int i = 2;
	            
	            while (i <= num / 2) {
	                if (num % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	                i++;
	            }
	            
	            if (isPrime) {
	                System.out.println(num);
	            }
	            
	            num++;
	        }
	        
	        
	    }
}
