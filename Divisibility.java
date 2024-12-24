package Day5;

public class Divisibility {
	public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = obj.nextInt();
        int i = 1;
        while(i<=n){
            if(i%2==0 && i%4==0){
                System.out.println(i);
            }
            i++;
        }
        
        
    }
}
