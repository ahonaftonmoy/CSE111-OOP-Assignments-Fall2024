//Task5;
public class Triangle{
     public int l,b,h,p;
     public void updateSides(int n1, int n2, int n3){
          this.l=n1;
          this.b=n2;
          this.h=n3;
          this.p=n1+n2+n3;
     }
     public void triangleDetails(){
          System.out.println("Three sides of a triangle are: "+this.l+", "+this.b+", "+this.h);
          System.out.println("Perimeter: "+this.p);
     }
     public String printTriangleType(){
          if(this.l==this.b && this.b==this.h){
               return "This is an Equilateral Triangle.";
          }
          else if(this.l==this.b || this.b==this.h || this.l==this.h){
               return "This is an Isosceles Triangle.";
          }
          else{
               return "This is a Scalene Triangle.";
          }
     }
     public void compareTrinagles(Triangle t){
          if(this==t){
               System.out.println("These two triangle objects have the same address.");
          } 
          else if(this.l==t.l && this.b==t.b && this.h==t.h){
               System.out.println("Addresses are different but the sides of the triangles are equal.");
          }
          else if(this.p==t.p){
               System.out.println("Only the perimeter of both triangles is equal.");
          }
          else{
               System.out.println("Addresses, length of the sides and perimeter all are different");
          }
     }
}