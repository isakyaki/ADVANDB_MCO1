package bean;

public class Borrower {
	
	private int CardNo;
	private String BorrowerLName;
	private String BorrowerFName;
	private String Address;
	private String Phone;
	
	public Borrower() {}

	public int getCardNo() {
		return CardNo;
	}

	public void setCardNo(int cardNo) {
		CardNo = cardNo;
	}

	public String getBorrowerLName() {
		return BorrowerLName;
	}

	public void setBorrowerLName(String borrowerLName) {
		BorrowerLName = borrowerLName;
	}

	public String getBorrowerFName() {
		return BorrowerFName;
	}

	public void setBorrowerFName(String borrowerFName) {
		BorrowerFName = borrowerFName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}
	
	

}
