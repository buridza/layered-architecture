package by.htp.library.dao.impl;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import by.htp.library.bean.Book;
import by.htp.library.dao.BookDAO;
import by.htp.library.dao.exception.DAOException;

public class FileBookDAO implements BookDAO {
    /*private String name;
        private String author;
        private String dateOfPublication;
        private boolean presence;
        private boolean vip;*/
    @Override
    public void addBook(Book book) throws DAOException {
        StringBuilder bookData = null;
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\Denis\\IdeaProjects\\layered-architecture\\src\\by\\htp\\library\\resources\\Books.txt")));
            bufferedWriter.write(book.getAuthor() + " ");
            bufferedWriter.write(book.getName() + " ");
            bufferedWriter.write(book.getDateOfPublication() + " ");
            bufferedWriter.write(String.valueOf(book.isPresence()) + " ");
            bufferedWriter.write(String.valueOf(book.isVip()));

        } catch (IOException e) {
            throw new DAOException();
        }

    }

    @Override
    public List<Book> searchBookByTitle(String title) throws DAOException {
        String str = null;
        String[] bookInformation;
        List<Book> bookByTitle = new ArrayList<>();
        BufferedReader readFromFile = null;
        try {
           readFromFile = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\Denis\\IdeaProjects\\layered-architecture\\src\\by\\htp\\library\\resources\\Books.txt")));
            while ((str = readFromFile.readLine()) != null) {
                //str += "\n";
                bookInformation = str.split("\\s+");
                if (bookInformation[1].equals(title)){
                    bookByTitle.add(createBook(bookInformation));
                }
            }
        } catch (IOException e) {
            throw new DAOException(e);
        }finally {
            try{readFromFile.close();}catch (IOException e){
                //log
            }
        }
        return bookByTitle;
    }
    private Book createBook(String[] bookInformation){
         //public Book(String name, String author, String dateOfPublication, boolean presence, boolean vip) {
        return new Book(bookInformation[1],bookInformation[0],bookInformation[2],Boolean.getBoolean(bookInformation[3]),Boolean.getBoolean(bookInformation[4]));
    }
    @Override
    public List<Book> searchByYear(int year) throws DAOException {
        String str = null;
        String[] bookInformation;
        List<Book> bookByYear = new ArrayList<>();
        BufferedReader readFromFile = null;
        try {
            readFromFile = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\Denis\\IdeaProjects\\layered-architecture\\src\\by\\htp\\library\\resources\\Books.txt")));
            while ((str = readFromFile.readLine()) != null) {
                //str += "\n";
                bookInformation = str.split("\\s+");
                if (bookInformation[2].equals(Integer.toString(year))){
                    bookByYear.add(createBook(bookInformation));
                }
            }
        } catch (IOException e) {
            throw new DAOException();
        }finally {
            try{readFromFile.close();}catch (IOException e){throw new DAOException();}
        }
        return null;
    }

}
