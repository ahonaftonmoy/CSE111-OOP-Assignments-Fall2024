//Task8
public class Player{
    public static int total,idx;
    public static String [] Name=new String[11];

    public String name;
    public String country;
    public int number;

    public static void info(){
        System.out.println("Total number of players: "+Player.total);
        System.out.print("Players enlisted so far: ");
        for(int i=0;i<idx;i++){
            if(i==idx-1){
                System.out.print(Player.Name[i]);
            }
            else{
                System.out.print(Player.Name[i]+", ");
            }
        }
        System.out.println();
    }

    public Player(String s1, String s2, int n){
        if(idx<Player.Name.length){
            this.name=s1;
            this.country=s2;
            this.number=n;        
            Player.total++;
            Player.Name[idx++]=s1;
        }
        else{
            System.out.println("Cannot add more players.");
        }
    }
    
    public String player_detail(){
        return "Player Name: "+this.name+"\nJersey Number: "+this.number+"\nCountry: "+this.country;
    }
}