
public class Main3 {

	public static int total(MultiTicket[] a, int month) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i].EntriesInMonth(month);
		}
		return sum;
	}
}
