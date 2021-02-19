/**
 * Example class for a Pet
 * This class holds the name of the pet and the name of its owner
 */
class Pet
{
    private String name;
    private String humanOwner;
    
    public Pet (String name, String humanOwner)
    {
        this.name = name;
        this.humanOwner = humanOwner;
    }
}

public class EqualsExample
{
	public static void main(String[] args) 
	{
	    // create a new pet
		Pet dog = new Pet("Max", "Thiago");
		// create another pet that references the previous one
        Pet anotherDog = dog;
		 
        // test the default behavior of the equals method passing an object as an argument
        // the output is true because both variables reference the same memory location
		System.out.println(dog.equals(anotherDog)); 	
	}
}