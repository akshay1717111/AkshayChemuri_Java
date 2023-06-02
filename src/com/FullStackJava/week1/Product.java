package com.FullStackJava.week1;

public class Product {
double price;

    public double getPrice() {
        return price;
    }

    public double getPrice(double quantity) {
        if(quantity >= 3) {
            price = price * 2* quantity;
            return price;
        }
        else{
            return price * quantity;
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
        System.out.println(p.getPrice(2));

    }

}
