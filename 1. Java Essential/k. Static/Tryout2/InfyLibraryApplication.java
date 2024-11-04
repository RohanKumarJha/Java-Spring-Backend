public class InfyLibraryApplication {
    public static void main(String[] args) {
        System.out.println("Total number of books in the library currently are: "+Book.getNoOfBooks());
		Book b1=new Book("The Alchemist");
		System.out.println("BookName: "+b1.bookName+"; bookId: "+b1.bookId);
		Book b2=new Book("The Hunger Games");
		System.out.println("BookName: "+b2.bookName+"; bookId: "+b2.bookId);
		System.out.println("Total number of books in the library currently are: "+Book.getNoOfBooks());
    }
}
