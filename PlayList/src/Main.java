import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Album> albums = new ArrayList<>();
        Album OldiesAlbum = new Album("Oldies");
        OldiesAlbum.addToAlbum("Piano Man", 4.25);
        OldiesAlbum.addToAlbum("Words", 3.55);
        OldiesAlbum.addToAlbum("Heaven", 3.5);

        Album FavAlbum = new Album("Oldies");
        FavAlbum.addToAlbum("Gangnam style", 4.2);
        FavAlbum.addToAlbum("Stan", 3.24);
        FavAlbum.addToAlbum("Human Nature", 4);
        FavAlbum.addToAlbum("Burn", 3.45);

        albums.add(OldiesAlbum);
        albums.add(FavAlbum);

//        System.out.println(albums.size());
//        System.out.println(albums.get(1));

        LinkedList<Song> myPlayList = new LinkedList<>();
        OldiesAlbum.addToPlayList("Words", myPlayList);
        play(myPlayList);
    }


    private static void play(LinkedList<Song> playList) {
        ListIterator<Song> songIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + songIterator.next().toString());
        }
    }


}
