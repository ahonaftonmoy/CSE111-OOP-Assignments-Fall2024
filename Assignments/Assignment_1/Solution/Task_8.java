//Task8
import java.util.Scanner;
public class task8{
     public static void main(String [] args){
          Scanner scnr=new Scanner(System.in);
          System.out.print("row= ");
          int row=scnr.nextInt();
          System.out.print("column= ");
          int column=scnr.nextInt();
          int [][] arr2D=new int[row][column];
          int[]arr1D=new int[row*column];
          for(int r=0;r<row;r++){
               for(int c=0;c<column;c++){
                    arr2D[r][c]=scnr.nextInt();
               }
          }
          int idx=0;
          for(int r=0;r<row;r++){
               for(int c=0;c<column;c++){
                    arr1D[idx]=arr2D[r][c];
                    idx++;
               }
          }
          System.out.println("2D Array: ");
          for(int r=0;r<arr2D.length;r++){
               for(int c=0;c<arr2D[0].length;c++){
                    System.out.print(arr2D[r][c]+" ");
               }
               System.out.println();
          }
          System.out.println("1D Array: ");
          for(int i=0;i<arr1D.length;i++){
               System.out.print(arr1D[i]+" ");
          }
     }
}