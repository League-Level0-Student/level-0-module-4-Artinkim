
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import java.io.IOException;
import java.util.Scanner;

public class PiAloud {
	public static void main(String[] args) {

		String pi = "3.14159265358979323846264338327950288419";// 2. Make a String variable to hold the value of Pi. You

		// could use http://www.piday.org/million/ for the
		// value.

		System.out.println(pi.charAt(0));
		System.out.println(pi.charAt(1));

		for (int i = 0; i < pi.length(); i++) {
			char u = getInputFromUser();
			if (u == pi.charAt(i)) {
				System.out.println("Correct");
			} else {
				System.out.println("Incorrect");
			}
			System.out.println(pi.charAt(i));
			speak(pi.charAt(i));

		}
	}

	// 5. Use the speak() method to speak all the digits of Pi.

	// [ADVANCED]
	// *6. Get a character from the user using the getInputFromUser() method
	// *7. Compare the users' char to the next digit of Pi
	// *8. If they are correct, print out "correct". If they are not, print
	// "incorrect" to System.err.println

	static void speak(char characterToSpeak) {
		try {
			Runtime.getRuntime().exec("say " + characterToSpeak).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void pause(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	static char getInputFromUser() {
		Scanner scanner = new Scanner(System.in);
		return scanner.next().toCharArray()[0];
	}

}
