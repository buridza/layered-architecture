package by.htp.library.controller;

import by.htp.library.controller.command.Command;

public class FrontController {
	
	private final CommandProvider provider = new CommandProvider();

	public FrontController() {
	}

	public String doAction(String request) {
		String[] params = request.split("\\s+");
		String commandName = params[0];
		String response = null;
		
		Command command = provider.getCommand(commandName);
		response = command.execute(request);

		return response;
	}

}
