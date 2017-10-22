package bean;

public class Q6 {

	public String title;
	public String lastname;
	public String firstname;
	public String address;
	
	public Q6(String t, String ln, String fn, String a) {
		title = t;
		lastname = ln;
		firstname = fn;
		address = a;
	}
	
	public String toString() {
		return String.format("%s %s %s %s", title, lastname, firstname, address);
	}

}
