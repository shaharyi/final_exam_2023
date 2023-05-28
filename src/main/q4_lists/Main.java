
public class Main {

	public static void main(String[] args) {
	}

	public static Node<Demonstration> getMaxMin(Node<Demonstration> lstD, char ch) {
		Node<Demonstration> ret = lstD;
		int best = ret.getValue().rating();
		while (lstD != null) {
			int rating = lstD.getValue().rating();
			if (ch == 's' && best > rating || ch == 'b' && best < rating) {
				best = rating;
				ret = lstD;
			}
			lstD = lstD.getNext();
		}
		return ret;
	}

	/*
	 * Return node just before x. 
	 * prev = previous
	 */
	public static <T> Node<T> getPrev(Node<T> p, Node<T> x) {
		while (p.hasNext()) {
			if (p.getNext() == x)
				return p;
			p = p.getNext();
		}
		return null;
	}

	/*
	 * It is given that the number of speakers is even: |lstS| % 2 == 0 
	 * So every time we take out 2 speakers from the list.
	 *
	 * Complexity: O(m*n) for <m,n> sizes of speakers and demonstrations.
	 * because for each speaker, we use getMaxMin which is O(n).
	 *
	 * Or we can say O(n^2)
	 * If we say n is the maximum of speaker and demonstration lists.
	 */
	public static void addSp(Node<Demonstration> lstD, Node<Speaker> lstS) {
		Node<Speaker> p = lstS, bestS, lastS;
		Node<Demonstration> d;
		while (p != null) {
			bestS = getPrev(p, null);
			d = getMaxMin(lstD, 's');
			lastS = getPrev(d.getValue().getLstSpkr(), null);
			lastS.setNext(bestS);
			getPrev(p, lastS).setNext(null);

			d = getMaxMin(lstD, 'b');
			lastS = getPrev(d.getValue().getLstSpkr(), null);
			lastS.setNext(p);
			p = p.getNext();
			lastS.getNext().setNext(null);
		}
	}
}
