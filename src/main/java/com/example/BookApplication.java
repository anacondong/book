package com.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.dao.BookCategoryDao;
import com.example.dao.BookDao;
import com.example.dao.PublisherDao;
import com.example.entity.Book;
import com.example.entity.BookCategory;
import com.example.entity.BookDetail;
import com.example.entity.Publisher;
/**
 * @author Ittipol
 *
 */
//@EnableAutoConfiguration
@SpringBootApplication
public class BookApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(BookApplication.class);
	
	@Autowired
    private BookDao bookDao;
	
	@Autowired
	private BookCategoryDao bookCategoryDao;
	
	@Autowired
	private PublisherDao publisherDao;
	
	
	public static void main(String[] args) {
		SpringApplication.run(BookApplication.class, args);
	}
	
	 @Bean
	    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
	        return args -> {
//	            System.out.println("Let's inspect the beans provided by Spring Boot:");
//	            String[] beanNames = ctx.getBeanDefinitionNames();
//	            Arrays.sort(beanNames);
//	            for (String beanName : beanNames) {
//	                System.out.println(beanName);
//	            }
	        	
	        	
	        	BookCategory categoryA = new BookCategory("Category A");
		        BookCategory categoryB = new BookCategory("Category B");
		        bookCategoryDao.save(new HashSet<BookCategory>() {{
			        add(categoryA);
			        add(categoryB);
			        }}); 
		           
	            List<Book> books = new ArrayList<>();
	           Book b1 =  new Book("Book A",new BookDetail(49),categoryA,
	            	new HashSet<Publisher>(){{
                    add( new Publisher("Publisher A"));
                    add( new Publisher("Publisher B"));
	            	}});
	           
	           Book b2 =  new Book("Book B",new BookDetail(19),categoryA,
		            	new HashSet<Publisher>(){{
	                    add( new Publisher("Publisher C"));
	                    add( new Publisher("Publisher D"));
		            	}});
	           
	           Book b3 =  new Book("Book C",new BookDetail(100),categoryB,
		            	new HashSet<Publisher>(){{
	                    add( new Publisher("Publisher A"));
	                    add( new Publisher("Publisher C"));
		            	}});
	           
	           
	           Book b4 =  new Book("Book D",new BookDetail(200),categoryA,
		            	new HashSet<Publisher>(){{
	                    add( new Publisher("Publisher D"));
	                    add( new Publisher("Publisher E"));
	                    add( new Publisher("Publisher F"));
	                    add( new Publisher("Publisher Z"));
		            	}});
	           
	           
	           books.add(b1);
	           books.add(b2);
	           books.add(b3);
	           books.add(b4);
	        	
	           
	           bookDao.save(books);

	           
	        	//////////////////////////////////////////////////////////////////////////////////
	        	// save a couple of books
	        	// OneToOne
//	            List<Book> books = new ArrayList<>();
//	            books.add(new Book("Book A", new BookDetail(49)));
//	            books.add(new Book("Book B", new BookDetail(59)));
//	            books.add(new Book("Book C", new BookDetail(69)));
//	            bookDao.save(books);
	        	
	           
	            //////////////////////////////////////////////////////////////////////////////////
	            // save a couple of categories
	            // ManyToOne-OneToMany
//	            BookCategory categoryA = new BookCategory("Category A");
//	            Set bookAs = new HashSet<Book>(){{
//	                add(new Book("Book A1", categoryA));
//	                add(new Book("Book A2", categoryA));
//	                add(new Book("Book A3", categoryA));
//	            }};
//	            categoryA.setBooks(bookAs);
//	            	            
//	            BookCategory categoryB = new BookCategory("Category B");
//	            Set bookBs = new HashSet<Book>(){{
//	                add(new Book("Book B1", categoryB));
//	                add(new Book("Book B2", categoryB));
//	                add(new Book("Book B3", categoryB));
//	            }};
//	            categoryB.setBooks(bookBs);
//	            bookCategoryDao.save(new HashSet<BookCategory>() {{
//	                add(categoryA);
//	                add(categoryB);
//	            }});
	        	
	        	
	        	
	            //////////////////////////////////////////////////////////////////////////////////
	            // save a couple of books
	            // ManyToMany
//	            Publisher publisherA = new Publisher("Publisher A");
//	            Publisher publisherB = new Publisher("Publisher B");
//	            Publisher publisherC = new Publisher("Publisher C");
//
//	            bookDao.save(new HashSet<Book>(){{
//	                add(new Book("Book A", new HashSet<Publisher>(){{
//	                    add(publisherA);
//	                    add(publisherB);
//	                }}));
//
//	                add(new Book("Book B", new HashSet<Publisher>(){{
//	                    add(publisherA);
//	                    add(publisherC);
//	                }}));
//	            }});
//
//
//	            // save a couple of publishers
//	            Book bookA = new Book("Book A");
//	            Book bookB = new Book("Book B");
//
//	            publisherDao.save(new HashSet<Publisher>() {{
//	                add(new Publisher("Publisher A", new HashSet<Book>() {{
//	                    add(bookA);
//	                    add(bookB);
//	                }}));
//
//	                add(new Publisher("Publisher B", new HashSet<Book>() {{
//	                    add(bookA);
//	                    add(bookB);
//	                }}));
//	            }});

	             
	            
	            
	        };
	    }
	
}




