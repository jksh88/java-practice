import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String albumName;
    private ArrayList<Song> songs;

    public Album(String albumName) {
        this.albumName = albumName;
        this.songs = new ArrayList<Song>();
    }

    public boolean addToAlbum(String title, Double duration) {
        if (findSong(title) != null) {
            Song song = new Song(title, duration);
            songs.add(song);
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        for (Song checkedSong: this.songs) {
            if (checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    private LinkedList<Song> playList = new LinkedList<Song>();

    public LinkedList<Song> getPlayList() {
        return playList;
    }

    public boolean addToPlayList(String title) {
        if (findSong(title) != null) {
        playList.add(findSong(title));
            return true;
        }
        return false;
    }
//    List<Song> songs = new LinkedList<>();
}
