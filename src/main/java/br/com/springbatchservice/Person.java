package br.com.springbatchservice;

public class Person {
    
    private String lastName;
    private String firstName;
    
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public Person() {
        
    }
    
    public String getLastName() {
        
        return lastName;
    }
    public void setLastName(String lastName) {
        
        this.lastName = lastName;
    }
    public String getFirstName() {
        
        return firstName;
    }
    public void setFirstName(String firstName) {
        
        this.firstName = firstName;
    }
    @Override
    public String toString() {
        
        return "Person [lastName=" + lastName + ", firstName=" + firstName + "]";
    }
}
