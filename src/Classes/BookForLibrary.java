package Classes;

import Enums.Condition;
import Enums.CoverType;

public class BookForLibrary extends Book {
    int ID;


    public BookForLibrary(int id, String title, Author[] authors, Publisher publisher, int publishedYear, int pages, CoverType coverType, Condition condition) {
        super(title, authors, publisher, publishedYear, pages, coverType, condition);
        this.ID = id;
    }

    public BookForLibrary(Book book) {
        super(book);
    }

    @Override
    public String toString() {
        return ID + ". " + super.toString() ;

    }
}
