//Task5
public class Course{
    public String cn;
    public String cco;
    public int ccr;
    public void updateDetails(String s1,String s2,int n){
    cn=s1;
    cco=s2;
    ccr=n;
    }
    public void displayCourse(){
    System.out.println("Course Name: "+cn);
    System.out.println("Course Code: "+cco);
    System.out.println("Course Credit: "+ccr);
    }
}