package Day4;
import java.util.Scanner;

public class Vote {
	 public static void main(String[] args) {
	        Scanner obj = new Scanner(System.in);
	        System.out.println("Enter the Nationality:");
	        String inputString = obj.nextLine();
	        System.out.println("Enter the Age");
	        int age=obj.nextInt();
	        if(inputString.equalsIgnoreCase("Indian")){
	            if(age>=18){
	                System.out.println("You are eligible to Vote");
	                
	            }
	            else{
	                System.out.println("You are not eligible to vote due to Age");
	                
	            }
	            
	        }
	        else{
	            System.out.println("You are not eligible to vote");
	        }
	        
	        
	    }

}
