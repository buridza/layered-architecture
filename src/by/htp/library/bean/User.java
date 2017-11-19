package by.htp.library.bean;

public class User {
	private String login;
	private String name;
	private String surname;
	private String DOB;
	private boolean VIP;
	private boolean ban;

	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}

    public String getDOB() {
        return DOB;
    }

    public void setDOB(int day, int month, int year){
		DOB = String.format("%2d:%2d:%4d",day,month,year).replace(" ", "0");
    }
    protected void setBan(boolean status){ ban=status;}
	public boolean getBan(){ return ban; }

    protected void setVIP(boolean status){VIP = status;}
    public boolean getVIP(){return VIP; }



}
