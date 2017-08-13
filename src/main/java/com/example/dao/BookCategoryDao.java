package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.BookCategory;

@Repository
public interface BookCategoryDao extends JpaRepository<BookCategory, Integer>{
}
