package by.htp.library.dao;

import java.io.FileNotFoundException;

import by.htp.library.bean.User;
import by.htp.library.dao.exception.DAOException;

public interface UserDAO {
	User logination(String login, String password) throws DAOException;
	void registration(User user) throws DAOException;
	User findUser(String login);

}
