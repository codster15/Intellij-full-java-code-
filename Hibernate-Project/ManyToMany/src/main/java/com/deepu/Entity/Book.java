package com.deepu.Entity;//package com.deepu.Entity;//package com.deepu.Entity;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//@Table (name = "tbl_book_Store")
//public class Book {
//
//    @Id
//    @Column (name = "book_id")
//    private Integer bookId;
//
//    @Column( name = "book_Name")
//    private String bookName;
//
//    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
//    @JoinTable(name = "tbl_books_authors_view",
//            joinColumns = @JoinColumn(name="book_id", referencedColumnName = "book_id"),
//            inverseJoinColumns= @JoinColumn(name="Author_id", referencedColumnName = "Author_id")
//    )
//    private List<Authors>  Authors ;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="tbl_books")
public class Book {
    @Id
    @Column(name = "book_id")
    private Integer bookId;

    @Column(name = "book_name")
    private String bookName;

    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "tbl_books_authors",
            joinColumns = @JoinColumn(name = "book_id", referencedColumnName = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id", referencedColumnName = "author_id")
    )
    private List<Author> authors;

    public Integer bookId() {
        return bookId;
    }

    public Book setBookId(Integer bookId) {
        this.bookId = bookId;
        return this;
    }

    public String bookName() {
        return bookName;
    }

    public Book setBookName(String bookName) {
        this.bookName = bookName;
        return this;
    }

    public List<Author> authors() {
        return authors;
    }

    public Book setAuthors(List<Author> authors) {
        this.authors = authors;
        return this;
    }
}






















    //----------------------------------------------------------------------------------------------------------------



//
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="tbl_books_b")
//public class Book {
//    @Id
//    @Column(name="book_id")
//    private Integer bookId;
//
//    @Column(name="book_name")
//    private String bookName;
//
//    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
//    @JoinTable(name = "tbl_books_authors_BA",
//            joinColumns = @JoinColumn(name="book_id", referencedColumnName = "book_id"),
//            inverseJoinColumns= @JoinColumn(name="author_id", referencedColumnName = "author_id")
//    )
//    private List<Authors> authors;
//
//    //------------------------------------------------------------------
//    public Integer getBookId() {
//        return bookId;
//    }
//
//    public void setBookId(Integer bookId) {
//        this.bookId = bookId;
//    }
//
//    public String getBookName() {
//        return bookName;
//    }
//
//    public void setBookName(String bookName) {
//        this.bookName = bookName;
//    }
//
//    public List<Authors> getAuthors() {
//        return authors;
//    }
//
//    public void setAuthors(List<Authors> authors) {
//        this.authors = authors;
//    }
//
//    public void setauthors() {
//    }
//}
//
//
//
//
