package by.htp.library.dao.impl;

import java.io.*;
import java.util.Scanner;

import by.htp.library.bean.User;
import by.htp.library.dao.UserDAO;
import by.htp.library.dao.exception.DAOException;

public class FileUserDAO implements UserDAO{

	@Override
	public User logination(String login, String password) throws DAOException  {
		User user = null;
		String str;
		StringBuilder text = new StringBuilder();
		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\Denis\\Downloads\\Testing\\src\\by\\htp\\library\\resources\\Users.txt")));
			//FileReader reader = new FileReader("/resources/users.txt");
			while((str=bufferedReader.readLine())!=null){
				text.append(str).append('\n');
			}
			user = new User();
			user.setName("Ivan");
			user.setSurname("Ivanov");
		}catch (IOException e){
			throw new DAOException("smth happended", e);
		}
		
		return user;
	}

	@Override
	public void registration(User user)  throws DAOException {
		String str="";
		BufferedWriter bufferedWriter = null;
		try{
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\Denis\\Downloads\\Testing\\src\\by\\htp\\library\\resources\\Users.txt")));
			str+=user.getLogin()+" ";
			str+=user.getPassword()+" ";
			str+=user.getName()+" ";
			str+=user.getSurname()+" ";
			str+=user.getDob()+" ";
			str+=user.getVip()+" ";
			str+=user.getBan()+"\n";
			bufferedWriter.write(str);
		}catch(IOException e){
			throw new DAOException("Что-то произошло", e);
		}
		finally {
			try {
				bufferedWriter.close();
			}catch (IOException e){
				throw new DAOException("Неудалось закрыть файл", e);
			}
		}
		
	}

	@Override
	public User findUser(String login) {
		String str = null;
		String[] arrStr = null;
		Scanner sc=null;
		User user=null;
		try {
			sc = new Scanner(new File("C:\\Users\\Denis\\Downloads\\Testing\\src\\by\\htp\\library\\bean\\Users.txt"));
			while (sc.hasNextLine()) {
				str = sc.nextLine();
				arrStr = str.split(" ");
				if(arrStr[0].equals(login)){
					user = new User();
					user.setLogin(arrStr[0]);
					user.setName(arrStr[1]);
					user.setSurname(arrStr[2]);
					user.setDob(Integer.parseInt(arrStr[3]), Integer.parseInt(arrStr[4]),Integer.parseInt(arrStr[5]));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			sc.close();
		}

		return null;
	}
}
