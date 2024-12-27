class Employee{
    void work(String role ){
        
        System.out.println("Role: "+role);
    }
    void salary(int salary){
        
        System.out.println("Salary: "+salary);
    }
}
class HRManager extends Employee{
    @Override
    void work(String role){
        System.out.println("Role: "+role);
        
    }
    void addEmployee(String name,int id){
        
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
    }
}
class Main {
    public static void main(String[] args) {
        Employee obj1=new Employee();
        HRManager obj2=new HRManager();
        obj1.work("HR");
        obj1.salary(50000);
        obj2.addEmployee("Nandhini",23);
        obj2.work("Developer");
    }
}
