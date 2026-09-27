public class Person{

    public String name,type,vac;
    public int after,age;
    public boolean dose1,dose2;
    
    public Person(String s1, int n, String s2 ){
        this.name=s1;
        this.age=n;
        this.type=s2;
    }

    public Person(String s, int n){
        this.name=s;
        this.age=n;
        this.type="General Citizen";
    }

    public void pushVaccine(Vaccine v){
        if(this.type.equals("Student") || this.age>=25){
            if(!dose1){
                this.vac=v.getName();
                this.after=v.getDays();
                this.dose1=true;
                System.out.println("1st dose done for "+this.name);
        
            }
            else if(!dose2){
                if(v.getName().equals(this.vac)){
                    this.dose2=true; 
                    System.out.println("2nd dose done for "+this.name);
            
                }
                else{System.out.println("Sorry "+this.name+",  you can't take 2 different vaccines");}
            }
            else{System.out.println("Sorry "+this.name+", you already received both doses.");}
        }
        else{System.out.println("Sorry "+this.name+". Minimum age for taking vaccines is 25 years now.");}
    }

    public void pushVaccine(Vaccine v, String s){
        if(s.equals("2nd Dose")){
            if(!dose1){
                System.out.println("Sorry "+this.name+", invalid dose request");
            }
            else{pushVaccine(v);}
        }
        else if(s.equals("1st Dose")){
            pushVaccine(v);
        }
    }

    public void showDetail(){
        System.out.println("Name: "+this.name+" Age: "+this.age+" Type: "+this.type);
        if(dose1){
            System.out.println("Vaccine name: "+this.vac);
            System.out.println("1st Dose: Given");
        }
        if(!dose2){
            System.out.println("2nd dose: Please come after "+this.after+" days");
        }
        else{System.out.println("2nd dose: Given");}
    }
}
