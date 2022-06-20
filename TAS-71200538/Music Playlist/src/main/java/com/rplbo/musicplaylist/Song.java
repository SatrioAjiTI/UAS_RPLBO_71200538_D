package com.rplbo.musicplaylist;

public class Song {
    private String artist;
    private String album;
    private String name;
    private int length;

    public Song(String album, String artist, String name, int length) {
        this.artist = artist;
        this.album = album;
        this.name = name;
        this.length = length;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
