package com.example.dell.musicapplication;

/**
 * Created by dell on 03/04/2018.
 */

public class Song {
    private String name;
    private String artist;
    private String album;
    private int imageID;

    public Song(){}

    public Song(String name,String artist,String album){
        this.name=name;
        this.artist=artist;
        this.album=album;
    }

    public Song(String name,String artist,String album,int id){
        this.name=name;
        this.artist=artist;
        this.album=album;
        this.imageID = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }
}


