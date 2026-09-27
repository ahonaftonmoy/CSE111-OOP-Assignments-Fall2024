//Task6(1)
public class Manager extends Employee{
    
    public double bonus, finalSalary;

    public Manager(String s, double n1, int n2, int n3){
        super(s,n1,n2);
        if(n2>40){
            this.bonus=n3;
        }
    }

    public void calculateSalary(){
        this.finalSalary= super.getBaseSalary()*(1+this.bonus/100.0);
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Bonus: "+this.bonus+" %\nFinal Salary: $"+this.finalSalary);
    }

    public void requestIncrement(int n){
        if(super.getHoursWorked()>100){
            super.setBaseSalary(super.getBaseSalary()+n);
            this.calculateSalary();  
            System.out.println("$"+n+"Increment approved.");      
        }
        else if(super.getHoursWorked()>80){
            super.setBaseSalary(super.getBaseSalary()+(n/2));
            this.calculateSalary();  
            System.out.println("$"+(n/2)+" Increment approved.");
        }
        else{
            System.out.println("Increment denied.");
        }
    }
} 