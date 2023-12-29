package EX4.Classes.Album;
import java.util.ArrayList;

import EX4.Classes.Artist.*;
import EX4.Classes.Song.*;


public class Album {
    public Artist artist ; 
    public String AlbumName ; 
    public int realesingYear ; 
    public ArrayList <Song> Tracks; 

    public Album(String ALbumName , Artist artist , int realesingYear ){
        this.AlbumName = ALbumName; 
        this.artist = artist;
        this.realesingYear = realesingYear; 
        this.Tracks = new ArrayList<>() ;
    }

    public void addTrack(Song s){
        if (s.artist == this.artist){
            this.Tracks.add(s); 
        }
        else {
            System.out.println("Song " + s.GetInfo() + "does not belong to artist " + this.artist.getInfo());

        }

    }

    public void removeTrack(Song s ){
        this.Tracks.remove(s) ;
    }

    public void ListAllTracks(){
        String info ; 
        System.out.println("Songs In Album " + this.AlbumName + " by Artist : " + this.artist.Name); 
        for (Song s : this.Tracks){
            info = s.GetInfo(); 
            System.out.println(info);
        }
    }

    @Override
    public boolean equals(Object obj ){
        if (obj == this){
            return true ; 
        }
        else if (obj == null || this.getClass() != obj.getClass()){
            return false ; 
        }
        Album album = (Album) obj ; 
        boolean test_track = album.Tracks.size() == this.Tracks.size();
        int i = 0 ; 
        while(test_track && i < Tracks.size()){
            test_track = Tracks.get(i).equals(album.Tracks.get(i));
            i++;  
        } 
        return i == Tracks.size(); 
        
        
    }

    public String GetInfo(){
        String AlbumInfo = new String(); 
        AlbumInfo.concat("Name : ").concat(AlbumName).concat("Artist : ").concat(artist.getInfo()); 
        AlbumInfo.concat("released : ").concat(String.valueOf(realesingYear)); 
        return AlbumInfo ; 
    }


}
