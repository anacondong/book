package com.example.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "book_category")
public class BookCategory {
    private int id;
    private String name;
    private Set<Book> books;

    public BookCategory(){

    }

    public BookCategory(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "bookCategory", cascade = CascadeType.ALL)
    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
	@Override
	public String toString() {
		return "BookCategory [id=" + id + ", name=" + name + ", books=" + books + "]";
	}
}
