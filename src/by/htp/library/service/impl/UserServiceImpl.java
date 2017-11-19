package by.htp.library.service.impl;

import java.io.FileNotFoundException;

import by.htp.library.bean.User;
import by.htp.library.dao.DAOFactory;
import by.htp.library.dao.UserDAO;
import by.htp.library.dao.exception.DAOException;
import by.htp.library.dao.impl.FileUserDAO;
import by.htp.library.service.ServiceException;
import by.htp.library.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public User logination(String login, String password) throws ServiceException {
		// validation
		if (login == null || login.isEmpty()) {
			return null;
		}

		DAOFactory daoFactory = DAOFactory.getInstance();

		UserDAO userDAO = daoFactory.getUserDAO();

		User user;

		try {
			user = userDAO.logination(login, password);
		} catch (DAOException e) {
			throw new ServiceException("smth wrong", e);
		}

		return user;
	}

	@Override
	public void registration(User user) {
		// validation

		DAOFactory daoFactory = DAOFactory.getInstance();

		UserDAO userDAO = daoFactory.getUserDAO();

	}

}
