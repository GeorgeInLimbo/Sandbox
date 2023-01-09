package sandbox;

/****
 * 
 * <b>Title:</b> Animal.java<br>
 * <b>Project:</b> sandbox<br>
 * <b>Description:</b>Animal is a parent class for all animal objects (Canine,
 * Wolf, Dog, and Owl). Animal is an abstract class.<br>
 * <b>Copyright:</b> Copyright (c) 2023<br>
 * <b>Company:</b> Silicon Mountain Technologies<br>
 * 
 * @author George Clam
 * @version 1.0
 * @since Jan 09 2023
 * @updates:
 ****/

public abstract class Animal {
	boolean isWild;
	int size;
	String name;

	public abstract void makeNoise();
	public abstract void attack();
}