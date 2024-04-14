package com.deepu.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="tbl_authors")
public class Author {
    @Id
    @Column(name = "author_id")
    private Integer authorId;

    @Column(name = "author_name")
    private String authorName;

    @ManyToMany(cascade = {CascadeType.ALL}, mappedBy = "authors")
    private List<Book> books;

//-------------------------------------------------------------
























    public Integer authorId() {
        return authorId;
    }

    public Author setAuthorId(Integer authorId) {
        this.authorId = authorId;
        return this;
    }

    public String authorName() {
        return authorName;
    }

    public Author setAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }

    public List<Book> books() {
        return books;
    }

    public Author setBooks(List<Book> books) {
        this.books = books;
        return this;
    }
}