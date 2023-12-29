package EX4.Classes.User;

import EX4.Classes.Song.Song;
import EX4.Interface.UserInterface;
import EX4.Classes.Playlist.*;

public class FreeUser implements UserInterface {

    private int songSkips ;  
    public String username ; 
    Playlist playlist ; 
    public FreeUser (String username){
        this.playlist = new Playlist(this); 
        songSkips = 3 ; 
    }

    public void listen(Song s ){
        if (this.songSkips > 0 ){
            s.PlaySong();
            this.songSkips--; 
        }
        else {
            System.out.println("Pay Premium Account to have unlimited song skips!");
        }
    }

    public void AddToPLaylist(Song s ){
        this.playlist.add(s);
    }

    public void ListPlaylist(){
        playlist.ListPlaylist();
    }

    
    public String GetInfo() {
        return username.concat(" -- free user ");
        
    }


}
