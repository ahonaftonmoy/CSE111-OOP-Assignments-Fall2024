//Task4
public class Library{
     public int bc;
     public int tb;
     public String [] arr;
     public int count;
     public int setBookCapacity(int n){
          arr=new String[n];
          bc+=n; 
          return bc;
     }
     public void addBook(String s){
          if(tb<bc){
               arr[count++]=s;
               tb++;
               System.out.println("Book '"+s+"' added to the library");
          }
          else{
               System.out.println("Maximum capacity exceeds. You can't add more than "+bc+" books");
          }
     }
     public void printDetail(){
          System.out.println("Maximum capacity: "+bc);
          System.out.println("Total Books: "+tb);
          System.out.println("Book list: ");
          for(int i=0;i<count;i++){
               System.out.println(arr[i]);
          }
     }
}



