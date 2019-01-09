package Classes;

import Enums.*;

public class ForWebLibrary extends  AudioBook{
    int ID;

    public ForWebLibrary(Title title, AuthorName author, Genres genre, Format format, Language language, TextReader textReader, YearOfRelease yearOfRelease, int ID) {
        super(title, author, genre, format, language, textReader, yearOfRelease);
        this.ID = ID;
    }

    public ForWebLibrary(AudioBook audioBook) {
        super(audioBook);
    }

    @Override
    public String toString() {
        return ID +". " +super.toString() ;
    }
}
