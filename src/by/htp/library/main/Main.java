package by.htp.library.main;

import by.htp.library.controller.FrontController;

public class Main {

	public static void main(String[] args) {
		FrontController controller = new FrontController();

		String request;
		request = "logination  aaa bbb";

		String response;
		response = controller.doAction(request);

		System.out.println(response);

		request = "registration name=Ivan surname=Ivanov aaa nn a@a.by";
		response = controller.doAction(request);

		System.out.println(response);

	}

}
