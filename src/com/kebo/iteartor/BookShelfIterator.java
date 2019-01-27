package com.kebo.iteartor;

/**
 * @ Author     ：kebo
 * @ Date       ：Created in 9:56 2019/1/27
 * @ Description：
 */
public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index=0;
    }

    @Override
    public boolean hashNext() {
        if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public Object next() {
        Book book=bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
