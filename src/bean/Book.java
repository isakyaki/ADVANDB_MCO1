package bean;

public class Book {
	
	
	private int BookID;
	private String Title;
	private String PublisherName;
	
	public Book() {}
	
	public int getBookID() {
		return BookID;
	}
	public void setBookID(int bookID) {
		BookID = bookID;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getPublisherName() {
		return PublisherName;
	}
	public void setPublisherName(String publisherName) {
		PublisherName = publisherName;
	}

}
