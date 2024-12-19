package Day2;

public class StaticVariable {
	static int a=5;
    static void Cube(){
        int cube=a*a*a;
        System.out.println(cube);
        
    }
    public static void main(String[] args) {
        StaticVariable obj=new StaticVariable();
        obj.Cube();
    }

}
