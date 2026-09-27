//Task2
import java.util.Scanner;
public class task2{
     public static void main(String [] args){
          Scanner scnr=new Scanner(System.in);
          System.out.print("Enter the starting number: ");
          int start=scnr.nextInt();
          System.out.print("Enter the ending number: ");
          int end=scnr.nextInt();
          int c=0;
          if(start<end){
               for(int t=start;t<=end;t++){
                    if(isPrime(t)){c++;}
               }
               System.out.println("There are "+c+" prime numbers between "+start+" and "+end+".");
          }
          else{
               for(int o=end;o<=start;o++){
                    if(isPrime(o)){c++;}
               }
               System.out.println("There are "+c+" prime numbers between "+end+" and "+start+".");
          }
     }
     public static boolean isPrime(int n){
          int c=0;
          for(int m=2;m<n;m++){
               if(n%m==0){c++;}
          }
          if(c==0){return true;}
          else{return false;}
     }
}