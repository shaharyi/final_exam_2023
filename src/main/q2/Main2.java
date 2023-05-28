import java.util.Scanner;

public class Main2 {
	static Scanner input = new Scanner(System.in);

	public static Pair[] getPairs() {
		Pair[] a = new Pair[20];
		System.out.println("Please enter 20 numbers, each in range 1-7:");
		for (int i = 0; i < a.length; i++) {
			a[i] = new Pair(input.nextInt());
		}
		return a;
	}

	/*
	 * Using ">=" to return the last maximum we find
	 */
	public static int maxDigits(Pair[] a) {
		int imax = 0;
		for (int i = 1; i < a.length; i++)
			if (a[i].getDigits() >= a[imax].getDigits())
				imax = i;
		return a[imax].getNum();
	}
}
