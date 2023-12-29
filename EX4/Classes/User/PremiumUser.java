package EX4.Classes.User;

import EX4.Classes.Playlist.*;
import EX4.Classes.Song.Song;
import EX4.Interface.UserInterface;

public class PremiumUser implements UserInterface{
    Playlist playlist ; 
    String username; 
    public PremiumUser (String username ){
        this.playlist = new Playlist(this);
        this.username = username ;  
    }

    public void listen(Song s ){
            s.PlaySong();
    }

    public void AddToPLaylist(Song s ){
        playlist.add(s);
    }

    
    public void ListPlaylist() {
        playlist.ListPlaylist();
    }

   
    public String GetInfo() {
        return username.concat("-- premium user"); 
    }

   
}
