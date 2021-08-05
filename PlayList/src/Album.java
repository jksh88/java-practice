import java.util.ArrayList;

public class Album {
    private String albumName;
    private ArrayList<Song> songs = new ArrayList<>();

    public Album(String albumName, ArrayList<Song> songs) {
        this.albumName = albumName;
        this.songs = songs;
    }

    public boolean addSong(String title, Double duration) {
        Song song = new Song(title, duration);
        songs.add(song);
        return true;
    }

    private Song findSong(String title) {
        for (Song checkedSong: this.songs) {
            if (checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }
//    List<Song> songs = new LinkedList<>();
}
