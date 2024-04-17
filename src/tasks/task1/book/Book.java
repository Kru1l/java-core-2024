package tasks.task1.book;

import java.util.ArrayList;

public class Book {
    private String title;
    private int pages;
//    private String[] authors;
    private ArrayList<String> authors = new ArrayList<>();
    private String genre;

    public Book() {
    }

    public Book(String title, int pages, String genre) {
        this.title = title;
        this.pages = pages;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public Book addAuthor(String author) {
        this.authors.add(author);
        return this;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book(" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", authors=" + authors +
                ", genre='" + genre + '\'' +
                ')';
    }
}
