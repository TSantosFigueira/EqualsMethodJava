/**
 * Example class for a Pet
 * This class holds the name of the pet and the name of its owner
 */
class Pet
{
    private String name;
    private String humanOwner;
    
    public Pet(String name, String humanOwner)
    {
        this.name = name;
        this.humanOwner = humanOwner;
    }
    
    @Override
    public boolean equals(Object obj)
    {
    	try 
    	{
    		// cast object to type Pet
    		Pet anotherPet = (Pet)obj;
    		// compare strings using the 'equalsIgnoreCase' method, which returns true if
    		// two strings are equal, ignoring case considerations
    		if(name.equalsIgnoreCase(anotherPet.name) && 
    				humanOwner.equalsIgnoreCase(anotherPet.humanOwner))
    		{
    			return true;
    		}
    		
    		return false;
    	}
    	catch(Exception e)
    	{
    		// there is an exception if the parameter obj is null or not of type Pet
    		return false;
    	}
    }
}

public class OverridenEqualsJava
{
	public static void main(String[] args) 
	{
	    // create a new pet
		Pet dog = new Pet("Max", "Thiago");
		
		// create another pet
        Pet anotherDog = new Pet("Cooper", "Thiago");
		 
        // test the overridden behavior of the equals method passing an object as an argument
        // the output is false because both variables reference the different pets under the 
        // same owner
		System.out.println(dog.equals(anotherDog)); 	
	}
}