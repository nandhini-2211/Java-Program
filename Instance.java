class Student {
    String name;
    String department;
    int age;

    public Student(String name, String department, int age) {
        this.name = name;
        this.department = department;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Department: " + department);
        System.out.println("Student Age: " + age);
    }
}

class Main {
    public static void main(String[] args) {
        Student student = new Student("Nandhini", "MCA", 23);
        student.displayDetails();
    }
}
