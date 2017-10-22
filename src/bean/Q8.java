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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getBranchname() {
		return branchname;
	}

	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}

	public String getPublishername() {
		return publishername;
	}

	public void setPublishername(String publishername) {
		this.publishername = publishername;
	}

}
