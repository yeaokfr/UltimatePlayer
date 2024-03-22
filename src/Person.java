public class Person {

    //variables
    private String firstName;
    private String lastName;

    //constructor
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Accessors (Getters)
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String toString(){
        return "Name: " + getLastName() + " " + getFirstName();
    }

    //Mutators
    public int throwDisc(int pow){
        return 2*pow;
    }
}