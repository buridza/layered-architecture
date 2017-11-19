package by.htp.library.dao;

import java.util.List;

import by.htp.library.bean.Book;

public interface BookDAO {
	
	void addBook(Book book);
	List<Book> searchBookByTitle(String title);

}
