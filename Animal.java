class Animal{
    void makeSound(){
        System.out.println("Animal makes Sound");
    }
}
class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Cat says meow");
    }
}
class Main {
    public static void main(String[] args) {
        Animal a1=new Animal();
        a1.makeSound();
        Cat c1=new Cat();
        c1.makeSound();
        
    }
}
