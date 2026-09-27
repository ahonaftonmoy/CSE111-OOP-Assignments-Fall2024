//Task7
public class CinemexTicket extends MovieTicket{
    
    private static int totalTickets=0;
    
    public static int getTotalTickets(){
        return totalTickets;
    }

    public String genre,id,status;

    public CinemexTicket(String s1, String s2, String s3, String s4){
        super(s1,s4,s2,0);
        CinemexTicket.totalTickets++;
        this.genre=s3;
        this.seat=super.seatTypes[0];
        this.status="Not Paid";
        this.id=super.getMovie()+"-"+super.seat.charAt(0)+"-"+CinemexTicket.totalTickets;   
    }

    public CinemexTicket(String s1, String s2, String s3, String s4,String s5){
        super(s1,s4,s2,0);
        CinemexTicket.totalTickets++;
        this.genre=s3;
        this.seat=s5;
        this.status="Not Paid";
        this.id=super.getMovie()+"-"+super.seat.charAt(0)+"-"+CinemexTicket.totalTickets;
    }

    public void calculateTicketPrice(){
        double d=0;
        for(int i=0;i<seatTypes.length;i++){
            if(this.seat.equals(super.seatTypes[i])){
                d=super.seatPrices[i];
                break;
            }
        }
        String s[]=super.showtime.split(":");
        int n=Integer.parseInt(s[0]);
        if(n>=18 && n<=23){
            d*=(1+super.nightShowCharge/100.0);
        }
        super.setPrice(d);
        System.out.println("Ticket price is calculated successfully.");
    }

    public String toString(){
        return "Ticket ID: "+this.id+"\n"+super.toString()+"\nGenre: "+this.genre+"\nSeat Type: "+this.seat+"\nPrice(tk): "+super.getPrice()+"\nStatus :"+this.status;
    }

    public String confirmPayment(){
        if(this.status.equals("Not Paid")){
            this.status="Paid";
            return "Payment Successful.";
        }
        else{return "Ticket price is already paid!";}
    }
}
