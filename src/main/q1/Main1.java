
public class Main1 {
	/*
	 * No duplicates in both a, b.
	 * Return "Is a contained in b in order?"
	 */
	public static boolean isOrderlyContained(char[] a, char[] b) {
		int i = 0;
		for (int j = 0; j < b.length && i < a.length; j++)
			if (a[i] == b[j])
				i++;

		return (i == a.length);
	}
}
