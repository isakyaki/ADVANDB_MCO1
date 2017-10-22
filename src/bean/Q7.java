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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
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
