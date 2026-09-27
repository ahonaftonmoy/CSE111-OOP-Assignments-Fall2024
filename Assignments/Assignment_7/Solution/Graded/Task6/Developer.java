//Task6(2)
public class Developer extends Employee{
    public String lang;
    public double finalSalary;

    public Developer(String s1, double n1, int n2, String s2){
        super(s1,n1,n2);
        this.lang=s2;
    }

    public void calculateSalary(){
        if(this.lang.equals("Java")){
            this.finalSalary=super.getBaseSalary()+700;
        }
        else{
            this.finalSalary=super.getBaseSalary();
        }
    }
    
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Language: "+this.lang+"\nFinal Salary: $"+this.finalSalary);
    }
}