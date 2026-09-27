//Task3
public class Shape2D{
    public int length;
    public int breadth;
    public int height;
    public double area;
    public String shape;
    public Shape2D(){
        length=5;
        shape="Square";
        System.out.println("A "+shape+" has been created with length: "+length);
    }
    public Shape2D(int n1, int n2){
        length=n1;
        breadth=n2;
        shape="Rectangle";
        System.out.println("A "+shape+" has been created with length: "+n1+" and breadth: "+n2);
    }
    public Shape2D(int n1, int n2, int n3){
        length=n1;
        breadth=n2;
        height=n3;
        shape="Triangle";
        System.out.println("A "+shape+" has been created with the following sides: "+n1+", "+n2+", "+n3);
    }
    public Shape2D(int n1, int n2, String s){
        height=n1;
        breadth=n2;
        shape=s;
        System.out.println("A "+s+" has been created with height: "+n1+" and base: "+n2);
    }
    public void area(){
        if(shape.equals("Square")){
            area=length*length*1.0;
            System.out.println("The area of the Square is: "+area);
        }
        else if(shape.equals("Rectangle")){
            area=length*breadth*1.0;
            System.out.println("The area of the Rectangle is: "+area);
        }
        else if(shape.equals("Triangle") && length==0){
            area=breadth*height*0.5;
            System.out.println("The area of the Triangle is: "+area);
        }
        else{
            double sum=(length+breadth+height)/2;
            area=Math.pow(sum*(sum-length)*(sum-breadth)*(sum-height),0.5);
            System.out.printf("The area of the Triangle is: %.3f\n",area);
        }
    }
}