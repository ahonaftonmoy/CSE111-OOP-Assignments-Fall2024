//Task10
import java.util.Scanner;
public class TreasureHunt{
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int [][] arr2D = {{0, 0, 10, 0, -1},
               {0, -1, 0, 0, -1},
               {-1, 0, -1, 0, 0},
               {0, -1, 7, 0, -1},
               {0, -1, 0, -1, 0}
          };
          System.out.println("Initial Map:");
          printMap(arr2D);
          int row = arr2D.length;
          int col = arr2D[0].length;
          int row_pos = -1, col_pos = -1;
          for(int r=0;r<arr2D.length;r++){
               for(int c=0;c<arr2D[0].length;c++){
                    if(arr2D[r][c]==7){
                         row_pos=r;
                         col_pos=c;
                    }
               }
          }
          int turns = 5;
          while (turns > 0) {
               int new_row = row_pos, new_col = col_pos;
               System.out.printf("Enter move %d: ",(6-turns));
               String inp = sc.nextLine();
               //update position
               if(inp.equals("RIGHT")){new_col=col_pos+1;}
               else if(inp.equals("LEFT")){new_col=col_pos-1;}
               else if(inp.equals("UP")){new_row=row_pos-1;}
               else if(inp.equals("DOWN")){new_row=row_pos+1;}
               else{System.out.println("Wrong move");
                    continue;}
               //conditions
               if(new_row<0 || new_row>(row-1) || new_col<0 || new_col>(col-1)){
                    System.out.println("Player fell outside the playing area. Game over!");
                    return;
               }
               else if(arr2D[new_row][new_col]==-1){
                    System.out.println("Player stepped on mine. Game Over!");
                    return;
               }
               else if(arr2D[new_row][new_col]==10){
                    System.out.println("Treasure found.You win!");
                    System.out.println("Final state:");
                    arr2D[new_row][new_col]=7;
                    arr2D[row_pos][col_pos]=0;
                    printMap(arr2D);
                    return;
               }
               else{
                    arr2D[new_row][new_col]=7;
                    arr2D[row_pos][col_pos]=0;
                    row_pos=new_row;
                    col_pos=new_col;
               }
               System.out.println("Current state:");
               printMap(arr2D);
               turns--;
          }
          if (turns == 0) {
               System.out.println("Failed to find the treasure.");
          }
     }
     public static void printMap(int[][] arr) { 
          for(int r=0;r<arr.length;r++){
               for(int c=0;c<arr[0].length;c++){
                    System.out.print(arr[r][c]+"    ");
               }
               System.out.println();
          }
     }
}