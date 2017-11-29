package by.htp.library.controller.command.impl;

import by.htp.library.bean.User;
import by.htp.library.controller.command.Command;
import by.htp.library.service.ServiceFactory;
import by.htp.library.service.UserService;
import by.htp.library.service.exception.ServiceException;

public class RegistrationCommand implements Command {

	@Override
	public String execute(String request) {

		String[] params = request.split("\\s+");

		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		UserService userService = serviceFactory.getUserService();
		String login = params[1];
		String password = params[2];
		String name = params[3];
		String surName = params[4];
		String dob = params[5];
		String vip = params[6];
		String ban = params[7];
		boolean response = false;
		User user = new User(login, password, name, surName, dob, Boolean.parseBoolean(vip),  Boolean.parseBoolean(ban));
		try {
			userService.registration(user);
			response = true;
		} catch (ServiceException e) {
			response = false;
		}
		return Boolean.toString(response);
	}

}
