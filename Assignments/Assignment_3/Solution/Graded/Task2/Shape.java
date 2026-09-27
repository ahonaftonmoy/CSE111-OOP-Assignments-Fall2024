//Task2
public class Shape{
     public String sn;
     public double area;
     public String details(){
          String s="Shape Name: "+sn+"\nArea: "+area;
          return s;
     }
     public String setParameters(String s,int n){
          sn=s;
          area=3.1416*n*n;
          return sn+area;
     }
     public String setParameters(String s,int n1,int n2){
          sn=s;
          area=(n1*n2)/2;
          return sn+area;
     }
     public String setParameters(String s,double n1,double n2){
          sn=s;
          area=(n1*n2);
          return sn+area;
     }
}