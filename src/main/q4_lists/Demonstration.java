
public class Demonstration {
	
	private String place; 
	private Node<Speaker> lstSpkr;
	
	public Demonstration(String place) {
		this.place = place;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public Node<Speaker> getLstSpkr() {
		return lstSpkr;
	}
	public void setLstSpkr(Node<Speaker> lstSpkr) {
		this.lstSpkr = lstSpkr;
	}
	
	public int rating() {
		int sum = 0;
		Node<Speaker> p = lstSpkr;
		while (p!=null) {
			sum += p.getValue().getRating();
			p = p.getNext();
		}
		return sum;
	}
}
