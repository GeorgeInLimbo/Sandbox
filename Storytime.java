package sandbox;

/****
 * 
 * <b>Title:</b> Storytime.java<br>
 * <b>Project:</b> sandbox<br>
 * <b>Description:</b>This is the Storytime class for the program which takes
 * all the data from the animal classes and uses it in a story about a boys trip
 * through the mountain forests of the Western Slope.<br>
 * <b>Copyright:</b> Copyright (c) 2023<br>
 * <b>Company:</b> Silicon Mountain Technologies<br>
 * 
 * @author George Clam
 * @version 1.0
 * @since Jan 09 2023
 * @updates:
 ****/

public class Storytime {

	/**
	 * This is the main method the executes each method which is responsible for a
	 * portion of the story
	 * 
	 * @param arg
	 */

	public static void main(String[] arg) {
		Storytime story = new Storytime();
		story.meetOwl();
		story.meetWolf();
		story.meetDog();
	}

	/**
	 * This is a method that serves to execute the first portion of the story and
	 * uses data from the Owl class.
	 */
	public void meetOwl() {
		Owl owl = new Owl();

		System.out.println(
				"Snow fell gently in the mountains where a snowy owl stand perched upon a conifer. The cold was piercing and the only sound was the crunch of the snow just past the clearing.");
		System.out.println(
				"A young boy drags his tired legs through the deep powder until he spots the owl. The yellow in the bird's iris stared into the boy. 'I am "
						+ owl.name + ".'");
		System.out.println("'I am George,' said the boy. 'You are not a very big owl but yet I am told to fear you.'");
		System.out.println("The owl was unphased. 'I am a modest " + owl.size
				+ " pounds, but if you were to ask if I was wild, I would say that that is " + owl.isWild + ".'");
		System.out.println(
				"You cannot control a wild thing and you cannot know its rules. Yet still, it feels desperation and hunger and vindication just like you. Be weary of any wild thing that calls itself your ally");
		System.out.println("Good luck to you, George.");
		owl.makeNoise();
		System.out.print(" said the owl.");
		owl.attack();
		System.out.println();
	}

	/**
	 * This is a method that serves to execute the second portion of the story and
	 * uses data from the Wolf class.
	 */

	public void meetWolf() {
		Wolf wolf = new Wolf("Chris", 110);

		System.out.println(
				"The boy watched the owl fly silently into the brush of the forest and it was quiet again until a grumble from the boy's stomach broke the silence.");
		System.out.println(
				"He walked for miles while his hunger and the crunching of his footsteps continued to disrupt the serenity of the winter forest. 'Hello'");
		System.out.println(
				"Startled, the boy turned around and saw a timberwolf that must have been " + wolf.size + " pounds");
		wolf.makeNoise();
		System.out.println("The wolf spoke with a quiet intensity, 'I am " + wolf.name
				+ ". I have heard your hunger and think that perhaps we could improve this situation.'");
		System.out.println(
				"'I've been warned of trusting something that is wild. I respect you wolf, but I am weary of making you an ally.' the precocious boy declared.");
		System.out.println("'You are a clever boy and it is " + wolf.isWild
				+ " that I am wild. I suppose that wretched owl thinks he has talked me out of a meal...'");
		System.out.println("The wolf bared his teeth.");
		wolf.attack();
		System.out.println(
				"The boy quickly turned and ran but his speed was no match for the hungry wolves. Thinking quickly, he climbed the conifer tree where the wolves were not able to follow.");
		System.out.println(
				"The frustrated wolf pack growled and scratched the bark of the trunk below but the boy, clever and desperate, made his way through the thick forest, traversing from branch to branch until the wolves were no longer in sight.");
		System.out.println();
	}

	/**
	 * This is a method that serves to execute the third portion of the story and
	 * uses data from the Dog class.
	 */

	public void meetDog() {
		Dog dog = new Dog("Buck", 50);

		System.out.println(
				"The boy's legs were weak and his lungs desperately drew air, trying to replenish what his body had lost in his journey home. He finally came upon a humble cabin in the woods where a familiar face wait for his arrival.");
		dog.makeNoise();
		System.out.println("At the door, he was greeted by a loyal friend. George's dog was named " + dog.name
				+ ". Buck was " + dog.size + " pounds and 100% loyal and gentle.");
		dog.beFriendly();
		System.out.println(
				"The tired boy sat beside the fire with his companion and pondered the lessons of the owl and reflected on his relief that he was finally home.");
	}

}
