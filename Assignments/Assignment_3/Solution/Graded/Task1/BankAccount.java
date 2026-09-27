//Task1
public class BankAccount{
     public String type="Not set";
     public int an;
     public String printDetails(){
          String s="Account No: "+an+"\nType: "+type;
          return s;
     }
     public void setInfo(int n,String s){
          type=s;
          an=n;
          System.out.println("Account information updated!");
     }
}