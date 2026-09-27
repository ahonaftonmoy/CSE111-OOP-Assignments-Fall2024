//Task3
import java.util.Scanner;
public class task3{
     public static void main(String [] args){
          Scanner scnr=new Scanner(System.in);
          String s1=scnr.nextLine();
          String s2=scnr.nextLine();
          String s3="";
          for(int t=0;t<s1.length();t++){
               char ch1=s1.charAt(t);
               s3+=ch1;
          }
          s3+=" ";
          for(int o=0;o<s2.length();o++){
               char ch2=s2.charAt(o);
               s3+=ch2;
          }
          System.out.println(s3);
          int sum=0;
          for(int n=0;n<s3.length();n++){
               char ch3=s3.charAt(n);
               if((ch3>='A'&&ch3<='Z') ||(ch3>='a'&&ch3<='z')){
                    sum+=(int)ch3;
               }
          }
          System.out.println(sum);
     }
}