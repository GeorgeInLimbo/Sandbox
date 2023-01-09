package sandbox;

/****
 * 
 * <b>Title:</b> Owl.java<br>
 * <b>Project:</b> sandbox<br>
 * <b>Description:</b>The Owl class is unique because it is a subclass of the
 * Animal class only, rather than having an additional parent class like the
 * Canine class<br>
 * <b>Copyright:</b> Copyright (c) 2023<br>
 * <b>Company:</b> Silicon Mountain Technologies<br>
 * 
 * @author George Clam
 * @version 1.0
 * @since Jan 09 2023
 * @updates:
 ****/

public class Owl extends Animal {

	public Owl() {
		this.isWild = true;
		this.size = 4;
		this.name = "James";
	}

	/**
	 * The snowy owl does not make an eerie noise like the Great Horned Owl or
	 * something magestic like a hawk. It screetches. This method implements that
	 * functionality.
	 */
	public void makeNoise() {
		System.out.println("'SCREETCH!'");
	}

	/**
	 * A snowy owl attack functionality represents it methods for taking down prey
	 * or fending off adversaries.
	 */
	public void attack() {
		System.out.println("The owl jumped into the air and flew just below the forest canopy until it silently swooped from above and attacked a small field mouse with its talons.");
	}

}
