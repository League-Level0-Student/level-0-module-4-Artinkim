import javax.swing.JOptionPane;

public class Choose_your_own_path {
	public static void main(String[] args) {
		int q = JOptionPane.showOptionDialog(null, "Which direction do you want to go", "What to do", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "right", "Keep walking forward", "left" }, null);
		if (q == 0) {
			q = JOptionPane.showOptionDialog(null,
					"You see a chest up ahead a door to the right and a ladder to the left.Which direction do you want to go",
					"What to do", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "climb the ladder", "Keep walking forward", "right" }, null);
			if (q == 0) {
				JOptionPane.showMessageDialog(null, "You start to climb the ladder and fall knocking yourself out");
			}
			else if (q == 1) {
				JOptionPane.showMessageDialog(null,
						"You get to the chest and you get the legendary zelda sword. YOU WIN!!!");
			}
			else if (q == 2) {
				JOptionPane.showMessageDialog(null,
						"You open the door and get hit by the bucket of water on top. The end");
			}

		} else if (q == 1) {
			q = JOptionPane.showOptionDialog(null,
					"You see a person in front of you, and wall to your sides. Which direction do you want to go",
					"What to do", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Keep walking forward", "RUN!!!" }, null);

			if (q == 0) {
				q = JOptionPane.showOptionDialog(null,
						"You see a person? in front of you, and wall to your sides. Which direction do you want to go",
						"What to do", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "Keep walking forward", "RUN!!!" }, null);
				if (q == 1) {
					JOptionPane.showMessageDialog(null, "You try to turn back and fall in a pit. THE END");
				}
				else if (q == 0) {
					q = JOptionPane.showOptionDialog(null,
							"You see a creature in front of you, and wall to your sides.You dont have control over your legs anymore. Which direction do you want to go",
							"What to do", 0, JOptionPane.INFORMATION_MESSAGE, null,
							new String[] { "Keep walking forward" }, null);
					if (q == 0) {
						JOptionPane.showMessageDialog(null,
								"The creature rushes up towards you and you die without it even touching you");
					}
				}
			}
			if (q == 1) {
			}
		} else if (q == 2) {
			q = JOptionPane.showOptionDialog(null,
					"You see a ghost hovering towards you. Which direction do you want to go", "What to do", 0,
					JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "RUN!!!", "Get closer", "Go into the room on your left" }, null);
			JOptionPane.showMessageDialog(null,"You start try to move, but you cant. Then you wake up and it was all a dream");

		}
	}

}
