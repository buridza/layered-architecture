package by.htp.library.controller;

import java.util.HashMap;
import java.util.Map;

import by.htp.library.controller.command.Command;
import by.htp.library.controller.command.impl.LoginationCommand;
import by.htp.library.controller.command.impl.RegistrationCommand;

public class CommandProvider {
	
	private Map<String, Command> commands = new HashMap<>();
	
	public CommandProvider() {
		commands.put("logination", new LoginationCommand());
		commands.put("registration", new RegistrationCommand());
	}
	
	public Command getCommand(String commandName) {
		
		return commands.get(commandName);
	}

}
