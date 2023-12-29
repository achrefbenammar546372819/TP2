package EX4.Classes.Artist;

import java.util.ArrayList;

import EX4.Classes.Album.Album;

public class Artist {
    public String Name ; 
    public ArrayList<Album> Discorgraphy ; 
    
    public Artist (String Name ){
        this.Name = Name;
        this.Discorgraphy = new ArrayList<>(); 
    }

    public void AddAlbum(Album a ){
        if (a.artist == this ){
            this.Discorgraphy.add(a) ; 
        }
        else {
            System.out.println("Album " + a.GetInfo() + "does not belong to artist " + this.getInfo());
        }
 
    }

    public void DeleteAlbum(Album a ){
        this.Discorgraphy.remove(a); 
    }



    public String getInfo(){return this.Name; }

    public void ListDiscorgraphy(){
        System.out.println("Discorgraphy of " + this.getInfo());
        if (this.Discorgraphy != null ){
            for (Album a : this.Discorgraphy){
                a.ListAllTracks();
            }
        }
        

    }
}
