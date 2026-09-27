//Task6
public class Cargo{
    public String content;
    public double weight;
    public boolean loaded;
    public int cargid;
    public static int id=0;
    public static double capacity=10.0;
    
    public Cargo(String s, double d){
        this.cargid=++Cargo.id;
        this.content=s;
        this.weight=d;
    }

    public void details(){
        System.out.println("Cargo ID: "+this.cargid+", Contents: "+this.content+", Weight: "+this.weight+", Loaded: "+this.loaded);
    }

    public void load(){
        if(Cargo.capacity-this.weight>=0){
            Cargo.capacity-=this.weight;
            this.loaded=true;
            System.out.println("Cargo "+this.cargid+" loaded for transport.");
        }
        else{
            System.out.println("Cannot load cargo, exceeds weight capacity.");
        }
    }

    public void unload(){
        Cargo.capacity+=this.weight;
        this.loaded=false;
    }
    
    public static double capacity(){
        return Cargo.capacity;
    }
}