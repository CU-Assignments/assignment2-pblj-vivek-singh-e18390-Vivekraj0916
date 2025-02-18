class Book{
    String title,author;
    double price;
    Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void display(){
        System.out.println("Title: "+title+"\nAuthor: "+author+"\nPrice: "+price);
    }
}
class Fiction extends Book{
    Fiction(String title,String author,double price){
        super(title,author,price);
    }
    void display(){
        System.out.println("Fiction Book Details:");
        super.display();
    }
}
class NonFiction extends Book{
    NonFiction(String title,String author,double price){
        super(title,author,price);
    }
    void display(){
        System.out.println("Non-Fiction Book Details:");
        super.display();
    }
}
public class LibraryManagement{
    public static void main(String[] args){
        Fiction f=new Fiction("Harry Potter","J.K. Rowling",500);
        NonFiction nf=new NonFiction("Sapiens","Yuval Noah Harari",700);
        f.display();
        nf.display();
    }
}
