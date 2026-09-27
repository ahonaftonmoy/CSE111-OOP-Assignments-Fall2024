public class Phoenix extends MagicalCreature{
    
    public int pl;

    public Phoenix(String s, int n1, int n2){
        super(s,n1);
        this.pl=n2;
    }

    public void makeSound() {
        System.out.println(super.name+" sings an enchanting song.");
    }

    public void performMagic(){
        System.out.println(super.name+" is reborn with "+this.pl+" rebirth cycles.");
    }
    
    public void regenerate(){
        System.out.println(this.name+"regenerates its body in a burst of flames.");
    }
}