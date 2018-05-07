
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		/* You MUST use the above boolean variables in your code */

		int q = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
		int q2 = JOptionPane.showConfirmDialog(null, "Is it Vacation?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
		if (q == 0) {
			isWeekday = true;
		} else {
			isWeekday = false;
		}
		if (q2 == 0) {
			isVacation = true;
		} else {
			isVacation = false;
		}
		if (isVacation == true && isWeekday == true) {
			JOptionPane.showMessageDialog(null, "sleep in");
		}
		if (isVacation == true && isWeekday == false) {
			JOptionPane.showMessageDialog(null, "sleep in");
		}
		if (isVacation == false && isWeekday == false) {
			JOptionPane.showMessageDialog(null, "sleep in");
		}
		if (isVacation == false && isWeekday == true) {
			JOptionPane.showMessageDialog(null, "wake up sleepy bones");
		}

		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday, print
		 * “get up lazybones!” If it is a weekday, and we are on vacation, print “sleep
		 * in”.
		 */
	}
}
