
public class Main1 {
	/*
	 * No duplicates in both a, b.
	 * Return "Is a contained in b in order?"
	 */
	public static boolean isOrderlyContained(char[] a, char[] b) {
		int i = 0, j = 0;
		while (j < b.length && i < a.length) {
			if (a[i] == b[j])
				i++;
			j++;
		}

		return (i == a.length);
	}
}
