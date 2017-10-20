package bean;

import java.sql.Date;

import javax.persistence.Column;

public class BookLoans {
	
	@Column
	private int BookID;
	@Column
	private int BranchID;
	@Column
	private int CardNo;
	@Column
	private Date DateOut;
	@Column
	private Date DueDate;
	@Column
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

	@Override
	public String toString() {
		return "BookLoans [BookID=" + BookID + ", BranchID=" + BranchID + ", CardNo=" + CardNo + ", DateOut=" + DateOut
				+ ", DueDate=" + DueDate + ", DateReturned=" + DateReturned + "]";
	}

}
