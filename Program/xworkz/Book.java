class Book
{
String title;
double price;
int quantity;
String author;
public Book() 
{
}
public static void main(String[] args)
{
Book book = new Book();
book.title = "classmate";
System.out.println(book.title);
book.setTitle("rio");
System.out.println(book.title);

Book book1 = new Book();
book1.setTitle("abc");
System.out.println(book1.title);

Book book2 = new Book();
book2.price = 200;
System.out.println(book2.price);
book2.setPrice(150);
System.out.println(book2.price);

Book book3 = new Book();
book3.quantity = 2;
System.out.println("book3.quantity");
book3.setQuantity(3);
System.out.println(book3.quantity);

Book book4 = new Book();
book4.author = "rama";
System.out.println("book4.author");
book4.setAuthor("rana");
System.out.println("book4.author");
}

public void setTitle(String bookTitle)
{
	title = bookTitle;
}
public void setPrice(int book2Price)
{
	price = book2Price;
}
public void setQuantity(int book3Quantity)
{
	quantity = book3Quantity;
}
public void setAuthor(String book4Author)
{
	author = book4Author;
}
public String getTitle()
{
return title;
}
public double getPrice()
{
	return price;
}
public int getQuantity()
{
	return quantity;
}
public String getAuthor()
{
	return author;
}

public String bookDetails()
{
return "Book details:" + title + "price" + price + "quantity" + quantity + "author" + author ;
}	
}