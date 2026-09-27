public class Mango extends Fruit{

    public Mango(){
        super(true,"Mango");
    }

    public String toString(){
        if(super.hasFormalin()){
            return "Mangos are bad for you";
        }
        else{
            return "Mangoes are good for you";
        }
    }
}