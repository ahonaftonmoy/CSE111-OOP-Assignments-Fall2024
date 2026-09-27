//Task8
public class Employee{
     public String en;
     public double es=30000.0;
     public String eds="junior";
     public void newEmployee(String s){
          en=s;
     }
     public void displayInfo(){
          System.out.println("Employee name: "+en);
          System.out.println("Employee Salary: "+es+" Tk");
          System.out.println("Employee Designation: "+eds);
     }
     public void calculateTax(){
          double tax;
          if(es<=30000){
               System.out.println("No need to pay tax");
          }
          else if(es>30000 && es<=50000){
               tax=(es*10)/100;
               System.out.println(en+" Tax Amount: "+tax+" Tk");
          }
          else{
               tax=(es*30)/100;
               System.out.println(en+" Tax Amount: "+tax+" Tk");
          }
     }
     public void promoteEmployee(String s){
          if(s.equals("senior")){
               es+=25000;
               System.out.println(en+" has been promoted to "+s);
               System.out.println("New Salary: "+es+" Tk");
               eds=s;
          }
          else if(s.equals("lead")){
               es+=50000;
               System.out.println(en+" has been promoted to "+s);
               System.out.println("New Salary: "+es+" Tk");
               eds=s;
          }
          else if(s.equals("manager")){
               es+=75000;
               System.out.println(en+" has been promoted to "+s);
               System.out.println("New Salary: "+es+" Tk");
               eds=s;
          }
     }
}