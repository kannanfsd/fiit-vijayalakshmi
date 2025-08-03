package com.learn.collection;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        int nameCompare = o1.name.compareTo(o2.name);
        return nameCompare;
    }
}
