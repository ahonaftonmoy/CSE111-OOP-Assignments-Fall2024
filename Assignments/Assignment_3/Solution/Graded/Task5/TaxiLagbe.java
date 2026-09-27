//Task5
public class TaxiLagbe{
     public String tn;
     public String tl;
     public int tp,tf,count;
     public String [] arr1=new String[4];
     public int [] arr2=new int[4];
     public String storeInfo(String s1, String s2){
          tn=s1; tl=s2; return tn+tl;
     }
     public void printDetails(){
          int sum=0;
          System.out.println("Taxi number: "+tn+
                             "\nThis taxi can cover "+tl+" area"+
                             "\nTotal Passenger: "+tp+
                             "\nPassenger Lists: ");
          for(int i=0;i<count;i++){
               System.out.print(arr1[i]+" ");
               sum+=arr2[i];
          }
          tf=sum;
          System.out.println("\nTotal collected fare: "+tf+" Taka");
     }
     public void addPassenger(String s, int n){
          if(count<arr1.length){
               arr1[count]=s;  arr2[count++]=n;
               System.out.println("Dear "+s+"! Welcome to TaxiLagbe");
               tp++;
          }
          else{
               System.out.println("Taxi Full! No more passengers can be added");
          }
     }
     public void addPassenger(String s1, int n1, String s2,int n2){
          addPassenger(s1,n1);
          addPassenger(s2,n2);
     }
}