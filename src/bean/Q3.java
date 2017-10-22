package bean;

public class Q3 {

	public String lastname;
	public String firstname;
	public int count;
	public String address;
	
	public Q3(String ln, String fn, int c, String a) {
		lastname = ln;
		firstname = fn;
		count = c;
		address = a;
	}
	
	public String toString() {
		return String.format("%s %s %d %s", lastname, firstname, count, address);
	}

}
