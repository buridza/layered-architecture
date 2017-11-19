package by.htp.library.service;

import java.util.List;

import by.htp.library.bean.Book;

public interface BookService {
	
	void addBook(Book book) throws ServiceException;
	List<Book> searchByTitle(String title) throws ServiceException;

}
