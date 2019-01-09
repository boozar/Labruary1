package Classes;

import Enums.Condition;
import Enums.CoverType;

import java.util.ArrayList;

public class Book {
    String title;
    ArrayList<Author> authors;
    Publisher publisher;
    int publishedYear;
    int pages;
    CoverType coverType;
    Condition condition;

    public Book(Book book) {
        this.authors = book.authors;
        this.condition = book.condition;
        this.coverType = book.coverType;
        this.pages = book.pages;
        this.publishedYear = book.publishedYear;
        this.publisher = book.publisher;
        this.title = book.title;
    }

    public Book(String title, Author[] authors, Publisher publisher, int publishedYear, int pages, CoverType coverType, Condition condition) {
        this.title = title;
        this.authors = new ArrayList<>();
        for (Author author : authors) {
            this.authors.add(author);
        }
        this.publisher = publisher;
        this.publishedYear = publishedYear;
        this.pages = pages;
        this.coverType = coverType;
        this.condition = condition;
    }

    public void addAuthors(Author author) {
        this.authors.add(author);
    }


    public void setCondition(Condition condition) {
        this.condition = condition;
    }


    public String getTitle() {
        return title;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public int getPages() {
        return pages;
    }

    public CoverType getCoverType() {
        return coverType;
    }

    public Condition getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        String authorStr = this.authors.toString();

        return "Book " +
                "  Название произведения - " + title  +
                ",  authors - " + authorStr.substring(1, authorStr.length()-1) +
                ",  publisher - " +  publisher  +
                ",  publishedYear - " + publishedYear +
                ",  pages - " + pages +
                ",  coverType - " + coverType +
                ",  condition - " + condition  ;

    }
}
