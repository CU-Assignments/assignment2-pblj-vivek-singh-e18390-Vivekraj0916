class Product{
    int id;
    String name;
    double price;
    Product(int id,String name,double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
    void display(){
        System.out.println("Product Details:\nID: "+id+"\nName: "+name+"\nPrice: "+price);
    }
    public static void main(String[] args){
        Product p=new Product(101,"Laptop",75000);
        p.display();
    }
}
