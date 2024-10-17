package Abstract;

//Abstract class A01
abstract class A01 {
 // Abstract method message
 abstract void message();
}
//Concrete subclass of A01
public class FirstSubclass extends A01 {
 @Override
 public void message() {
     System.out.println("This is the first subclass");
 }
}
//Concrete subclass of A01
public class SecondSubclass extends A01 {
 @Override
 public void message() {
     System.out.println("This is the second subclass");
 }
}
//Main class to test the subclasses
public class Main {
 public static void main(String[] args) {
     // Create an instance of FirstSubclass
     A01 first = new FirstSubclass();
     first.message(); // Output: This is the first subclass
     
     // Create an instance of SecondSubclass
     A01 second = new SecondSubclass();
     second.message(); // Output: This is the second subclass
 }
}
