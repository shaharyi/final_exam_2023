
public class Main1 {

	public static boolean isSubset(char[] a, char[] b) {
		int i = 0;
		for (int j = 0; j < b.length; j++)
			if (i < a.length && a[i] == b[j])
				i++;

		return (i == a.length);
	}
}
