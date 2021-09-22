import CircularList.CircularLinkedList;
import Playlist.*;
import Playlist.Brano.GENRE;
import Exception.*;

public class Main {

    public static void main(String[] args) {
        Playlist myPlaylist = new Playlist();

        Brano letItBe= new Brano("Let It Be", "The Beatles", 1970, GENRE.Rock);
        Brano godOnlyKnows= new Brano("God Only Knows", "The Beach Boys", 1966, GENRE.Pop);
        Brano bohemianRhapsody= new Brano("Bohemian Rhapsody", "Queen", 1975, GENRE.Rock);
/*
        System.out.println(letItBe);
        System.out.println(godOnlyKnows);
        System.out.println(bohemianRhapsody);
*/
        try {
            myPlaylist.addSong(letItBe);
            myPlaylist.addSong(godOnlyKnows);
            myPlaylist.addSong(bohemianRhapsody);
        } catch (SongAlreadyAddedExc ignored) {}

        try {
            myPlaylist.play(0);
            System.out.println(myPlaylist.getLastSong());
            myPlaylist.play(1);
            System.out.println(myPlaylist.getLastSong());
            myPlaylist.play(1);
            System.out.println(myPlaylist.getLastSong());
            myPlaylist.play(1);
            System.out.println(myPlaylist.getLastSong());
            myPlaylist.play(1);
            System.out.println(myPlaylist.getLastSong());
            myPlaylist.play(-1);
            System.out.println(myPlaylist.getLastSong());
        } catch (EmptyPlaylistExc ignored) {}

        try {
            myPlaylist.removeSong(godOnlyKnows);
            System.out.println(myPlaylist.getLastSong());
            myPlaylist.removeSong(letItBe);
            System.out.println(myPlaylist.getLastSong());
            myPlaylist.removeSong(bohemianRhapsody);
            System.out.println(myPlaylist.getLastSong());
        } catch (SongAbsentExc ignored) {}

        try {
            myPlaylist.play(0);
            System.out.println(myPlaylist.getLastSong());
        } catch (EmptyPlaylistExc ignored) {}

        try { myPlaylist.addSong(letItBe);
        } catch (SongAlreadyAddedExc ignored) {}

        try {
            myPlaylist.play(0);
            System.out.println(myPlaylist.getLastSong());
            myPlaylist.play(-1);
            System.out.println(myPlaylist.getLastSong());
        } catch (EmptyPlaylistExc ignored) {}


    }
}
