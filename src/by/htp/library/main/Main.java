package by.htp.library.main;

import by.htp.library.controller.FrontController;

import java.util.Random;

public class Main {
    public static String log(){
        Random random = new Random();
        String log="";
        String pass = "";
        //public User(String login, String password, String name, String surname, String dob, boolean vip,  boolean ban) {
        for (int i = 0; i < 32; i++) {
            log +=(char)(random.nextInt(41)+50);
            pass +=(char)(random.nextInt(41)+50);
        }
        return log+" "+pass;
    }
    public static String genStr(){
        String str = "";
        Random random = new Random();
        for (int i = 0; i < random.nextInt(32); i++) {
            str+=(char)random.nextInt(256);
        }
        return str;
    }
    public static String genDate(){
        Random random = new Random();
        String str = "";
        int year=random.nextInt(2010);
        while(year>1970&&year<=2010){
            year = random.nextInt(2010);
        }
        return str+random.nextInt(30)+random.nextInt(12)+random.nextInt()+year;
    }

	public static void main(String[] args) {
		FrontController controller = new FrontController();

		String request;
		//request = "logination  aaa bbb";
        request = "logination "+log();
		String response;
		response = controller.doAction(request);

		System.out.println(response);

		//request = "registration name=Ivan surname=Ivanov aaa nn a@a.by";
       // User user = new User(login, password, name, surName, dob, Boolean.parseBoolean(vip),  Boolean.parseBoolean(ban));
        for (int i = 0; i < 1000; i++) {
            request = genStr()+" "+genStr()+" "+genStr()+" "+genStr()+" "+genDate()+" "+"false"+" "+"false";
            response = controller.doAction(request);
        }



		System.out.println(response);

	}

}
