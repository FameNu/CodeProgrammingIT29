package Lab4;

public class Main {
    public static void main(String[] args) {
//        songPlay();
//        droidFac();
        playListSong();
    }
    
    public static void songPlay(){
        Song song1 = new Song("Ed", "try", 300);
        Song song2 = new Song("What is Hello", "First", 400);
        Song song3 = new Song("Shark", "try", 253);
        Song song4 = new Song("baby", "catch", 153);
        
        System.out.println(song1.addToFavorite());
        System.out.println(song1.addToFavorite());
        
        System.out.println(song1.isSameArtist(song4));
        System.out.println(song1.isSameArtist(song3));
        
        System.out.println(song1.getFormattedDuration());
        song1.getFormattedDuration();
        
        System.out.println(song1);
    }
    
    public static void droidFac(){
        DroidFactory df1 = new DroidFactory(5);
        df1.produceDroid("Alex");
        df1.produceDroid("Bee");
        df1.produceDroid("Cad");
        
        df1.listDroid();
    }
    
    public static void playListSong(){
        PlayList playList = new PlayList("My Luck", 7);
        playList.addSong(new Song("Ed", "Fame", 354));
        playList.addSong(new Song("Baby Shark", "Fame", 258));
        playList.addSong(new Song("Daddy", "Ma", 154));
        playList.addSong(new Song("Shape", "Droid", 36));
        playList.addSong(new Song("What is Hello", "First", 400));
        playList.addSong(new Song("Shark", "try", 253));
        playList.addSong(new Song("baby", "catch", 153));
        System.out.println("");
        
        playList.showPlaylsit();
        System.out.println("");
        
        System.out.println(playList.totalDuration());
        System.out.println(playList.length());
        
        System.out.println("============");
        playList.removeSong("Daddy");
        System.out.println("============");
        playList.showPlaylsit();
        System.out.println("============");
        playList.removeSong("Shark");
        System.out.println("============");
        playList.showPlaylsit();
        
    }
}
