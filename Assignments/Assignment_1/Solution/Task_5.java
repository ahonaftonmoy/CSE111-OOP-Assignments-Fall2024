//Task5
import java.util.Scanner;
public class task5{
     public static void main(String [] args){
          Scanner scnr=new Scanner(System.in);
          System.out.print("Enter the length of the array:");
          int L=scnr.nextInt();
          int [] arr=new int[L];
          for(int t=0;t<L;t++){
               arr[t]=scnr.nextInt();
          }
          int t=0;
          int o=arr.length-1;
          int temp=0;
          while(t<o){
               temp=arr[t];
               arr[t]=arr[o];
               arr[o]=temp;
               t++;
               o--;
          }
          for(int n=0;n<arr.length;n++){
               System.out.print(arr[n]+" ");
          }
     }
}