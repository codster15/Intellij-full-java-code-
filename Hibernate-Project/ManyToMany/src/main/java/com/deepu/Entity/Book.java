package com.deepu.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "tbl_book")
public class Book {

    @Id
    @Column (name = "book_id")
    private Integer bookId;

    @Column( name = "book_Name")
    private String bookName;

    @ManyToMany (cascade = CascadeType.ALL )
            @JoinTable(
                    name = "tbl_Book_Author",
                    joinColumns = @JoinColumn(name = "book_id" , referencedColumnName = "book_id"),
                    inverseJoinColumns = @JoinColumn(name = "Author_Id " , referencedColumnName = "Author_Id")
            )
    private List<Authors>  lstOfAuthors ;
}
