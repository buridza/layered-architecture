package by.htp.library.bean;

import java.io.*;
import java.util.Scanner;

public class test {
    String DOB;

    public void setDOB(int day, int month, int year){

    }

    public static void main(String[] args) throws IOException {
       /* try{

            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\Denis\\Downloads\\Testing\\src\\by\\htp\\library\\resources\\Users.txt")));
            while(reader.read()>0) {
                System.out.println(reader.readLine());
                System.out.println(reader.skip(reader.readLine().length()));
            }

        }catch (IOException e){
            //заглушка
            e.printStackTrace();
        }*/

       // FileWriter writer = new FileWriter("C:\\Users\\Denis\\Downloads\\Testing\\src\\by\\htp\\library\\resources\\Users.txt");
        String str;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\Denis\\Downloads\\Testing\\src\\by\\htp\\library\\resources\\Users.txt")));
        //FileReader reader = new FileReader("/resources/users.txt");
        while((str=bufferedReader.readLine())!=null) {
            System.out.println(str);
        }
       /* */

    }
}
