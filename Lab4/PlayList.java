package Lab4;

public class PlayList {
    private Song[] songs;
    private String name;
    private int songCount;

    public PlayList(String name, int capacity) {
        this.name = name;
        songs = new Song[capacity];
        songCount = 0;
    }

    public Song[] getSongs() {
        return songs;
    }
    public String getName() {
        return name;
    }
    public int getSongCount() {
        return songCount;
    }
    public void setSongs(Song[] songs) {
        this.songs = songs;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }
    
    public void addSong(Song song){
        if (songCount >= songs.length){
            System.out.println("This playlist \"" + name + "\" is full");
            return ;
        }
        songs[songCount++] = song;
        System.out.println("Add " + song.getTitle() + " to playlist: " + name);
    }
    
    public void showPlaylsit(){
        System.out.println("Playlist: " + name);
        for (int i = 0; i < songs.length; i++){
            System.out.println(songs[i]);
        }
    }
    
    public String totalDuration(){
        int total = 0;
        for (int i = 0; i < songCount; i++) {
            total += songs[i].getDuration();
        }
        return "Total duration of all song on " + name + 
                ": " + formattedDuration(total) + " (" + total + " seconds)";
    }
    
    private String formattedDuration(int time){
        int min = time / 60;
        int sec = time % 60;
        return min + " minutes " + sec + " seconds";
    }
    
    public String length(){
        return "Amount of song on playlist: " + songCount;
    }
    
    public void removeSong(String name){
        for (int i = 0; i < songCount; i++){
            if (songs[i].getTitle().equals(name)){
                for (int j = i; j < songCount - 1; j++){
                    songs[j] = songs[j+1];
                }
                songs[--songCount] = null;
                System.out.println("Removed " + name + " from playlist " + this.name);
                return ;
            }
        }
        System.out.println("Not found " + name + " on playlist " + this.name);
    }
}
