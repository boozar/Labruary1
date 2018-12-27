package Classes;

import Enums.AuthorName;
import Enums.Genres;

import java.util.ArrayList;
import java.util.Date;

public class Author  {
    AuthorName name;
    Date birthday;
    ArrayList<Genres> authorGenres;

    public Author() {

    }

    public Author(AuthorName name, Date birthday, Genres authorGenres) {
        this.name = name;
        this.birthday = birthday;
        this.authorGenres = new ArrayList<>();
        this.authorGenres.add(authorGenres);
    }

    public void addAuthorGenres(Genres authorGenre) {
        this.authorGenres.add(authorGenre);
    }

    public AuthorName getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public ArrayList<Genres> getAuthorGenres() {
        return authorGenres;
    }

    @Override
    public String toString() {
        String authorGenre = "";
        for ( Genres genre: this.authorGenres) {
            authorGenre += genre + ", ";
        }

        authorGenre = authorGenre.substring(0, authorGenre.length() - 2);
        return " " + name + " (" + birthday.getDay() + '.' + birthday.getMonth() + 1 + '.' + (birthday.getYear() + 1900) + "), Genres : " + authorGenre + " ";
    }

    /////////////////////////////////////////

  /*  public String arrayToString(ArrayList<Enum> enumE) {
        this. = enumE;
        String enumString = "";
        for ( Enum en: this.eEnum) {
            enumString += en + ", ";
        }
        return  enumString = enumString.substring(0, enumString.length() - 2);
    }*/

}



