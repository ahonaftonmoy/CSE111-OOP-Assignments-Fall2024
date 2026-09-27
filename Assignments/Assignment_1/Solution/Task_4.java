//Task4
import java.util.Scanner;
public class task4{
     public static void main(String [] args){
          Scanner scnr=new Scanner(System.in);
          System.out.println("Enter all small letters: ");      
          String s1=scnr.nextLine();
          String s2="";
          for(int t=0;t<s1.length();t++){
               char ch=s1.charAt(t);
               if(ch=='a'){
                    s2+="z";
               }
               else if(ch>='b'&&ch<='z'){
                    s2+=(char)(ch-1);
               }
          }
          System.out.println(s2);
     }
}