package test2;

public class BookStore
{
	public static void main(String[] args) 
	{
		Book booklist[] = new Book[5];

		Book book1 = new Book("Java Program", 25000);
		Book book2 = new Book("JSP Program", 15000);
		Book book3 = new Book("SQL Fundamentals", 30000);
		Book book4 = new Book("JDBC Program", 28000);
		Book book5 = new Book();
		book5.setTitle("EJB Program");
		book5.setPrice(34000);
		booklist[0] = book1;
		booklist[1] = book2;
		booklist[2] = book3;
		booklist[3] = book4;
		booklist[4] = book5;
		
		BookMgr mgr = new BookMgr(booklist);
		System.out.println("=== 책 목록 ===");
		mgr.printBookList();
		System.out.println("");
		System.out.println("=== 책 가격의 총합 ===");
		mgr.printTotalPrice();
	}
}

class Book
{	
	private String title;
	private int price;
	
	// Source - Generate Constructor from Superclass ...0
	Book()	{}
	
	Book(String title, int price)
	{
		this.title = title;
		this.price = price;
	}
	
	public void   setTitle(String Title) {	this.title = Title;	}
	public void   setPrice(int price)	 {	this.price = price;	}	
	public String getTitle()			 {	return title;		}
	public int    getPrice()			 {	return price;		}
}

class BookMgr
{
	Book booklist[];
	
	BookMgr(Book[] booklist)
	{
		this.booklist = booklist;		
	}
	
	void printBookList()
	{
		// booklist    : 배열
		// booklist[0] : Book 타입
		// booklist[0-4].title : 책제목 String
		
		for(Book b : booklist)
		{
			System.out.println(b.getTitle() + " " + b.getPrice());
		}
	}
	
	void printTotalPrice()
	{
		int totalPrice = 0;
		
		for(Book b : booklist)
		{
			totalPrice += b.getPrice();
		}
		
		System.out.println(totalPrice);
	}
}