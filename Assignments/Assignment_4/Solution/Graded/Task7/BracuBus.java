//Task7(2)
public class BracuBus{
     public String route;
     public int count;
     public String [] passenger;
     public BracuBus(String s){
          this.route=s;
          this.passenger=new String[2];
     }
     public BracuBus(String s,int n){
          this.route=s;
          this.passenger=new String[n];
     }
     public void showDetails(){
          System.out.println("Bus Route: "+this.route);
          System.out.println("Passenger Count: "+count+" (Max: "+this.passenger.length+")");
          System.out.println("Passenger on Board:");
          for(int i=0;i<count;i++){
               System.out.print(passenger[i]+" ");
          }
          System.out.println();      
     }
     public void board(){
          System.out.println("No passengers");
     }
     public void board(BracuStudent a){
          if(!a.bp){System.out.println("You don't have a bus pass!");}
          else if(a.loc==this.route){
               if(count<passenger.length){
                    passenger[count++]=a.name;
                    System.out.println(a.name+" boarded the bus");
               }
               else{System.out.println("Bus is full!");}
          }
          else{System.out.println("You got on the wrong bus!");}
     }
     public void board(BracuStudent a, BracuStudent b){
          board(a);
          board(b);
     }
}
