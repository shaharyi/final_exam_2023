
public class Pair {
	private int num;
	private int digits;

	public int getNum() {
		return num;
	}

	public int getDigits() {
		return digits;
	}

	public Pair(int digits) {
		this.digits = digits;
		num = 0;
		int d = (int) (Math.random() * 9) + 1;
		int m = 1;
		for (int i = 0; i < digits; i++) {
			num = num + m * d;
			m = m * 10;
		}
	}
	
}
