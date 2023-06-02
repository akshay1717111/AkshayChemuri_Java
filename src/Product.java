public class Product {
double price;

    public double getPrice() {
        return price;
    }

    public double getPrice(double quantity) {
        if(quantity > 100) {
            price = price * 1.05;
            return price;
        }
        else{
            return price;
        }

    }

    public double setPrice(double value){
        price=value;
        return price;
    }
    public static void main(String[] args){
        Product p=new Product();
        System.out.println(p.setPrice(150));
        System.out.println(p.getPrice());
        System.out.println(p.getPrice(200));

    }

}
