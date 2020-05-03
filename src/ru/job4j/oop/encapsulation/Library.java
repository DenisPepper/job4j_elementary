package ru.job4j.oop.encapsulation;

import ru.job4j.array.Defragment;

import java.lang.module.FindException;

public class Library {

    public static void main(String[] args) {

        Book[] books = new Book[4];

        Book firstBook = new Book();
        firstBook.setTitle("Clean code");
        firstBook.setPageCount(200);
        books[0] = firstBook;

        Book secondBook = new Book();
        secondBook.setTitle("The Good");
        secondBook.setPageCount(250);
        books[1] = secondBook;

        Book thirdBook = new Book();
        thirdBook.setTitle("The Bad");
        thirdBook.setPageCount(260);
        books[2] = thirdBook;

        Book fourthBook = new Book();
        fourthBook.setTitle("The Ugly");
        fourthBook.setPageCount(300);
        books[3] = fourthBook;

        for (int index = 0; index != books.length; index++) {
            System.out.println(books[index].getTitle());
        }

        Book remove = books[0];
        books[0] = books[3];
        books[3] = remove;

        System.out.println("Remove index 0 to 3");
        for (int index = 0; index != books.length; index++) {
            System.out.println(books[index].getTitle());
        }

        System.out.println("Show only Clean code:");
        for (int index = 0; index != books.length; index++) {
            if (books[index].getTitle().equals("Clean code")) {
                System.out.println(books[index].getTitle());
            }
        }
    }
}
