import java.util.LinkedList;
import java.util.List;

public class PlayList {
    private String genre;
    List<Song> playList ;

    public PlayList(String genre) {
        this.genre = genre;
        this.playList =  new LinkedList<>();
    }

    public boolean addToPlayList(Song song) {
playList.add(song);
return true;
    }
}
