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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
