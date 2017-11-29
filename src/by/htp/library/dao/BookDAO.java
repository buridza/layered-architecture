package by.htp.library.dao;

import java.util.List;

import by.htp.library.bean.Book;
import by.htp.library.dao.exception.DAOException;

public interface BookDAO {
	
	void addBook(Book book) throws DAOException;
	List<Book> searchBookByTitle(String title) throws DAOException;
    List<Book> searchByYear(int year)throws DAOException;

}
