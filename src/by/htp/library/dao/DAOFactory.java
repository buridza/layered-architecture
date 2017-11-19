package by.htp.library.dao;

import by.htp.library.dao.impl.FileBookDAO;
import by.htp.library.dao.impl.FileUserDAO;

public class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();
	
	private final UserDAO userDAO = new FileUserDAO();
	private final BookDAO bookDAO = new FileBookDAO();
	
	private DAOFactory() {}
	
	public UserDAO getUserDAO() {
		return userDAO;
	}
	
	public BookDAO getBookDAO() {
		return bookDAO;
	}
		
	public static DAOFactory getInstance() {
		return instance;
	}

}

