package bean;

public class Q5 {

	public int cardno;
	public String firstname;
	public String address;
	public int branchid;
	public String branchname;
	public String branchaddress;
	
	public Q5(int cn, String fn, String a, int brid, String bn, String ba) {
		cardno = cn;
		firstname = fn;
		address = a;
		branchid = brid;
		branchname = bn;
		branchaddress = ba;
	}
	
	public String toString() {
		return String.format("%d %s %s %d %s %s", cardno, firstname, address, branchid, branchname, branchaddress);
	}

	public int getCardno() {
		return cardno;
	}

	public void setCardno(int cardno) {
		this.cardno = cardno;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getBranchid() {
		return branchid;
	}

	public void setBranchid(int branchid) {
		this.branchid = branchid;
	}

	public String getBranchname() {
		return branchname;
	}

	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}

	public String getBranchaddress() {
		return branchaddress;
	}

	public void setBranchaddress(String branchaddress) {
		this.branchaddress = branchaddress;
	}

}
