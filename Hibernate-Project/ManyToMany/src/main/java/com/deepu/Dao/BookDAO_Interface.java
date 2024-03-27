package com.deepu.Dao;

import com.deepu.Entity.Book;

public interface BookDAO_Interface {

        void saveBook(Book book);

        Book findBook(Integer BookID);

        void removeBook(Integer bookId);



}
