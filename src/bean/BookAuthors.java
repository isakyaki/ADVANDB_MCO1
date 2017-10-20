package bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "bookauthors")
public class BookAuthors {
	
	@Column
	private int BookID;
	@Column
	private String AuthorFirstName;
	@Column
	private String AuthorLastName;
	
	public BookAuthors() {}
	
	public int getBookID() {
		return BookID;
	}
	public void setBookID(int bookID) {
		BookID = bookID;
	}
	public String getAuthorFirstName() {
		return AuthorFirstName;
	}
	public void setAuthorFirstName(String authorFirstName) {
		AuthorFirstName = authorFirstName;
	}
	public String getAuthorLastName() {
		return AuthorLastName;
	}
	public void setAuthorLastName(String authorLastName) {
		AuthorLastName = authorLastName;
	}

	@Override
	public String toString() {
		return "BookAuthors [BookID=" + BookID + ", AuthorFirstName=" + AuthorFirstName + ", AuthorLastName="
				+ AuthorLastName + "]";
	}
	
	

}
