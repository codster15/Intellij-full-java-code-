package com.deepu.Testing;

import com.deepu.Dao.BookDAO_Interface;
import com.deepu.Dao.BookDaoImpl;
import com.deepu.Entity.Author;
import com.deepu.Entity.Book;

import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        BookDAO_Interface bookDao = new BookDaoImpl();



Book book1 = new Book();
            book1.setBookId(11011);
            book1.setBookName("Alice Land");

Book book2 = new Book();
            book2.setBookId(22022);
            book2.setBookName("London Dreams");


Book book3 = new Book();
            book3.setBookId(33033);
            book3.setBookName("Atomic Habits");


Book book4 = new Book();
            book4.setBookId(44044);
            book4.setBookName("Power of mind");




        Author author1 = new Author();
        author1.setAuthorId(111);
        author1.setAuthorName("chetan");

        Author author2 = new Author();
        author2.setAuthorId(222);
        author2.setAuthorName("ideas");

        Author author3 = new Author();
        author3.setAuthorId(333);
        author3.setAuthorName("lemon");

        Author author4 = new Author();
        author4.setAuthorId(444);
        author4.setAuthorName("Good Life");


        Author a1 = new Author();


        //-----------------------------------------------------
        // book-1 authors

        List<Author> authorsLst1 = Arrays.asList(author1 ,author3, author4);

        book1.setAuthors(authorsLst1);

        //-----------------------------------------------------------

        // book- 2 authors

        List<Author> authorsLst2 = Arrays.asList(author2 ,author3, author4);


        book2.setAuthors(authorsLst2);

        //-----------------------------------------------------------

        // book- 3 authors

        List<Author> authorsLst3 = Arrays.asList(author3 ,author3);

        book3.setAuthors(authorsLst3);

        //-----------------------------------------------------------

        // book- 4 authors

        List<Author> authorsLst4 = Arrays.asList(author1 ,author2);

        book4.setAuthors(authorsLst4);

        //-----------------------------------------------------------





        bookDao.saveBook(book1);
        bookDao.saveBook(book2);
        bookDao.saveBook(book3);
        bookDao.saveBook(book4);



    }
}
