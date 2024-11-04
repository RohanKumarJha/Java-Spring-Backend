public class Book {
    String bookId;
    String bookName;
    private static int noOfBooks=1000;

    public Book(String bookName) {
		noOfBooks++;
		this.bookId="B"+noOfBooks;
		this.bookName=bookName;
	}
    public static int getNoOfBooks() {
		return noOfBooks;
	}
}