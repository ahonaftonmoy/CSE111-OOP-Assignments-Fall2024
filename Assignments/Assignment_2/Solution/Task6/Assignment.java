//Task6
public class Assignment{
    public int tasks;
    public String difficulty;
    public boolean submission;
    public String makeOptional(){
        String s1;
        if(submission==true){
            s1="Assignment will not require submission";
            submission=false;
        }
        else{
            s1="Submission is already not required";
        }
        return s1;
    }
    public void printDetails(){
        System.out.println("Number of tasks: "+tasks);
        System.out.println("Difficulty level: "+difficulty);
        System.out.println("Submission required: "+submission) ;      
    }
}