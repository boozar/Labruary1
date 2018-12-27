package Classes;

import java.util.ArrayList;

public class Library {
    private ArrayList<BookForLibrary> books;
    private  ArrayList<ForWebLibrary> audioBooks;

    public ArrayList<ForWebLibrary> getAudioBooks() {
        return audioBooks;
    }

    public ArrayList<BookForLibrary> getBooks() {
        return books;
    }

    public void addBook(BookForLibrary book) {
        if (this.books.isEmpty())
            book.ID = 1;
        else
            book.ID = this.books.get(this.books.size() - 1).ID + 1;
        this.books.add(book);
    }

    public void  addAudioBook(ForWebLibrary audiobook){
        if (this.audioBooks.isEmpty())
            audiobook.ID = 1;
        else
            audiobook.ID = this.audioBooks.get(this.audioBooks.size() - 1).ID + 1;
        this.audioBooks.add(audiobook);
    }

    public Library() {
        this.books = new ArrayList<>();
        this.audioBooks = new ArrayList<>();
    }
    // TO DOO  Для чего???

    public Library(int booksNumber) {
        this.books = new ArrayList<>(booksNumber);
        this.audioBooks = new ArrayList<>(booksNumber);
    }

    @Override
    public String toString() {
        String result1 = "";
        String result2 = "";

        for (BookForLibrary book : this.books) {
            result1 += book + "\n";
        }
        for (ForWebLibrary audioBook : this.audioBooks) {
            result2 += audioBook + "\n";
        }
        return "Полка с книгами: " + "\n"+ result1 +"\n"+ "Веб библиотека: " + "\n" + result2;
    }

    public String searchByTitle(String title) {
        String result1 = "";
        String result2 = "";
        for (Book book : this.books) {
            if (book.title.contains(title))
                result1 += book + "\n";
        }
        for ( AudioBook audioBook: this.audioBooks) {
            if (audioBook.title.toString().contains(title))
                result2 += audioBook + "\n";
        }
        return "Полка с книгами: " + "\n" + result1 + "Веб библиотека: " + "\n" + result2;
    }

    public ArrayList<ArrayList<Integer>> searchByTitleID(String title) {
        ArrayList<Integer> result1 = new ArrayList<>();
        ArrayList<Integer> result2 = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (BookForLibrary book : this.books) {
            if (book.title.contains(title))
                result1.add(book.ID);
        }
        for (BookForLibrary book : this.books) {
            if (book.title.contains(title))
                result2.add(book.ID);
        }
        result.add(result1);
        result.add(result2);
        return result;
    }

    public BookForLibrary getBookByID(int id) {
        BookForLibrary bookForLibrary = null;
        for (BookForLibrary book : this.books) {
            if (book.ID == id) {
                bookForLibrary = book;
                break;
            }
        }
        return bookForLibrary;
    }
    public ForWebLibrary getAudioBookByID(int id) {
        ForWebLibrary forWebLibrary = null;
        for (ForWebLibrary audioBook : this.audioBooks) {
            if (audioBook.ID == id) {
                forWebLibrary = audioBook;
                break;
            }
        }
        return forWebLibrary;
    }

}
