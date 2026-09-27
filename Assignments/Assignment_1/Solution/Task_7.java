//Task7
import java.util.Scanner;
public class task7{
     public static void main(String [] args){
          Scanner scnr=new Scanner(System.in);
          System.out.print("Enter the length of array: ");
          int N=scnr.nextInt();
          System.out.println("Please enter the elements of the array: ");
          double [] arr1=new double[N];
          int c=0;
          for(int t=0;t<N;t++){
               arr1[t]=scnr.nextDouble();
          }
          for(int o=1;o<N;o++){
               if(arr1[o]!=arr1[o-1]){c++;}
          }
          double [] arr2=new double[c+1];
          arr2[0]=arr1[0];
          int idx=1;
          for(int n=1;n<N;n++){
               if(arr1[n]!=arr1[n-1]){
                    arr2[idx]=arr1[n];
                    idx++;
               }
          }
          System.out.print("New array: ");
          for(int m=0;m<(c+1);m++){
               System.out.print(arr2[m]+"  ");
          }
          System.out.println("\nRemoved elements: "+(N-c-1));
     }
}