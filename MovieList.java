package Day4;
import java.util.Scanner;
public class MovieList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the hero name(Surya/Vijay/Dhanush:)");
		String name = sc.next();
        if(name.equalsIgnoreCase("Surya")) {
			System.out.println("Soorarai Potru");
			System.out.println("Singam");
			System.out.println("24");
            
        }
        else if(name.equalsIgnoreCase("Vijay")) {
			System.out.println("Bigil");
			System.out.println("Theri");
			System.out.println("Master");
            
        }
        else if(name.equalsIgnoreCase("Dhanush")) {
			System.out.println("Thiruchitrambalam");
			System.out.println("Vaathi");
			System.out.println("Raayan");
            
        }
        else{
            System.out.println("The name is not in the list");
        }
}


}
