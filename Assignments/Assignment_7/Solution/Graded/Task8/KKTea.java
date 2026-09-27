//Task8(1)
public class KKTea extends Tea{
    
    public static int total_sales=0,tnum=0,fnum=0;

    public static void totalSales(){
        System.out.println("Total Sales: "+total_sales+"\nKK Regular Tea: "+tnum);
        if(fnum!=0){
            System.out.println("KK Flavoured Tea: "+fnum);
        }
    }

    public static void updateSoldStatusRegular(KKTea a){
        if(!a.status){
            a.status=true;
            KKTea.tnum++;
            KKTea.total_sales++;
        }
    }
    
    public int weight,tea_bag;

    public KKTea(int n1, int n2){
        super("KK Regular Tea",n1);
        this.tea_bag=n2;
        this.weight=2*this.tea_bag;
    }

    public void productDetail(){
        super.productDetail();
        System.out.println("Weight: "+this.weight+", Tea Bags: "+this.tea_bag);
    }
}