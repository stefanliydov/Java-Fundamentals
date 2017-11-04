package online_radio_one;


import java.lang.reflect.Array;
import java.text.SimpleDateFormat;

 class Song {


    private String artistsName;
    private String songName;
    private int totalSeconds;


     Song(String artistsName, String songName, int minutes, int seconds){
        this.setArtistsName(artistsName);
        this.setSongName(songName);
        this.setTotalSeconds(minutes, seconds);
    }

    private void setArtistsName(String artistsName) {
        if(artistsName.length()<3 || artistsName.length()>20){
            throw new IllegalArgumentException("Artist name should be between 3 and 20 symbols.");
        }
        this.artistsName = artistsName;
    }

    private void setSongName(String songName) {
        if(songName.length()<3 || songName.length()>30){
            throw new IllegalArgumentException("Song name should be between 3 and 30 symbols.");
        }

        this.songName = songName;
    }

    private void setTotalSeconds(int minutes, int seconds) {
        int toSeconds = seconds+(minutes*60);
        if(toSeconds<0||toSeconds>899){
            throw new IllegalArgumentException("Invalid song length.");
        }
        if(minutes<0 || minutes>14){
            throw new IllegalArgumentException("Song minutes should be between 0 and 14.");
        } else if(seconds<0 || seconds>59){
            throw new IllegalArgumentException("Song seconds should be between 0 and 59.");
        }
        this.totalSeconds=toSeconds;
    }

     public int getTotalSeconds() {
         return this.totalSeconds;
     }
 }
