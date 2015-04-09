package com.nodakmutual.learnrecyclerview;


public class ArtistInfo {
    private String artistName;
    private String songTitle;
    private String trackCount;
    private String year;
    private String publisher;
    private int image;

    public ArtistInfo(int image, String artistName, String songTitle, String trackCount, String year, String publisher) {
        this.artistName = artistName;
        this.songTitle = songTitle;
        this.trackCount = trackCount;
        this.year = year;
        this.publisher = publisher;
        this.image = image;
    }

    public int getImage(){
        return image;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public String getTrackCount() {
        return trackCount;
    }

    public String getYear() {
        return year;
    }

    public String getPublisher() {
        return publisher;
    }
}
