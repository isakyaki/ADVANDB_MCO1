package bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "borrower")
public class Borrower {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CardNo;
	@Column
	private String BorrowerLName;
	@Column
	private String BorrowerFName;
	@Column
	private String Address;
	@Column
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

	@Override
	public String toString() {
		return "Borrower [CardNo=" + CardNo + ", BorrowerLName=" + BorrowerLName + ", BorrowerFName=" + BorrowerFName
				+ ", Address=" + Address + ", Phone=" + Phone + "]";
	}
	
	

}
