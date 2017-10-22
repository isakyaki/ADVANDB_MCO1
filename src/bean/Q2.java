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

	public int getCardno() {
		return cardno;
	}

	public void setCardno(int cardno) {
		this.cardno = cardno;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getDuedate() {
		return duedate;
	}

	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}

	public String getDatereturned() {
		return datereturned;
	}

	public void setDatereturned(String datereturned) {
		this.datereturned = datereturned;
	}

}
