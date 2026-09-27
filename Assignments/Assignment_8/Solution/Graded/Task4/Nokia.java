public class Nokia extends Mobile{
    
    public double bal;

    public Nokia(String s1, boolean b, String s2, double d){
        super(s1,s2,b);
        this.bal=d;
    }

    public String toString(){
        return super.toString()+"\nBalance: "+this.bal;
    }

    public String dialCall(String s){
        if(this.bal==0){return "Insufficient balance! Please recharge.";}
        else if(!super.simCardStatus){return "No SIM card available! Please check the SIM card connectivity.";}
        else{
            String str="";
            for(int i=0;i<=2;i++){str+=s.charAt(i);}
            if(super.getCountryName(str)!=null){
                return "Dialing the number "+s+" to "+super.getCountryName(str)+" region.";
            }
            else{return "Dialing is not allowed in this region.";}
        }
    }

    public void rechargeSIMCard(int n){
        this.bal+=n;
        System.out.println("Recharge Successful! Current balance "+this.bal+" TK.");
    }

    
}