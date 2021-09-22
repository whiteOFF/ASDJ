package Exception;

public class SongAbsentExc extends Exception {
    public SongAbsentExc() {
        System.out.println("*".repeat(37)+"\nThere isn't this song in the playlist\n"+"*".repeat(37)+"\n");
    }
}
