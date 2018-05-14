import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;

	public static void main(String[] args) {
		String p = JOptionPane.showInputDialog("What kind of pet do you want");

		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 5; i++) {

			// (eg: cuddle, food, water, take a walk, groom, clean up poop).
			// Make sure to customize the title and question too.

			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy", "What to do",
					0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "pet", "walk", "feed" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if (task == 0) {
				pet(p);
			}
			if (task == 2) {
				feed(p);
			}
			if (task == 1) {
				walk(p);
			}

			if (happinessLevel > 10) {
				JOptionPane.showMessageDialog(null, "Your pet loves you");
				break; // 6. If you determine the happiness level is large enough, tell the
			}
			// user that he loves his pet and use break; to exit for loop.
		}
	}

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
	static void pet(String p) {
		if (p.equals("cat")) {
			JOptionPane.showMessageDialog(null, "Meow");

		}
		if (p.equals("dog")) {
			JOptionPane.showMessageDialog(null, "Ruff");
		}
		happinessLevel += 2;
	}

	static void feed(String p) {
		if (p.equals("cat")) {
			JOptionPane.showMessageDialog(null, "Purr");

		}
		if (p.equals("dog")) {
			JOptionPane.showMessageDialog(null, "Ruufffff");
		}
		happinessLevel += 1;
	}

	static void walk(String p) {
		if (p.equals("cat")) {
			JOptionPane.showMessageDialog(null, "Hiss");
			happinessLevel -= 1;
		}
		if (p.equals("dog")) {
			JOptionPane.showMessageDialog(null, "Ruufffff");
			happinessLevel += 3;
		}

	}
}
