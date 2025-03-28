public class Main {
    public static void main(String[]args){

        //Demonstrates encapsulation
        Student student1=new Student("Ngina",85);
        Student student2=new Student("Alvin",300);

        student1.displayStudent();
        student2.displayStudent();

        //Demonstrates polymorphism
        MathOperations math = new MathOperations();
        System.out.println("Multiplication of 2 numbers: " + math.multiply(2, 3));
        System.out.println("Multiplication of 3 numbers: " + math.multiply(2, 3, 7));

        // Testing method overriding
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound();
        myCat.makeSound();

        //Demonstrates abstraction
        Appliance myFan = new Fan();
        Appliance myTV = new TV();

        myFan.turnOn();
        myTV.turnOn();
    }







}
