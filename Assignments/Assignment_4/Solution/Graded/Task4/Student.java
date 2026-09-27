//Task4;
public class Student{
     public int ID;
     public int count;
     public double CG;
     public String [] courses;
     public Student(int n){
          this.ID=n;
          System.out.println("A student with ID "+n+" has been created.");
     }
     public Student(int n,double d){
          this.ID=n;
          this.CG=d;
          if(this.CG<3){this.courses=new String[3];}
          else{this.courses=new String[4];}
          System.out.println("A student with ID "+n+" and cgpa "+d+" has been created.");
     }
     public void addCourse(String s){
          if(this.CG==0){
               System.out.println("Failed to add "+s+"\nSet CG first");
          }
          else if(this.CG<3 && this.count>=3){
               System.out.println("Failed to add "+s+"\nCG is low. Can't add more than 3 courses.");       
          }
          else if(this.count>=4){
               System.out.println("Failed to add "+s+"\nMaximum 4 courses allowed.");
          }
          else{
               this.courses[this.count++]=s;
          }
     }
     public void addCourse(String [] arr){
          for(int i=0;i<arr.length;i++){
               addCourse(arr[i]);
          }
     }
     public void storeID(int n){
          this.ID=n; 
     }
     public void storeCG(double d){
          this.CG=d;
          if(this.CG<3){this.courses=new String[3];}
          else{this.courses=new String[4];} 
     }
     public void showAdvisee(){
          System.out.println("Student ID: "+ID+", CGPA: "+CG);
          if(this.count==0){
               System.out.println("No courses added.");
          }
          else{
               System.out.println("Added courses are:");
               for(int i=0;i<count;i++){
                    System.out.print(this.courses[i]+" ");
               }
          }
          System.out.println();
     }
     public void removeAllCourse(){
          for(int i=0;i<count;i++){
               this.courses[i]=null;
          }
          this.count=0;
     }
}