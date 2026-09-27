public class Calculator{
     public void add(int n1,int n2){
          System.out.println(n1+n2);
     }
     public void add(int n1,int n2,int n3){
          System.out.println(n1+n2+n3);
     }
     public void multiply(int n1,int n2){
          System.out.println(n1*n2);
     }
     public void multiply(int n1,int n2,int n3){
          System.out.println(n1*n2*n3);
     }
     public void multiply(String s,int n){
          for(int i=1;i<=n;i++){
               if(i==n){
                    System.out.print(s+"\n");
               }
               else{
                    System.out.print(s+"-");
               }
          }
     }
}