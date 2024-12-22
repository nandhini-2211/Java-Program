package Day4;
import java.util.Scanner;

public class SmallestNumber {
	 public static void main(String[] args) {
	        Scanner obj=new Scanner(System.in);
	        System.out.println("Enter the First Number");
	        int number1=obj.nextInt();
	        System.out.println("Enter the Second Number");
	        int number2=obj.nextInt();
	        System.out.println("Enter the Third Number");
	        int number3=obj.nextInt();
	        
	        if(number1<number2 && number1<number3){
	            System.out.println("Number1 is the Smallest Number");
	        }
	        else if(number2<number1 && number2<number3){
	            System.out.println("Number2 is the Smallest Number");
	        }
	        else{
	            System.out.println("Number3 is the Smallest Number");
	        }
	        
	        
	        
	    }

}
