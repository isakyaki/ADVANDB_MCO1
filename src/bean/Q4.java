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

}
