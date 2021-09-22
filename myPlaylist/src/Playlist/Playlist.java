package Playlist;

import CircularList.CircularLinkedList;
import CircularList.CircularNode;
import Exception.*;

public class Playlist {
    private CircularNode<Brano> lastSong;
    private CircularLinkedList <Brano> playlist;

    public Playlist() {
        playlist = new CircularLinkedList<>();
        this.lastSong = null;
    }

    // LAST SONG
    public void setLastSong(Brano song) { this.lastSong.setElement(song); }
    public Brano getLastSong() { return this.lastSong.getElement(); }

    // ADD SONG AT PLAYLIST
    public void addSong(Brano song) throws SongAlreadyAddedExc {
        if (playlist.searchElement(song))
            throw new SongAlreadyAddedExc();
        else {
            playlist.addElement(song);
            System.out.println("_".repeat(23)+"\nsong added sucessfully!\n"+"-".repeat(23)+"\n");
            if (playlist.getSize()==1)
                lastSong= new CircularNode<>(song);
        }
    }

    // REMOVE SONG FROM PLAYLIST
    public void removeSong(Brano song) throws SongAbsentExc {
        if (playlist.searchElement(song)) {
            playlist.remove(song);
            try { play(0);
            } catch (EmptyPlaylistExc ignored) {}
            System.out.println("song removed");
        }
        else throw new SongAbsentExc();

    }

    // PLAY SONGS FROM PLAYLIST
    public void play(int flag) throws EmptyPlaylistExc {
        if (playlist.isEmpty())
            throw new EmptyPlaylistExc();
        else
            switch (flag) {
                case 0 -> lastSong = playlist.getHead();
                case +1 -> lastSong = lastSong.getNext();
                case -1 -> lastSong = lastSong.getPrev();
            }
    }


}
