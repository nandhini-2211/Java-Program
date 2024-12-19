package Day2;

public class InstanceVariable {
	 int a=20;
	    int b=5;
	    public void Multiply(){
	        int mul=a*b;
	        System.out.println(mul);
	    }
	    public static void main(String[] args) {
	        InstanceVariable obj=new InstanceVariable();
	        obj.Multiply();
	    }

}
