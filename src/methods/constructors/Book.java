package methods.constructors;

public class Book {
	int bookId;
	String title;
	String author;
	Book(int bookId,String title,String author){
		this.bookId=bookId;
		this.title=title;
		this.author=author;
	}
	Book(Book b){
		this.bookId=b.bookId;
		this.title=b.title;
		this.author=b.author;
	}
	void display() {
		System.out.println("Book Id : "+bookId);
		System.out.println("title of the book : "+title);
		System.out.println("Author of the book : "+author);
	}

	public static void main(String[] args) {
		Book b=new Book(101,"Java Programming","James Gosling");
        b.display();
        Book b1=new Book(b);
        b.display();
		

	}

}
