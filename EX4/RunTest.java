package EX4;

import EX4.Classes.Album.Album;
import EX4.Classes.Artist.Artist;
import EX4.Classes.Song.Song;
import EX4.Classes.User.FreeUser;
import EX4.Classes.User.PremiumUser;
import EX4.Interface.UserInterface;

public class RunTest {
    public static void main(String [] args ){
        Artist artist = new Artist("I wish I was dinosaur"); 
        Album album1 = new Album("So I ", artist, 2014); 
        Album album2 = new Album("can be dead", artist, 2015); 
        Song s11 = new Song(artist, 33, "SONG11"); 
        Song s12 = new Song(artist, 33, "SONG12"); 
        Song s21 = new Song(artist, 33, "SONG21"); 
        Song s22 = new Song(artist, 33, "SONG22");
        album1.addTrack(s11);
        album1.addTrack(s12);
        album2.addTrack(s21);
        album2.addTrack(s22);
        artist.AddAlbum(album2);
        artist.AddAlbum(album1);
        artist.ListDiscorgraphy();

        UserInterface users [] = new UserInterface[2]; 
        users[0] = new FreeUser("User1");
        users[1] = new PremiumUser("User2"); 
        for (int i = 0 ; i < 10 ; i ++){
            users[0].listen(s22);
        } 

        users[1].AddToPLaylist(s22);
        users[1].AddToPLaylist(s21);
        users[1].AddToPLaylist(s12);
        users[1].ListPlaylist(); 

    }
}
