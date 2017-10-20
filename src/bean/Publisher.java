package bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "publisher")
public class Publisher {
	
	@Column
	private String PublisherName;
	@Column
	private String Address;
	@Column
	private String Phone;
	
	public Publisher() {}

	public String getPublisherName() {
		return PublisherName;
	}

	public void setPublisherName(String publisherName) {
		PublisherName = publisherName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	@Override
	public String toString() {
		return "Publisher [PublisherName=" + PublisherName + ", Address=" + Address + ", Phone=" + Phone + "]";
	}
	
	

}
