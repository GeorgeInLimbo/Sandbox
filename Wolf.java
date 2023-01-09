package sandbox;

/****

<b>Title:</b> Wolf.java<br>
<b>Project:</b> sandbox<br>
<b>Description:</b>This is the wolf class, which is a subclass of Canine and Animal.<br>
<b>Copyright:</b> Copyright (c) 2023<br>
<b>Company:</b> Silicon Mountain Technologies<br>
@author George Clam
@version 1.0
@since Jan 09 2023
@updates: ****/

public class Wolf extends Canine {
	
	/**
	 * This is the primary constructor for the Wolf class that creates an instance of a Wolf using arguments for name and size.
	 * @param name
	 * @param size
	 */
	public Wolf(String name, int size) {
		this.size = size;
		this.name = name;
		this.isWild = true;
	}
	
	/**
	 * This is a second constructor that does not include parameters and set's default values for size and name. 
	 */
	public Wolf() { 
		this.size = 100;
		this.name = "Wolfy";
		this.isWild = true;
	}
	
	/**
	 * This makeNoise() method utilizes the original method located in the abstract Canine class but also includes a howl that is unique to the Wolf class.
	 */
	@Override
	public void makeNoise() {
		System.out.println("Awoooooo!!!");
		super.makeNoise();  // super keyword calls to the parent class (Canine)
	}
	
	/**
	 * This is an attack method that is specific to the Wolf class
	 */
	public void attack() {
		System.out.println(
				"The wolf bared his teeth at the boy and three other members of his wolfpack emerged from the brush, wild and eager to make a feast of the lonely boy. They slowly stepped toward the boy, their footsteps silent in the snow, and then made chase with their prey.");
	}

}
