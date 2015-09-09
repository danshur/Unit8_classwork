package classwork;

public class Person {
    private String firstName;
    private String lastName;
    
    public Person(String first, String last) {
   	 this.firstName = first;
   	 this.lastName = last;
    }
    
    public void setName(String first, String last) {
   	 this.firstName = first;
   	 this.lastName = last;
    }
    
    public String getName() {
   	 return firstName + " " + lastName;
    }
}
