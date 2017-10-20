package bean;

import java.sql.Date;

public class BookLoans {
	
	private int BookID;
	private int BranchID;
	private int CardNo;
	private Date DateOut;
	private Date DueDate;
	private Date DateReturned;
	
	public BookLoans() {}
	
	public int getBookID() {
		return BookID;
	}
	public void setBookID(int bookID) {
		BookID = bookID;
	}
	public int getBranchID() {
		return BranchID;
	}
	public void setBranchID(int branchID) {
		BranchID = branchID;
	}
	public int getCardNo() {
		return CardNo;
	}
	public void setCardNo(int cardNo) {
		CardNo = cardNo;
	}
	public Date getDateOut() {
		return DateOut;
	}
	public void setDateOut(Date dateOut) {
		DateOut = dateOut;
	}
	public Date getDueDate() {
		return DueDate;
	}
	public void setDueDate(Date dueDate) {
		DueDate = dueDate;
	}
	public Date getDateReturned() {
		return DateReturned;
	}
	public void setDateReturned(Date dateReturned) {
		DateReturned = dateReturned;
	}

}
