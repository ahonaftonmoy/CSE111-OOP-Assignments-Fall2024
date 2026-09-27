//Task6
public class Student{
     public String name="Not set";
     public String dept="CSE";
     public double cgpa;
     public int cred=9;
     public String sclr="Not set";
     public void showDetails(){
          System.out.println("Name: "+name+"\nDepartment: "+dept+
                             "\nCGPA: "+cgpa+"\nCredits: "+cred+
                             "\nScholarship Status: "+sclr);
     }
     public String updateDetails(String s,double d){
          name=s; cgpa=d;
          return name+cgpa;
     }
     public String updateDetails(String s,double d,int n){
          name=s; cgpa=d; cred=n;
          return name+cgpa+cred;
     }
     public String updateDetails(String s1,double d,int n,String s2){
          name=s1; cgpa=d; cred=n; dept=s2;
          return name+cgpa+cred+dept;
     }
     public void checkScholarshipEligibility(){
          if(cgpa>=3.5 && cred>10){
               if(cgpa>=3.7){
                    sclr="Merit based scholarship";
                    System.out.println(name+" is eligible for "+sclr);
               }
               else{
                    sclr="Need based scholarship";
                    System.out.println(name+" is eligible for "+sclr);
               }
          }
          else{
               sclr="No scholarship";
               System.out.println(name+" is not eligible for scholarahip");
          }
     }
}