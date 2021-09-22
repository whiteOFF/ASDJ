package Playlist;

public class Brano {
    public enum GENRE {Pop, Rock}
    private String title, author;
    private int year;
    private GENRE genre;

    public Brano(String title, String author, int year, GENRE genre) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
    }

    // GETTER
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }
    public GENRE getGenre() { return genre; }

    // SETTER
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setYear(int year) { this.year = year; }
    public void setGenre(GENRE genre) { this.genre = genre; }

    @Override
    public String toString() {
        return "Title: '"+title+'\''+
                ", Author: '"+author+'\''+
                ", Year: "+year+
                ", Genre: '"+genre+"'\n";
    }
}
