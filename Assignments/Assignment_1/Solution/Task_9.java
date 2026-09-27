//Task9
public class task9{
     public static void main(String [] args){
          int [][] A=  {{1, 0, 0},
               {0, 1, 0},
               {0, 0, 1}};
          boolean Iden=true;
          for(int r=0;r<A.length;r++){
               for(int c=0;c<A[0].length;c++){
                    if((r==c && A[r][c]!=1) || (r!=c && A[r][c]!=0)){
                         Iden=false;
                         break;
                    }
               }
               if(!Iden){break;}
          }
          if(Iden){
               System.out.println("Identity Matrix");
          }
          else{
               System.out.println("Not an Identity Matrix");
          }
     }
}