//Task8(2)
public class KKFlavouredTea extends KKTea{

    public KKFlavouredTea(String s, int n1, int n2){
        super(n1,n2);
        super.name="KK "+s+" Tea";
    }

    public static void updateSoldStatusFlavoured(KKFlavouredTea a){
        if(!a.status){
           a.status=true;
           KKTea.fnum++;
           KKTea.total_sales++;
        }
    }
}
    