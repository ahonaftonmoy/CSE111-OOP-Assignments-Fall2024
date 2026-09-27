public class Customer{
     public String name;
     public int count;
     public String [] arr1=new String[4];
     public int [] arr2=new int[4];
     public String createCustomer(String s){
          name=s;
          return name;
     }
     public void showCart(){
          System.out.println("Customer: "+name);
          if(arr2[0]!=0){
               for(int i=0;i<count;i++){
                    System.out.println("Item: "+arr1[i]+" Price: "+arr2[i]);
               }
          }
     }
     public void addItem(String s,int n){
          if(count<arr1.length){
               arr1[count]=s;
               arr2[count++]=n;
               System.out.println(arr1[count-1]+" added to cart");
          }
          else{
               System.out.println("Cart is full");
          }
     }
     public void addItem(String s,int n,String s1,int n1){
        if(count<arr1.length){
               arr1[count]=s;
               arr2[count++]=n;
               arr1[count]=s1;
               arr2[count++]=n1;
               System.out.println(arr1[count-2]+" and "+arr1[count-1]+" added to cart");
          }
          else{
               System.out.println("Cart is full");
          }
     }
     public void calculatePrice(){
          int sum=0;
          for(int i=0;i<arr2.length;i++){
               sum+=arr2[i];
          } 
          System.out.println("Total: "+sum);
     }
}