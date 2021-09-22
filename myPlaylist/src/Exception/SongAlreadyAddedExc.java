package Exception;

import java.util.Arrays;

public class SongAlreadyAddedExc extends Exception {
    public SongAlreadyAddedExc () {
        System.out.println("*".repeat(27)+"\nSong has already been added\n"+"*".repeat(27)+"\n");
    }
}
