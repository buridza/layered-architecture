package by.htp.library.bean;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class UserAdmin extends User {
    public void setBan(boolean status){
        super.setBan(status);
    }
    public void setVIP(boolean status){
        super.setVIP(status);
    }
    public boolean delUser(String login){
        return false;
    }
}
