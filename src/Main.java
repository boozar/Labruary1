import Classes.*;
import Enums.AuthorName;
import Enums.Condition;
import Enums.CoverType;
import Enums.Genres;

import java.util.Date;

public class Main {
    public static void main(String[] args) {


        Book book1 = new Book("Alphabet1", new Author[]{new Author(AuthorName.Иванов, new Date("2000/01/01"),
                Genres.Детектив)}, new Publisher("Создание предприятия", "www.com,ua", 1990),
                2017, 40, CoverType.мягкая, Condition.отличное);

        book1.getAuthors().get(0).addAuthorGenres(Genres.Фантастиика);

        Book book2 = new Book("Marshall", new Author[]{new Author(AuthorName.Шевченко, new Date("2000/01/01"),
                Genres.Детектив)}, new Publisher("Создание предприятия", "www.com,ua", 1990),
                2017, 40, CoverType.мягкая, Condition.отличное);

        Book book3 = new Book("Крестоносцы", new Author[]{new Author(AuthorName.Сидоров, new Date("2000/01/01"),
                Genres.Детектив)}, new Publisher("Создание предприятия", "www.com,ua", 1990),
                2017, 40, CoverType.мягкая, Condition.отличное);

        Book book4 = new Book("No Alphabet4", new Author[]{new Author(AuthorName.Петров, new Date("2000/01/01"),
                Genres.Детектив)}, new Publisher("Создание предприятия", "www.com,ua", 1990),
                2017, 40, CoverType.мягкая, Condition.отличное);


        book1.setCondition(Condition.хорошее);

        BookForLibrary bookForLibrary1 = new BookForLibrary(book1);
        BookForLibrary bookForLibrary2 = new BookForLibrary(book2);
        BookForLibrary bookForLibrary3 = new BookForLibrary(book3);
        BookForLibrary bookForLibrary4 = new BookForLibrary(book4);

///////////////////////////////////////////////////////////////////////////

        AudioBook audioBook1 = new AudioBook();
        audioBook1 = audioBook1.audioBook();
        AudioBook audioBook2 = new AudioBook();
        audioBook2 = audioBook2.audioBook();
        AudioBook audioBook3 = new AudioBook();
        audioBook3 = audioBook3.audioBook();
        AudioBook audioBook4 = new AudioBook();
        audioBook4 = audioBook4.audioBook();

        ForWebLibrary forWebLibrary1 = new ForWebLibrary(audioBook1);
        ForWebLibrary forWebLibrary2 = new ForWebLibrary(audioBook2);
        ForWebLibrary forWebLibrary3 = new ForWebLibrary(audioBook3);
        ForWebLibrary forWebLibrary4 = new ForWebLibrary(audioBook4);

 //////////////////////////////////////////////////////////////////////////////
        Library library = new Library();
        library.addBook(bookForLibrary1);
        library.addBook(bookForLibrary2);
        library.addBook(bookForLibrary3);
        library.addBook(bookForLibrary4);
        library.addAudioBook(forWebLibrary1);
        library.addAudioBook(forWebLibrary2);
        library.addAudioBook(forWebLibrary3);
        library.addAudioBook(forWebLibrary4);

        System.out.println(library);

  /*      ArrayList<ArrayList<Integer>> search = library.searchByTitleID("Alpha");

        for (Integer bookFind : search) {
            System.out.println(library.getBookByID(bookFind));


        }*/
    }
}
