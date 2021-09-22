package Library;

public class Book {

    public enum Genre {
        LITERATURE,
        INVESTIGATION,
        HORROR
    }

    private String title, author;
    private Genre genre;

    // CONTRUCTOR
    public Book() {};
    public Book(String title, String author, Genre genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    // GETTER
    public String getTitle() { return this.title; }
    public String getAuthor() { return this.author; }
    public Genre getGenre() { return this.genre; }

    // SETTER
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setGenre(Genre genre) { this.genre = genre; }

    // TO-STRING
    public String toString() {
        return "Title: '"+ this.title+
                "', Author: '"+ this.author+
                "', Genre: '"+ this.genre+"'\n";
    }
}
