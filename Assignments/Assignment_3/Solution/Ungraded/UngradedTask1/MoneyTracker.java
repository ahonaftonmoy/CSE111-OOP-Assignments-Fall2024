public class MoneyTracker{
     public String name;
     public double blnce,inc,exp;
     public String info(){
          return "Name: "+name+"\nCurrent Balance: "+blnce;
     }
     public String createTracker(String s){
          name=s;
          blnce=1.0;
          return name+blnce;
     }
     public void income(int n){
          inc=n;
          blnce+=n;
          System.out.println("Balance Updated!");
     }
     public void expense(int n){
          if(blnce==n){
               blnce-=n;
               System.out.println("You’re broke!");
          }
          else if(blnce<n){
               System.out.println("Not enough balance");
          }
          else{
               exp=n;
               blnce-=n;
               System.out.println("Balance Updated.");
          }
     }
     public void showHistory(){
          System.out.println("Last added: "+inc+"\nLast spent: "+exp);
     }
}