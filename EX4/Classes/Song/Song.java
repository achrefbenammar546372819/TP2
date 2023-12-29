package EX4.Classes.Song;
import EX4.Classes.Artist.*;
public class Song {
    public int length ;
    public String Name ; 
    public Artist artist ; 

    public Song(Artist artist , int length , String Name){
        this.Name = Name; 
        this.artist = artist ; 
        this.length= length ; 
    }

    public int  GetLength(){return this.length; }
    public Artist  GetArtist(){return this.artist ;}
    
    public void PlaySong(){
        System.out.println("Playing " + this.Name + " by : " + this.artist.getInfo()); 
    }

    public String GetInfo(){
        String info = this.Name + " by " + artist.Name ; 
        return info;

    }

    @Override
    public boolean equals(Object s ){
        if (this == s) {
            return true;
        }

        if (s == null || getClass() != s.getClass()) {
            return false;
        }
        Song song  = (Song) s ;  
        if (song.Name.equals(this.Name) && this.artist.equals(song.artist)){
            return true ; 
        }
        return false ; 
    }

}
