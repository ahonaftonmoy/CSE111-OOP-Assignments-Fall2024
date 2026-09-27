//Task6(2)
public class Teacher{
     public String name;
     public String initial;
     public String [] courses=new String [3];
     public int count;
     public Teacher(String s1, String s2){
          this.name=s1;
          this.initial=s2;
          System.out.println("A new teacher has been created");
     }
     public void addCourse(Course c){
          if(count<courses.length){
               courses[count++]=c.course;
          }
     }
     public void printDetail(){
          System.out.println("Name: "+this.name+"\nInitial: "+this.initial+"\nList of courses:");
          for(int i=0;i<count;i++){
               System.out.println(courses[i]);
          }
     }
}
