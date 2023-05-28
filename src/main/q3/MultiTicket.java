
public class MultiTicket {
	private String owner;
	private MyDate start;
	private MyDate [] entries;
	private int current;

	public int EntriesInMonth (int month);
	
	public boolean AddEntry(MyDate entry) {
		if (current < 30 && entry.diffDays(start) <= 365) {
			entries[current] = entry;
			current++;
			return true;
		}
		return false;
	}
}
