package Day2;

public class Operators {
	 public void Arithmetic(){
	        int x=10,y=5;
	        int sum=x+y;
	        System.out.println("The sum is:"+ sum);
	        int multiply=x*y;
	        System.out.println("The mul is:"+multiply);
	        int sub=x-y;
	        System.out.println("The sub is:"+sub);
	        int div=x/y;
	        System.out.println("The Quotient is:"+div);
	        int modulus=x%y;
	        System.out.println(" The remainder is:"+modulus);
	        
	    }
	    public void Unary(){
	        int x=50,y=60;
	        System.out.println("pre increment:"+ ++x);
	        System.out.println("post increment:"+ x++);
	        System.out.println("pre decrement:"+ --y);
	        System.out.println("post decrement:"+ y--);
	        
	    }
	    public void Ternary(){
	        int x=10,y=50;
	        int max = (x > y) ? x : y;
	        System.out.println("The maximum value is: " + max);
	    }
	    public void Logical(){
	        boolean x=true,y=false;
	    System.out.println(x && y);
	    System.out.println(x || y);
	    System.out.println(!y);
	    }
	    public void Bitwise(){
	        int a = 0101;  
	        int b = 0011;  

	        System.out.println("a & b = " + (a & b));  
	        System.out.println("a | b = " + (a | b));  
	        System.out.println("a ^ b = " + (a ^ b));  
	        System.out.println("~a = " + (~a));        
	        System.out.println("a << 1 = " + (a << 1));  
	        System.out.println("a >> 1 = " + (a >> 1));  
	        System.out.println("a >>> 1 = " + (a >>> 1));  
	    }
	    public void Comparison(){
	        int a = 10, b = 15;

	        System.out.println(a == b);  // false
	        System.out.println(a != b);  // true
	        System.out.println(a > b);   // false
	        System.out.println(a < b);   // true
	        System.out.println(a >= b);  // false
	        System.out.println(a <= b);  // true
	    }
	    public void Assignment(){
	        int a = 10;
	        int b = 5;
	        a += 5;  
	        System.out.println("a += 5: " + a);  
	        a -= 3; 
	        System.out.println("a -= 3: " + a);  
	        
	        
	    }
	    public static void main(String[] args) {
	        Operators obj=new Operators();
	        obj.Arithmetic();
	        obj.Unary();
	        obj.Ternary();
	        obj.Logical();
	        obj.Bitwise();
	        obj.Comparison();
	        obj.Assignment();
	       
	    }

}
