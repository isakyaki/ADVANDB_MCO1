package bean;

public class Q1 {

	public int branchid;
	public int bookid;
	public String datereturned;

	public Q1(int brid, int bid, String dr) {
		branchid = brid;
		bookid = bid;
		datereturned = dr;
	}
	
	public String toString() {
		return String.format("%d %d %s", branchid, bookid, datereturned);
	}

	public int getBranchid() {
		return branchid;
	}

	public void setBranchid(int branchid) {
		this.branchid = branchid;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getDatereturned() {
		return datereturned;
	}

	public void setDatereturned(String datereturned) {
		this.datereturned = datereturned;
	}

}
