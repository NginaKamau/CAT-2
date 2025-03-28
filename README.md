**Name** :Kamau Loise Ngina 

**Admission Number** :166322

This is my explanation for my submission of CAT 2

<ins>**Encapsulation**</ins>

The attributes in the class Student are declared private which makes them not directly accessible outside the class.

The setName(String name) is used to update the name attribute and the setGrade(int grade) ensures that the valid grades that are within the limits is what is assigned and if it is invalid,it defaults to 0.

The displayStudent() method prints student details.

<ins>**Method Overloading and Overriding**</ins>

<ins>**Method Overloading**</ins>

The class MathOperations defines two multiply() methods:

One of the method takes two intergers and returns the product.

The other method on the other hand takes three integers and returns their product.

This demonstrates method overloading where multiple methods have the same name but different parameters.

<ins>**Method Overriding and Polymorphism**</ins>

The class Animal has a method called makeSound().

Subclasses called Cat and Dog are created to inherit the method from the Animal class and provide their own implementations of the method.

It is tested in the Main class where objects myDog and MyCat are created and invoke the overridden methods in Dog and Cat.

<ins>**Abstraction**</ins>

The abstract class Appliance defines the abstract method turnOn() which has no body.

The subclasses Fan and TV are created to give body to the abstract method turnOn().

For instance,the subclass Fan overrides the method to print "Upon turned on,the fan is currently spinning".

In the main class,objects of the subclass are created to test the implementation of abstraction. Upon calling the method, it is able to execute their respective implementations.

<ins>**Exception Handling**</ins>

In the class Division,we will use scanner which allows inputs from the user.

After the inputs is got from the user, the code attempts to divide the first number by the second number inside a try block.

If the second number is a 0, an ArithmeticException is thrown.

The catch block catches the ArithmeticExpression and prints a meaningful message "Cannot divide by zero!" instead of the whole program crashing because of an error.







