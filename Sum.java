package Day5;

public class Sum {
	public static void main(String[] args) {
        int odd_sum=0;
        int even_sum=0;
        int i=0;
        while(i<=20){
            if(i%2==0){
                even_sum +=i;
            }
            else{
                odd_sum +=i;
            }
            i++;
        }
        System.out.println("Sum of Even Numbers: " + even_sum);
        System.out.println("Sum of Odd Numbers: " + odd_sum);
    }
}
