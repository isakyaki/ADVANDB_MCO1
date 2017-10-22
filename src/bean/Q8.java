package bean;

public class Q8 {

	public int count;
	public String branchname;
	public String publishername;
	
	public Q8(int c, String bn, String pn) {
		count = c;
		branchname = bn;
		publishername = pn;
	}
	
	public String toString() {
		return String.format("%d %s %s", count, branchname, publishername);
	}

}
