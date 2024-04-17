package tasks.task1.book;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        String[] authors = new String[]{"John Doe", "Joode Hiife"};
//
//        Book book = new Book("The Lord of Ring", 356, "fantasy", authors);


        Book book1 = new Book("The Lord of Ring", 356, "fantasy");
//        ArrayList<String> authors = book.getAuthors();

//        authors.add("John Doe");
//        authors.add("Joode Hiife");

        book1.addAuthor("Joode Hiife").addAuthor("John Doe");

        Book book2 = new Book("Harry Potter", 490, "fantasy");
        book2.addAuthor("Angelica Korgy").addAuthor("Non Man");

        Book book3 = new Book("The Snow", 267, "thriller");
        book3.addAuthor("John Murder").addAuthor("Mike Killer");

        Book book4 = new Book("2012", 788, "apocalypses");
        book4.addAuthor("Meta-tron").addAuthor("Big Angel");

        Book book5 = new Book("One Love", 1064, "melodrama");
        book5.addAuthor("Sweaty Jessica").addAuthor("Juicy Melony");

        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        for (Book book : books) {
            System.out.println(book);
        }
    }
}