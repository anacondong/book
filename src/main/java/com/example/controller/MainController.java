/**
 * 
 */
package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.service.BookService;

/**
 * @author Ittipol
 *
 */
@Controller
public class MainController {
	
			@Autowired
			BookService bookService;
			
	
			@RequestMapping(value="/", method=RequestMethod.GET)
			public String homeGet(Model model){
				model.addAttribute("books",bookService.findAll());
				
				return "index";
			}
			
			
}
