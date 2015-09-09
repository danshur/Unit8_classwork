package classwork;

public class Test {
    public static void main(String[] args) {
   	 Person robert = new Person("Robert", "Redford");
   	 Dog shadow = new Dog("Shadow", robert);
   	 robert.setName("Robert", "De Niro");
   	 shadow.sayHello();
   	 robert = new Person("Robert", "Downey Jr");
   	 shadow.sayHello();
    }
}
