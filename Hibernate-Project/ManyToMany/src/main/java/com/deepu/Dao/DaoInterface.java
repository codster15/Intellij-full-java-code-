package com.deepu.Dao;

import com.deepu.Entity.Book;

public interface DaoInterface {
    void saveBook(Book book);

    Book findBook(Integer BookID);

    void removeBook(Integer bookId);

}
