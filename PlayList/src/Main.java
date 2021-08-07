import java.util.ArrayList;

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

        System.out.println(albums.size());


    }


}
