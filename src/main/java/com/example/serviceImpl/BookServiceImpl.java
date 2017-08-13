package com.example.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.BookDao;
import com.example.entity.Book;
import com.example.service.BookService;
/**
 * @author Ittipol
 *
 */
@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookDao bookDao;
	
	@Override
	public List<Book> findAll() {
		return bookDao.findAll();
	}
	
	
	

}
