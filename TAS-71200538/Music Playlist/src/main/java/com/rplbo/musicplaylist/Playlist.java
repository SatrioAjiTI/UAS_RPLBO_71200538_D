package com.rplbo.musicplaylist;

import java.util.List;
import java.util.ArrayList;

public class Playlist {
    private String playlistName;
    private static ArrayList<Song> songs;
    private static  int count;

    public Playlist(){
        songs = new ArrayList<Song>(6);
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlayListName(String playlistName) {
        this.playlistName = playlistName;
    }

    public static void print(){
        System.out.println("Jumlah lagu = "+ count+" Kapasitas Playlist = 6");
        int i = 0;
        for (Song song : songs) {
            if (song != null) {
                System.out.println("ListSong[" + i + "] : " + song.getAlbum() + " - " + song.getArtist());
                i = i + 1;
            }
            else {
                continue;
            }
        }
    }

    public String totalTime(){
        int total = 0;
        for (Song song : songs){
            if (song != null) {
                total = total + song.getLength();
            }
            else {
                continue;
            }
        }
        return "Total waktu ["+getPlaylistName()+"] = "+ String.valueOf(total)+" detik";
    }

    public void add(Song s){
        songs.add(s);
        count++;
        if (size()>= 7){
            songs.remove(6);
            count = count -1;
            songs.add(null);
        }

    }

    public Song remove(String name){
        for (Song song : songs){
            String na = song.getAlbum();
            if (na == name) {
                songs.remove(song);
                System.out.println(song.getAlbum() + " terhapus...");
                count = size() - 1;
            }
        }
    return null;
    }

    public int size(){
        return count;
    }
}
