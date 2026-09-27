//Task6
import java.util.Scanner;
public class task6{
     public static void main(String [] args){
          Scanner scnr=new Scanner(System.in);
 //         System.out.print("Enter the number of inputs: ");
//          int N=scnr.nextInt();
//          int [] arr=new int[N];
          int c;
         boolean found;
//          for(int t=0;t<N;t++){
//               arr[t]=scnr.nextInt();
//          }
          int [] arr={25, 18, 22, 34, 28, 17, 32, 30, 21, 19, 27, 35, 16, 29, 20, 18, 24, 26, 23, 32,
22, 28, 18, 33, 30, 21, 20, 19, 25, 17, 26, 27, 29, 24, 24, 18, 32, 19, 20, 30,
23, 27, 33, 16, 25, 28, 31, 22, 21, 34, 29, 25, 24, 30, 19, 27, 17, 23, 21, 35,
18, 22, 19, 16, 32, 27, 33, 26, 21, 24, 25, 29, 22, 19, 20, 28, 22, 23, 34, 17,
20, 31, 19, 26, 21, 18, 24, 27, 25, 30, 32, 21, 33, 18, 36, 29, 23, 19, 31, 20};
          for(int o=0;o<arr.length;o++){
               c=0;
               found=true;
               for(int n=0;n<arr.length;n++){
                    if(arr[n]==arr[o]){c++;}
                    if(c>1 && n==o){found=false;
                                             break;}
               }
               if(found){
                    System.out.println(arr[o]+" - "+c+" times");}
          }
      System.out.println(arr.length);
     }
}