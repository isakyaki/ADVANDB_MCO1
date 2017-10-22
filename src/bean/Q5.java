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

}
