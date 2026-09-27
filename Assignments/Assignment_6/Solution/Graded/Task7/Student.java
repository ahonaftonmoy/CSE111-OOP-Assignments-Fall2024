//Task7
public class Student{
    public static int ID,totalStudents,cseStudents,otherDeptStudents;

    public static void printDetails(){
        System.out.println("Total Student(s): "+totalStudents+"\nCSE Student(s): "+cseStudents+"\nOther Department Student(s): "+otherDeptStudents);
    }

    public String name,dept;
    public double CGPA;
    public int id;
    
    public Student(String s, double d){
        this.name=s;
        this.CGPA=d;
        this.id=++Student.ID;
        this.dept="CSE";
        Student.totalStudents++;
        if(this.dept.equals("CSE")){
            Student.cseStudents++;
        }
        else{
            Student.otherDeptStudents++;
        }
    }

    public Student(String s1, double d, String s2){
        this.name=s1;
        this.CGPA=d;
        this.id=++Student.ID;
        this.dept=s2;
        Student.totalStudents++;
        if(s2.equals("CSE")){
            Student.cseStudents++;
        }
        else{
            Student.otherDeptStudents++;
        }
    }

    public void individualDetail(){
        System.out.println("ID: "+this.id+"\nName: "+this.name+"\nCGPA: "+this.CGPA+"\nDepartment: "+this.dept);
    }
}