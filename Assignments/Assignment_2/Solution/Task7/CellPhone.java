//Task7
public class CellPhone{
     public String model="unknown";
     public int contactStored;
     public String [] arr=new String[3];
     public void printDetails(){
          System.out.println("Phone Model "+model);
          System.out.println("Contacts Stored "+contactStored);
          if(contactStored>0){
               System.out.println("Stored Contacts: ");
               for(int i=0;i<contactStored;i++){
                    System.out.println(arr[i]);
               }
          } 
     }
     public void storeContact(String s){
          if(contactStored<arr.length){
               arr[contactStored]=s;
               System.out.println("Contact Stored");
               contactStored++;
          }
          else{
               System.out.println("Memory full. New contact can't be stored.");
          }
     }
}