package sandbox;

/****
 * 
 * <b>Title:</b> Dog.java<br>
 * <b>Project:</b> sandbox<br>
 * <b>Description:</b>This is the Dog class that creates and instance of Dog.
 * Dog is a subclass of Canine (and Animal) and implements the Pet
 * interface.<br>
 * <b>Copyright:</b> Copyright (c) 2023<br>
 * <b>Company:</b> Silicon Mountain Technologies<br>
 * 
 * @author George Clam
 * @version 1.0
 * @since Jan 09 2023
 * @updates:
 ****/

public class Dog extends Canine implements Pet {

	/**
	 * Constructor that takes a name and size arguments to create an instance of
	 * Dog.
	 * 
	 * @param name
	 * @param size
	 */
	public Dog(String name, int size) { // The Dog class requires name and size parameters to create a instance
		this.size = size;
		this.name = name;
		this.isWild = false;
	}

	/**
	 * Because a dog is a Pet, it is given a beFriendly() method declared in the Pet
	 * interface
	 */
	public void beFriendly() {
		System.out.println("The dog placed his head beside the boy's hand to politely ask for a scratch behind the ear.");
	}

	/**
	 * A Dog is an animal, and all animals may get hungry or need to defend
	 * themselves.
	 */
	public void attack() {
		System.out.println("The hair stands up on the dog's neck and the dog bares its teeth and growls.");
	}

}
