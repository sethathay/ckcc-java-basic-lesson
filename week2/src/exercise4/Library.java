package exercise4;

public class Library {

	// Add the missing implementation to this class
	String address;
	int countBooks = 0;
	// 20 Maximum books in a library
	Book[] bookCollections = new Book[20];
	
	Library(String libraryAddress) {
		address = libraryAddress;
	}
	
	void addBook(Book newBook) {
		bookCollections[countBooks] = newBook;
		countBooks += 1;
	}
	
	void borrowBook(String bookTitle) {
		Book borrowedBook = null;
		for(int i = 0; i < countBooks; i++) {
			if(bookCollections[i].getTitle() == bookTitle) {
				borrowedBook = bookCollections[i];
				break;
			}
		}
		//Can not found book in collections
		if(borrowedBook == null) {
			System.out.println("Can not find the book you want to borrowed");
		}
		//Book is found in collections
		else {
			if(borrowedBook.isBorrowed()) {
				System.out.println("This book '" + bookTitle + "' is not available for borrow.!!");
			}else {
				borrowedBook.borrowed();
				System.out.println("Ok, you has successfully borrowed this book '" + bookTitle + "'");
			}
		}
	}
	
	void returnBook(String bookTitle) {
		Book returnedBook = null;
		for(int i = 0; i < countBooks; i++) {
			if(bookCollections[i].getTitle() == bookTitle) {
				returnedBook = bookCollections[i];
				break;
			}
		}
		//Can not found book in collections
		if(returnedBook == null) {
			System.out.println("Can not find the book you want to return");
		}
		//Book is found in collections
		else {
			returnedBook.returned();
			System.out.println("Ok, you has successfully returned this book '" + bookTitle + "'");
		}
	}
	
	void printAddress() {
		System.out.println(address);
	}
	
	static void printOpeningHours() {
		System.out.println("Open from 8:00 AM to 5PM.");
	}
	
	void printAvailableBooks() {
		if(countBooks == 0) {
			System.out.println("No books in this library");
		}
		
		for(int i = 0; i < countBooks; i++) {
			if(bookCollections[i].isBorrowed() == false) {
				System.out.println("- " + bookCollections[i].getTitle());
			}
		}
	}

    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
	
}
