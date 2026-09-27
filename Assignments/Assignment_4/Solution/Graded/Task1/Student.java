//Task1
public class Student{
    public String name;
    public String prog;
    public Student(String s1, String s2){
        this.name=s1;
        this.prog=s2;
    }
    public void updateName(String s){
        this.name=s;
    }
    public void updateProgram(String s){
        this.prog=s;
    }
    public String accessProgram(){
        return this.prog;
    }
}