package com.kebo.iteartor;

/**
 * @ Author     ：kebo
 * @ Date       ：Created in 10:17 2019/1/27
 * @ Description：
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf=new BookShelf(4);
        bookShelf.appendBook(new Book("A"));
        bookShelf.appendBook(new Book("E"));
        bookShelf.appendBook(new Book("C"));
        bookShelf.appendBook(new Book("D"));
        Iterator iterator=bookShelf.iterator();
        while (iterator.hashNext()){
            Book book=(Book)iterator.next();
            System.out.println(book.getName());
        }
    }
}
