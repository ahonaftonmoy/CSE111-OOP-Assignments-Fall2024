//Task3
public class Shelf{
     public int capacity;
     public int nb;
     public void showDetails(){
          System.out.println("Shelf capacity: "+capacity+"\nNumber of books: "+nb);
     }
     public void addBooks(int n){
          if(capacity==0){System.out.println("Zero capacity. Cannot add books.");}
          else if(capacity<(nb+n)){System.out.println("Exceeds capacity");}
          else{System.out.println(n+" books added to shelf");nb+=n;}
     }
}