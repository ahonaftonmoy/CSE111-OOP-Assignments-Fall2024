//Task3(2)
public class Cat extends Animal{

    public String breed;

    public Cat(String s1, int n, String s2, String s3){
        super(s1, n, s2);
        this.breed=s3;
    }

    public String info(){
        return super.info()+"Breed: "+this.breed;
    }

    public void makeSound(){
        System.out.println(this.color+" color "+this.name+" is meowing");
    }
}