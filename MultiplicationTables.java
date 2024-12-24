package Day5;
import java.util.Scanner;
public class MultiplicationTables {
	 public static void main(String[] args) {
	        Scanner obj=new Scanner(System.in);
	        System.out.println("Multiplication Table");
	        System.out.println("Enter a number:");
	        int n=obj.nextInt();
	        int i=1;
	        while(i<=10){
	            System.out.println(n +"*" +i+ "="+ n*i);
	            i++;
	        }
	       
	    }

}
