//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {
String n = JOptionPane.showInputDialog("How many nickels do you have");
		int n2 = Integer.parseInt(n);

		String d = JOptionPane.showInputDialog("How many dimes do you have");
		int d2 = Integer.parseInt(d);

		String q = JOptionPane.showInputDialog("How many quarters do you have");
		int q2 = Integer.parseInt(q);
double money = n2*.05+d2*.1+q2*.25;
		// Calculate how much money the user has and save it in a double variable 

		JOptionPane.showMessageDialog(null, "You have $"+money);

	}
}

