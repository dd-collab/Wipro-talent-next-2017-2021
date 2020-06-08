class Author
{
    private String name;
    private String email;
    private char gender;
    Author(String n,String e,char g)
    { 
        this.name=n;
        this.email=e;
        this.gender=g;
    }
    public String print()
    {
        return name+"( "+gender+" ) at "+email;
    }
    public String getName()
    {
        return name;
    }
}
class Book 
{
    private String name;
    private Author author;
    private double price;
    private int qty;
    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    public String getName()
    {
        return name;
    }
    public Author getAuthor()
    {
        return author;
    }
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        this.price=price;
    }
    public int getQty()
    {
        return qty;
    }
    public void setQty(int qty)
    {
        this.qty=qty;
    }
    public String toString() {
        return name + " by " + author;
    }
}
public class Main
{
    public static void main (String[] args)
    {
    Author a= new Author("Krish", "abc@mail.com", 'm');
    Book b=new Book("Java", a, 10.22, 22);
    System.out.println(a);
    System.out.println(b);
    b.setPrice(10.78);
    b.setQty(78);
    System.out.println("The name of the book is :"+b.getName());
    System.out.println("The price of the book is :"+b.getPrice());
    System.out.println("The stock is :"+b.getQty());
    System.out.println("The name of the book is :"+a.getName());
}
}
