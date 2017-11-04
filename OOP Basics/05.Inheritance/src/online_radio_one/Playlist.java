package online_radio_one;

import java.util.LinkedList;
import java.util.List;

public class Playlist {
    private List<Song> songs;
     Playlist(){
        this.songs = new LinkedList<>();
    }

     void addSong(Song song){
        this.songs.add(song);
         System.out.println("Song added.");
    }

    private int getTime(){
         int allSongSec=0;
        for (Song song:
             this.songs) {
            int seconds = song.getTotalSeconds();
            allSongSec+=seconds;
        }
        return allSongSec;
     }
    @Override
    public String toString() {
        int totalSeconds = this.getTime();
        int hours = totalSeconds/3600;
        int minutes = (totalSeconds/60) - (hours* 60);
        int seconds = totalSeconds%60;
        return String.format("Songs added: %s\nPlaylist length: %sh %sm %ss",this.songs.size(),hours,minutes,seconds);
    }
}
