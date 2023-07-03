package com.fullstack.javacore.oopsConcepts;

public class Product {
    double price;
    public double getPrice(){
        return price;
    }
    public double setPrice(double value){
       price=value;
       return price;
    }
    public double getPrice(int quantity){
        price=price * quantity;
        return price;
    }

    public static void main(String[] args){
        Product p=new Product();
        System.out.println(p.setPrice(100));
        System.out.println(p.getPrice());
        System.out.println(p.getPrice(2));

    }
}
