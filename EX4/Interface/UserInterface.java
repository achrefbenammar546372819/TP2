package EX4.Interface;

import EX4.Classes.Song.Song;
public interface UserInterface {


    void listen(Song s ) ; 
    void AddToPLaylist(Song s ); 
    void ListPlaylist(); 
    String GetInfo(); 
}
