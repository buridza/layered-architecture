package by.htp.library.dao.exception;

public class DAOException extends Exception{
	private static final long serialVersionUID = -7424108388015816081L;

	public DAOException(String message, Exception e) {
		super(message, e);
	}
}
