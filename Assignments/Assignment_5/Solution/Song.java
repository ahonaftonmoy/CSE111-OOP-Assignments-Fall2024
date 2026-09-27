//Task1
public class Song {
    public String name;
    public String artist;
    public int length;
    public Song next;
    
    public Song(String s1, String s2, int n){
        this.name=s1;
        this.artist=s2;
        this.length=n;
    }
    
    public void songInfo(){
        System.out.println("Title: "+this.name+"\nArtist: "+this.artist+"\nLength: "+this.length+" minutes");
    }
}
