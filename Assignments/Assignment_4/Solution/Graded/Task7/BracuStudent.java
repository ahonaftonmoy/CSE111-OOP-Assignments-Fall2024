//Task7(1)
public class BracuStudent{
     public String name,loc;
     public boolean bp;
     public BracuStudent(String s1, String s2){
          this.name=s1;
          this.loc=s2;
     }
     public void showDetails(){
          System.out.println("Student name: "+this.name+"\nLives in "+this.loc+"\nHave Bus Pass? "+this.bp);
     }
     public void getPass(){
          this.bp=true;
     }
     public void updateHome(String s){
          this.loc=s;
     }
}