//Task5
public class ComplexNumber extends RealNumber{
    
    public double complexValue;

    public ComplexNumber(){
        super(1.0);
        this.complexValue=1.0;
    }

    public ComplexNumber(double d1, double d2) {
        super(d1);
        this.complexValue = d2;
    }

    public String toString(){
        return super.toString()+"\nImaginaryPart: "+ this.complexValue;
    }
}