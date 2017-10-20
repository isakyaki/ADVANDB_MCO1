package bean;

public class BookAuthors {
	
	private int BookID;
	private String AuthorFirstName;
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
	
	

}
