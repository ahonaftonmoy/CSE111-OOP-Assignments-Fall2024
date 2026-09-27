public class Usis{
     public int totalAdvisee;
     public Student [] arr=new Student[5];
     public Usis(){
          System.out.println("Usis is ready to use!");
     }
     public void login(Student s){
          if(s.email==null || s.password==null){
               System.out.println("Email and password need to be set.");
          }
          else{
               s.login_status=true;
               System.out.println("Login successful");
          }
     }
     public void advising(Student s){
          if(!s.login_status){
               System.out.println("Please login to advise courses!");
          }
          else if(s.count==0){
               System.out.println("You haven't selected any courses.");
          }
     }
     public void advising(Student s, String s1, String s2, String s3, String s4){
          System.out.println("You need special approval to take more than 3 courses.");
     }
     public void advising(Student s, String s1, String s2, String s3){
          if(s.login_status){
               s.addCourse(s1);
               s.addCourse(s2);
               s.addCourse(s3);
               if(totalAdvisee<5 && s.count>0){
                    arr[totalAdvisee++]=s;
                    System.out.println("Advising successful!");
               }
          }
          else{System.out.println("Please login to advise courses!");}
     }
     public void allAdviseeInfo(){
          System.out.println("Total Advisee: "+this.totalAdvisee);
          for(int i=0;i<this.totalAdvisee;i++){
               System.out.println("Name: "+arr[i].name+" ID: "+arr[i].id);
               System.out.println("Department: "+arr[i].dept);
               System.out.println("Advised Courses: ");
               for(int j=0;j<arr[i].count;j++){
                    System.out.print(arr[i].courses[j]+" ");
               }
               System.out.println();
               System.out.println("==============");
          }
     }
}