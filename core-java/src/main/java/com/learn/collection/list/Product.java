package com.learn.collection.list;

public class Product implements Comparable<Product> {
    String name;
    int productNumber;
    int price;

    public Product(String name, int productNumber, int price) {
        this.name = name;
        this.productNumber = productNumber;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", productNumber=" + productNumber +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        int productPriceCompare = Integer.compare(this.price, o.price);
        return  productPriceCompare;
    }
}
