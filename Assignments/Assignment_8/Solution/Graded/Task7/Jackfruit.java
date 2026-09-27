public class Jackfruit extends Fruit{

    public Jackfruit(){
        super(false,"Jackfruit");
    }

    public String toString(){
        if(super.hasFormalin()){
            return "Jackfruits are bad for you";
        }
        else{
            return "Jackfruits are good for you";
        }
    }
}