package classwork;

public class Dog {
    private Person owner;
    private String name;
    
    public Dog(String name, Person owner) {
   	 this.name = name;
   	 this.owner = owner;
    }
    public void sayHello() {
      	 System.out.println("My owner is " + owner.getName());
       }
   }

