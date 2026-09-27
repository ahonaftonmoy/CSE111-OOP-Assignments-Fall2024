//Task1
public class UniversityTester{
     public static void main(String [] args){
          //(a)
          University uni1=new University();
          University uni2=new University();
          System.out.println(uni1+"\n"+uni2);//The locations of the objects are not the same.
          System.out.println(uni1.name+" "+uni1.country);
          System.out.println(uni2.name+" "+uni2.country);
          //(b)
          uni1.name="Imperial College London";
          uni1.country="England";
          uni2.name="Brac University";
          uni2.country="Bangladesh";
          System.out.println(uni1.name+", "+uni1.country);
          System.out.println(uni2.name+", "+uni2.country);
          /*Yes, the instance variable of both objects have changed
           and they are not of the same value.*/
     }
}