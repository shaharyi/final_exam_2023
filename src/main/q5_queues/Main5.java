
public class Main5 {
	  public static Queue<Integer> getCopy(Queue<Integer> q){
		    Queue<Integer> retQ = new Queue <Integer>();
		    Queue<Integer> backup = new Queue <Integer>();
		    while (!q.isEmpty()){
		      backup.insert(q.head());
		      retQ.insert(q.remove());
		    }
		    while (!backup.isEmpty())
		      q.insert(backup.remove());    
		    return retQ;
		  }

	/*
	 * Complexity: O(n) where n is the size of q1.
	 * Because we scan q1 and q2 only once, and O(2n) = O(n).
	 * We visit every cell of the input just once.
	 */
	public static boolean ex5A(Queue<Integer> q1, Queue<Integer> q2, int n) {
		
		Queue<Integer> q = new Queue<Integer>();
		Queue<Integer> q1c = getCopy(q1);
		Queue<Integer> q2c = getCopy(q2); 
		
		while (!q1c.isEmpty()) {
			for (int i = 0; i < n; i++) {
				q.insert(q1c.remove());
				q.insert(q2c.remove());
			}
		}
		
		int p = q.remove();
		while (!q.isEmpty()) {
			if (q.head() < p)
				return false;
			p = q.remove();
		}
		return true;
	}
	
	public static boolean ex5B(Queue<Integer> q1, Queue<Integer> q2) {
		Queue<Integer> q1c = getCopy(q1);	
		int n = 0;
		while (!q1c.isEmpty() && q1c.remove() < q2.head())
			n++;
		return ex5A(q1, q2, n);
	}
}
