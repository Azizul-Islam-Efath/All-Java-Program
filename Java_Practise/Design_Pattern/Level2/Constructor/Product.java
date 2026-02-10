package Level2.Constructor;

public class Product {
    public String ProductId,ProductName;
    public double Price;

    public Product(String ProductId,String ProductName,double Price){
        this.ProductId=ProductId;
        this.ProductName=ProductName;
        this.Price=Price;
    }

    public void Display(){

        System.out.println("\nProduct ID: "+ProductId);
        System.out.println("Product Name: "+ProductName);
        System.out.println("Product Price: "+Price);
    }

    public void display(String ProductId,String ProductName,double Price){
        System.out.println("\nProduct ID: "+ProductId);
        System.out.println("Product Name: "+ProductName);
        System.out.println("Product Price: "+Price);
    }

    public static void main(String[] args) {
        Product p1 = new Product("123","Hand Wash",500);
        p1.Display();
        p1.display("154","Cleansure",120);

    }
    
}
