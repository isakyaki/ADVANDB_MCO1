package bean;

public class Q7 {

	public int count;
	public String lastname;
	public String firstname;
	public String address;
	
	public Q7(int c, String ln, String fn, String a) {
		count = c;
		lastname = ln;
		firstname = fn;
		address = a;
	}
	
	public String toString() {
		return String.format("%d %s %s %s", count, lastname, firstname, address);
	}

}
