package by.htp.library.service;

import java.util.List;

import by.htp.library.bean.Book;
import by.htp.library.service.exception.ServiceException;

public interface BookService {
	
	void addBook(Book book) throws ServiceException;
	List<Book> searchByTitle(String title) throws ServiceException;
	List<Book> searchByYear(int year)throws ServiceException;

}
