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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
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

}
