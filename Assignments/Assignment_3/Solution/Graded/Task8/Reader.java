//Task8
public class Reader{
     public String name;
     public int cpcty;
     public int count;
     public String [] books;
     public String createReader(String s,int n){
          name=s; 
          cpcty=n;
          books=new String[n];
          return "A new reader is created!";
     }
     public void readerInfo(){
          System.out.println("Name: "+name+"\nCapacity: "+cpcty+"\nBooks:");
          if(count>0){
               for(int i=0;i<count;i++){
                    System.out.println("Book "+(i+1)+": "+books[i]);
               }
          }
          else{
               System.out.println("No books added yet");
          }
     }
     public String addBook(String s){
          if(count<cpcty){
               books[count++]=s;
               return books[count-1];
          }
          else{
               System.out.println("No more capacity");
               return"No more capacity";
          }
     }
}