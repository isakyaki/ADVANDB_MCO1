package bean;

public class Q2 {

	public int cardno;
	public int bookid;
	public String duedate;
	public String datereturned;
	
	public Q2(int cn, int bid, String dd, String dr) {
		cardno = cn;
		bookid = bid;
		duedate = dd;
		datereturned = dr;
	}
	
	public String toString() {
		return String.format("%d %d %s %s", cardno, bookid, duedate, datereturned);
	}

}
