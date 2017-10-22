package bean;

public class Q4 {

	public String firstname;
	public int count;
	
	public Q4(String fn, int c) {
		firstname = fn;
		count = c;
	}
	
	public String toString() {
		return String.format("%s %d", firstname, count);
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
