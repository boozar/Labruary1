package Classes;

import Enums.*;

import java.util.ArrayList;
import java.util.Random;

public class AudioBook {
    Title title;
    AuthorName author;
    Genres genre;
    Format format;
    Language language;
    TextReader textReader;
    YearOfRelease yearOfRelease;

    public AudioBook(AudioBook audioBook) {
        this.title= audioBook.title;
        this.author= audioBook.author;
        this.genre= audioBook.genre;
        this.format = audioBook.format;
        this.language = audioBook.language;
        this.textReader = audioBook.textReader;
        this.yearOfRelease = audioBook.yearOfRelease;
    }

    public AudioBook(Title title, AuthorName author, Genres genre, Format format, Language language, TextReader textReader, YearOfRelease yearOfRelease) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.format = format;
        this.language = language;
        this.textReader = textReader;
        this.yearOfRelease = yearOfRelease;
    }

    public AudioBook() {

    }


    public AudioBook audioBook() {
        ArrayList<AuthorName> authors = new ArrayList<>();
        ArrayList<Title> titles = new ArrayList<>();
        ArrayList<Genres> genres = new ArrayList<>();
        ArrayList<Format> formats = new ArrayList<>();
        ArrayList<Language> languages = new ArrayList<>();
        ArrayList<TextReader> textReaders = new ArrayList<>();
        ArrayList<YearOfRelease> yearOfReleases = new ArrayList<>();
        Random generator1 = new Random();
        Random generator2 = new Random();
        Random generator3 = new Random();
        Random generator4 = new Random();
        Random generator5 = new Random();
        Random generator6 = new Random();
        Random generator7 = new Random();

        for (AuthorName name : AuthorName.values()) {
            authors.add(name);
        }
        for (Title tit : Title.values()) {
            titles.add(tit);
        }
        for (Genres gen : Genres.values()) {
            genres.add(gen);
        }
        for (Format form : Format.values()) {
            formats.add(form);
        }
        for (Language lang : Language.values()) {
            languages.add(lang);
        }
        for (TextReader textRead : TextReader.values()) {
            textReaders.add(textRead);
        }
        for (YearOfRelease yearOfRel : YearOfRelease.values()) {
            yearOfReleases.add(yearOfRel);
        }

        this.author = authors.get(generator1.nextInt(authors.size()));
        this.title = titles.get(generator2.nextInt(titles.size()));
        this.genre = genres.get(generator3.nextInt(genres.size()));
        this.format = formats.get(generator4.nextInt(formats.size()));
        this.language = languages.get(generator5.nextInt(languages.size()));
        this.textReader = textReaders.get(generator6.nextInt(textReaders.size()));
        this.yearOfRelease = yearOfReleases.get(generator7.nextInt(yearOfReleases.size()));
        AudioBook audioBook = new AudioBook();
        return  audioBook = new AudioBook(this.title, this.author, this.genre, this.format, this.language, this.textReader, this.yearOfRelease);

    }


    public void setFormat(Format format) {
        this.format = format;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public void setTextReader(TextReader textReader) {
        this.textReader = textReader;
    }


    public Title getTitle() {
        return title;
    }

    public AuthorName getAuthor() {
        return author;
    }

    public Genres getGenre() {
        return genre;
    }

    public Format getFormat() {
        return format;
    }

    public Language getLanguage() {
        return language;
    }

    public TextReader getTextReader() {
        return textReader;
    }

    public YearOfRelease getYearOfRelease() {
        return yearOfRelease;
    }

    @Override
    public String toString() {
        return "AudioBook : " +
                "title - " + title +
                ", author - " + author +
                ", genres - " + genre +
                ", format - " + format +
                ", language - " + language +
                ", textReader - " + textReader +
                ", yearOfRelease - " + yearOfRelease ;
    }


}
