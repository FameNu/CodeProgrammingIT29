package Lab4;

public class Song {
    private String title;
    private String artist;
    private int duration;
    private boolean isLike = false;

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDuration() {
        return duration;
    }
    
    public String addToFavorite(){
        if (this.isLike){
            this.isLike = false;
            return getTitle() + " is disliked.";
        }
        else {
            this.isLike = true;
            return getTitle() + " is liked.";
        }
    }
    
    public String getFormattedDuration(){
        int min = getDuration() / 60;
        int sec = getDuration() % 60;
        return min + " min " + sec + " second";
    }
    
    public boolean isSameArtist(Song otherSong){
        return getArtist().equals(otherSong.getArtist());
    }
    
    public String isFavorite(){
        return getTitle() + " " + ((this.isLike) ? "is liked" : "is disliked");
    }

    @Override
    public String toString() {
        return "Song [" + 
                "title=" + getTitle() + 
                ", artist=" + getArtist() + 
                ", " + getFormattedDuration() + 
                ", isLike=" + isFavorite() + ']';
    } 
}
