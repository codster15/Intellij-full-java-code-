package com.deepu.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tbl_Authors")
public class Authors {

        @Id
        @Column(name = "Author_id")
        private Integer AuthorId;

        @Column( name = "Author_Name")
        private String AuthorName;

        @ManyToMany(mappedBy = "authors")
    private List<Book> book;
}
