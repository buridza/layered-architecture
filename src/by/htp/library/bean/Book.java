package by.htp.library.bean;

import java.util.Arrays;
import java.util.Collections;

public class Book {
    private String name;
    private String author;
    private String dateOfPublication;
    private boolean presence;
    private boolean vip;
    {
        presence = true;
    }

    public Book() {
    }

    public Book(String name, String author, String dateOfPublication, boolean presence, boolean vip) {
        this.name = name;
        this.author = author;
        this.dateOfPublication = dateOfPublication;
        this.presence = presence;
        this.vip = vip;
    }

    public Book(String name, String author, String dateOfPublication, boolean vip) {
        this.name = name;
        this.author = author;
        this.dateOfPublication = dateOfPublication;
        this.vip = vip;
    }

    public boolean isPresence() {
        return presence;
    }

    public void setPresence(boolean presence) {
        this.presence = presence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDateOfPublication() {
        return dateOfPublication;
    }

    public void setDateOfPublication(String dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (vip != book.vip) return false;
        if (name != null ? !name.equals(book.name) : book.name != null) return false;
        if (author != null ? !author.equals(book.author) : book.author != null) return false;
        return dateOfPublication != null ? dateOfPublication.equals(book.dateOfPublication) : book.dateOfPublication == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (dateOfPublication != null ? dateOfPublication.hashCode() : 0);
        result = 31 * result + (vip ? 1 : 0);
        return result;
    }
}
