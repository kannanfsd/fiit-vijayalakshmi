package com.learn.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ProductSortingMain {
    public static void main(String[] args) {
        var products = new ArrayList<Product>();
        products.add(new Product("Apple", 1021, 480));
        products.add(new Product("Banana", 1008, 150));
        products.add(new Product("Orange", 1145, 190));
        products.add(new Product("Kiwi", 1036, 340));
        products.add(new Product("Watermelon", 1102, 120));
        System.out.println("Before sorting: "+products);
        Collections.sort(products);
        System.out.println("After sorting: "+products);

        Collections.sort(products, new ProductComparator());
        System.out.println("After name sorting: "+products);
    }
}
