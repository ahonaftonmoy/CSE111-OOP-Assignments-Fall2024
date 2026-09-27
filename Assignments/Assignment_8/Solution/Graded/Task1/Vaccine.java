public class Vaccine{
    
    private String name;
    private int days;
    
    public Vaccine(String s1, String s2, int n){
        this.name=s1;
        this.days=n;
    }

    public String getName(){
        return this.name;
    }

    public int getDays(){
        return this.days;
    }
}