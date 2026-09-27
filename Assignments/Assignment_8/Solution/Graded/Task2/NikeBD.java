public class NikeBD{
    
    public static int branches,S,J,C,K;

    public static void status(){
        System.out.println("Nike Bangladesh Status: "+"\nBranches Opened: "+branches);
        System.out.println("Currently Stocked: Jordan: "+J+", Cortez: "+C+", Kobe: "+K);
        System.out.println("Sold: "+S);
    }

    public String outlet;
    public int j,c,k,s;
    
    public NikeBD(String s){
        this.outlet=s;
        NikeBD.branches++;
    }

    public void details(){
        System.out.println("Nike "+this.outlet+" outlet:\nProducts Currently Stocked: Jordan: "+this.j+", Cortez: "+this.c+", Kobe: "+this.k+"\nSold: "+this.s);
    }

    public void restockProducts(String s, int n){
        if(s.equals("Jordan")){this.j+=n;NikeBD.J+=n;}
        else if(s.equals("Cortez")){this.c+=n;NikeBD.C+=n;}
        else{this.k+=n;NikeBD.K+=n;}
    }

    public void restockProducts(String [] a, int [] b){
        for(int i=0;i<a.length;i++){
            restockProducts(a[i],b[i]);
        }
    }

    public void productSold(String s, int n){
        if(s.equals("Jordan")){this.j-=n;NikeBD.J-=n;}
        else if(s.equals("Cortez")){this.c-=n;NikeBD.C-=n;}
        else{this.k-=n;NikeBD.K-=n;}
        this.s+=n;
        NikeBD.S+=n;
    }

    public void productSold(String s1, int n1, String s2, int n2){
        productSold(s1,n1);
        productSold(s2,n2);
    }
}
