package online_radio_one;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Playlist myPlayList = new Playlist();
        for (int i = 0; i <n ; i++) {
            String[] tokens = scanner.nextLine().split(";");
            if(tokens.length!=3){
                continue;
            }
            String artistName = tokens[0];
            String songName = tokens[1];
            int[] time = Arrays.stream(tokens[2].split(":")).mapToInt(Integer::parseInt).toArray();
            Song newSong=null;
            try {
                 newSong = new Song(artistName, songName, time[0], time[1]);
            myPlayList.addSong(newSong);
            }catch (IllegalArgumentException err){
                System.out.println(err.getMessage());
            }
        }

        System.out.println(myPlayList.toString());
    }
}
