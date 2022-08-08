package com.payu.bookui.controller;

import com.payu.bookui.service.Book;
import com.payu.bookui.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;
	
	@RequestMapping(value = {"/", "/home",})
	public ModelAndView getAllBook(Model model) {
		ModelAndView mav = new ModelAndView("manage-book");
		mav.addObject("books", bookService.get());
		return mav;
	}

	@RequestMapping(value = "/open-add-book-form")
	public ModelAndView openAddBookForm() {
		ModelAndView mav = new ModelAndView("add-book");
		mav.addObject("book", new Book());
		return mav;
	}
	
	@RequestMapping(value = "/add-book")
	public ModelAndView bookProcess(@ModelAttribute("book") Book book) {
		ModelAndView mav = new ModelAndView("manage-book");
		bookService.save(book);
		mav.addObject("books", bookService.get());
		return mav;
	}
	
	@RequestMapping(value = "/get-book")
	public ModelAndView editBook(@RequestParam("id") Long id) {
		ModelAndView mav = new ModelAndView("add-book");
		mav.addObject("book", bookService.get(id));
		return mav;
	}
	
	@RequestMapping(value = "/delete-book")
	public ModelAndView deleteBook(@RequestParam("id") Long id) {
		ModelAndView mav = new ModelAndView("manage-book");
		bookService.delete(id);
		List<Book> books = bookService.get();

		if(books.size() > 0) {
			mav.addObject("books", bookService.get());
			return mav;
		}

		mav.addObject("book", List.of(new  Book()));
		return mav;
	}
}
