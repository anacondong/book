package com.example.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Book implements Serializable{
    private int id;
    private String name;
    private BookDetail bookDetail; // OneToOne
    private BookCategory bookCategory; //OneToMany
    private Set<Publisher> publishers; // manyToMany

    public Book(){super();}
    public Book(int id, String name, BookDetail bookDetail, BookCategory bookCategory, Set<Publisher> publishers) {
		super();
		this.id = id;
		this.name = name;
		this.bookDetail = bookDetail;
		this.bookCategory = bookCategory;
		this.publishers = publishers;
	}
    
    public Book(String name, BookDetail bookDetail, BookCategory bookCategory, Set<Publisher> publishers) {
		super();
		this.name = name;
		this.bookDetail = bookDetail;
		this.bookCategory = bookCategory;
		this.publishers = publishers;
	}
    
    public Book(String name) {
        this.name = name;
    }
    
	public Book(String name, BookDetail bookDetail) {
		super();
		this.name = name;
		this.bookDetail = bookDetail;
	}
	
	
	public Book(String name, BookCategory bookCategory) {
		super();
		this.name = name;
		this.bookCategory = bookCategory;
	}
	
	public Book(String name, Set<Publisher> publishers){
        this.name = name;
        this.publishers = publishers;
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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_detail_id")
    public BookDetail getBookDetail() {
        return bookDetail;
    }

    public void setBookDetail(BookDetail bookDetail) {
        this.bookDetail = bookDetail;
    }
    
    @ManyToOne
    @JoinColumn(name = "book_category_id")
    public BookCategory getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(BookCategory bookCategory) {
        this.bookCategory = bookCategory;
    }
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "book_publisher", joinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "publisher_id", referencedColumnName = "id"))
    public Set<Publisher> getPublishers() {
        return publishers;
    }

    public void setPublishers(Set<Publisher> publishers) {
        this.publishers = publishers;
    }
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", bookDetail=" + bookDetail.toString() + ", bookCategory=" + bookCategory.toString()
				+ ", publishers=" + publishers.toString() + "]";
	}
    
   
    
}
