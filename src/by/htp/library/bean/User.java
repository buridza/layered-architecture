package by.htp.library.bean;

public class User {
	private String login;
	private String name;
	private String surname;
	private String dob;
	private boolean vip;
	private String password;
	private boolean ban;

	public User() {
	}

	public User(String login, String password, String name, String surname, String dob, boolean vip,  boolean ban) {
		this.login = login;
		this.name = name;
		this.surname = surname;
		this.dob = dob;
		this.vip = vip;
		this.password = password;
		this.ban = ban;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

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

    public String getDob() {
        return dob;
    }

    public void setDob(int day, int month, int year){
		dob = String.format("%2d:%2d:%4d",day,month,year).replace(" ", "0");
    }
    protected void setBan(boolean status){ ban=status;}
	public boolean getBan(){ return ban; }

    protected void setVip(boolean status){vip = status;}
    public boolean getVip(){return vip; }

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		User user = (User) o;

		if (vip != user.vip) return false;
		if (ban != user.ban) return false;
		if (login != null ? !login.equals(user.login) : user.login != null) return false;
		if (name != null ? !name.equals(user.name) : user.name != null) return false;
		if (surname != null ? !surname.equals(user.surname) : user.surname != null) return false;
		if (dob != null ? !dob.equals(user.dob) : user.dob != null) return false;
		return password != null ? password.equals(user.password) : user.password == null;
	}

	@Override
	public int hashCode() {
		int result = login != null ? login.hashCode() : 0;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (surname != null ? surname.hashCode() : 0);
		result = 31 * result + (dob != null ? dob.hashCode() : 0);
		result = 31 * result + (vip ? 1 : 0);
		result = 31 * result + (password != null ? password.hashCode() : 0);
		result = 31 * result + (ban ? 1 : 0);
		return result;
	}
}
