package EX4.Classes.Playlist;
import EX4.Classes.Song.*;
import EX4.Interface.UserInterface;
import java.util.ArrayList;
import java.util.Collections;

public class Playlist {
    ArrayList<Song> List ; 
    UserInterface user ; 


    public Playlist(UserInterface user ){
        this.user = user ;
        this.List = new ArrayList<>(); 
    }

    public void add(Song s ){
        List.add(s); 
    }

    public void  remove(Song s ){
        List.remove(s) ; 
    }

    public void shuffle (){
        Collections.shuffle(this.List); 
    }

    public void ListPlaylist(){
        String info ; 
        System.out.println("Songs In PLaylist" + this.user.GetInfo() ); 
        for (Song s : this.List){
            info = s.GetInfo(); 
            System.out.println(info);
        }
    }


}
