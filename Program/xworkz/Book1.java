class Book1 {

String name;
int size;
double price;
boolean smart;
String color;
  
static long length;


 Book1 (){
}

public static void main(String[] args){

Book1 book = new Book1();
book.name = "classment";
System.out.println("Book Name is : " + book.name);

Book1  book1 = new Book1();
book1.size = 10;
System.out.println("Book Size is :" + book1.size);

Book1 book2 =new Book1();
book2.price = 152.2;
System.out.println("Book Price is : " +book2.price);

Book1 book3 = new Book1();
book3.smart = true;
System.out.println("The Book is Smart : " + book3.smart);

Book1 book4 = new Book1();
book4.color= "blue";
System.out.println("Book color is :" + book4.color);

book.setName("achiver");
System.out.println("Book Name is : " + book.name);

book1.setSize(5);
System.out.println("Book Size is :" +book1.size);

book2.setPrice (120.5);
System.out.println("Book Price is: " + book2.price);

book3.setSmart(true);
System.out.println("the Book is Smart :" + book3.smart);

book4.setColor("red");
System.out.println("Book Color is: " + book4.color);

}

public void setName(String bookName){
name = bookName;

}

public void setSize(int bookSize){
size = bookSize;
}

public void setPrice(double bookPrice){
price= bookPrice;
}

public void setSmart(boolean bookSmart){
smart = bookSmart;
}

public void setColor(String bookColor){
color = bookColor;
}
public String getName() {
return name;
}

public int getSize() {
return size;
}

public double getPrice(){
return price;
}
public boolean getSmart(){
return smart;
}
public String getColor(){
return color;
}

public String Book1detailes(){
return "Book details " + name + "price " + price+ "size" + size+"smart"+smart+ "color" + color;
}
}