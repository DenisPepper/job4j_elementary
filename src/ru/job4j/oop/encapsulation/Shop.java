package ru.job4j.oop.encapsulation;

import java.awt.*;

public class Shop {

    public Product[] delete(Product[] products, int index) {
       for (int counter = index; counter < products.length - 1; counter++) {
           products[counter] = products[counter + 1];
       }
       products[products.length - 1] = null;
       return products;
    }

    public void showProducts(Product[] products) {
        for (Product product:products) {
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
    }

    public static void main(String[] args) {
        Shop shop = new Shop();

        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        products[3] = new Product("Orange juice", 1);
        products[4] = new Product("Chocolate", 6);

        shop.showProducts(products);

        int index = 0;
        if (index < products.length) {
            products = shop.delete(products, index);
            System.out.println("set NULL value to element with index:" + index);
            shop.showProducts(products);
        } else {
            System.out.println("Error: Index out of  bounds");
        }
    }
}
