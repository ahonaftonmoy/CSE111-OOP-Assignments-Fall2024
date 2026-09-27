public class Dragon extends MagicalCreature{
    
    public int pl;

    public Dragon(String s, int n1, int n2){
        super(s,n1);
        this.pl=n2;
    }

    public void makeSound() {
        System.out.println(super.name+" roars with a fiery breath!");
    }

    public void performMagic(){
        System.out.println(super.name+" breathes fire with power level: "+this.pl);
    }
    
    public void fly(){
        System.out.println(this.name+"flies through the sky.");
    }
}