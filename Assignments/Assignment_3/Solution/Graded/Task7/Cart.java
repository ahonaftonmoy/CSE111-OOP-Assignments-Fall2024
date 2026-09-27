//Task7
public class Cart{
     public int cnu;
     public int count;
     public double d;
     public String [] arr1=new String[3];
     public double [] arr2=new double[3];
     public int create_cart(int n){
          cnu=n;
          return cnu;
     }
     public void addItem(String s,double d){
          if(count<arr1.length){
               arr1[count]=s;
               arr2[count++]=d;
               System.out.println(s+" added to cart "+cnu+"\nYou have "+count+" item(s) in your cart now");
          }
          else{
               System.out.println("You already have 3 items on your cart");
          }
     }
     public void addItem(double d,String s){
          if(count<arr1.length){
               arr1[count]=s;
               arr2[count++]=d;
               System.out.println(s+" added to cart "+cnu+"\nYou have "+count+" item(s) in your cart now");
          }
          else{
               System.out.println("You already have 3 items on your cart");
          }
     }
     public void cartDetails(){
          double sum=0;
          System.out.println("Your cart (c"+cnu+") :");
          for(int i=0;i<count;i++){
               System.out.println(arr1[i]+" - "+arr2[i]);
               sum+=arr2[i];
          }
          System.out.println("Discount Applied: "+d+"%");
          System.out.println("Total Price : "+(sum*(1.0-(d/100.0))));
     }
     public double giveDiscount(double d){
          this.d=d;
          return this.d;
     }
}