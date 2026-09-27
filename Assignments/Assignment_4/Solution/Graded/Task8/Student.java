//Task8(1)
public class Student{
     public String name;
     public String dept;
     public String email;
     public String password;
     public boolean login_status;
     public String [] courses=new String[3];
     public int count;
     public int id;
     public Student(String s1, int n, String s2){
          this.name=s1;
          this.id=n;
          this.dept=s2;
          System.out.println("Student object is created");
     }
     public void addCourse(String s){
          if(this.count<this.courses.length){
               courses[count++]=s;
          }
     }
}