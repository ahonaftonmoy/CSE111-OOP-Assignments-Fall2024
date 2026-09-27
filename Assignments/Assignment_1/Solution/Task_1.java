//Task1
import java.util.Scanner;
public class task1{
     public static void main(String [] args){
          Scanner scnr=new Scanner(System.in);
          System.out.println("Enter any ten numbers: ");
          int n,sum=0,max=0,min=0;
          double avg,c=0.00;
          boolean found=true;
          for(int t=1;t<11;t++){
               n=scnr.nextInt();
               if(n%2!=0 && n>0){
                    found=true;
                    c++;
                    if(c==1){max=n;}
                    else{
                         if(n>=max){max=n;}
                         else{min=n;}
                    }
                    sum+=n;
               }
               else{found=false;}
          }
          avg=sum/c;
          if(found){
               System.out.println("Sum = "+sum);
               System.out.println("Minimum = "+min);
               System.out.println("Maximum = "+max);
               System.out.println("Average = "+avg);
          }
          else{
               System.out.println("No odd positive numbers found");
          }
     }
}