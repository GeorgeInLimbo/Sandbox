package sandbox;

/****
 * 
 * <b>Title:</b> Canine.java<br>
 * <b>Project:</b> sandbox<br>
 * <b>Description:</b>A subclass of Animal but a parent class to both Wolf and Dog. Implements similar functionality with regard to the noises that all canines make.<br>
 * <b>Copyright:</b> Copyright (c) 2023<br>
 * <b>Company:</b> Silicon Mountain Technologies<br>
 * 
 * @author George Clam
 * @version 1.0
 * @since Jan 09 2023
 * @updates:
 ****/

public abstract class Canine extends Animal {

	public void makeNoise() {
		System.out.println("Bark! Bark!");
	}

}
