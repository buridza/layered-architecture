package by.htp.library.service.impl;

import java.util.List;

import by.htp.library.bean.Book;
import by.htp.library.dao.BookDAO;
import by.htp.library.dao.DAOFactory;
import by.htp.library.dao.exception.DAOException;
import by.htp.library.service.BookService;
import by.htp.library.service.exception.ServiceException;

public class BookServiceImpl implements BookService{

	@Override
	public void addBook(Book book) throws  ServiceException{
        DAOFactory daoFactory = DAOFactory.getInstance();
        BookDAO bookDAO = daoFactory.getBookDAO();
        try {
            bookDAO.addBook(book);
        }catch (DAOException e){
            throw new ServiceException(e);
        }

	}

    @Override
    public List<Book> searchByYear(int year) throws ServiceException {
	    DAOFactory daoFactory = DAOFactory.getInstance();
	    BookDAO bookDAO = daoFactory.getBookDAO();
        try{
            return bookDAO.searchByYear(year);
        }catch (DAOException e) {
            throw new ServiceException();
        }
    }

    @Override
	public List<Book> searchByTitle(String title) throws ServiceException{
        DAOFactory daoFactory = DAOFactory.getInstance();
        BookDAO bookDAO = daoFactory.getBookDAO();
        try{
            return bookDAO.searchBookByTitle(title);
        }catch (DAOException e) {
            throw new ServiceException();
        }
	}

}
