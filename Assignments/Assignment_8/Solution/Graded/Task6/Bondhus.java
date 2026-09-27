public class Bondhus extends SocialMedia{

    public String sentBox[]=new String[5];
    public int count;

    public Bondhus(String s1, String s2){
        super(s1,s2);
    }

    public void showSentbox(){
        System.out.println(super.userName+"'s Sentbox:");
        if(count==0){
            System.out.println("No sent messages.");
        }
        else{
            for(int i=0; i<count; i++){
                System.out.println(sentBox[i]);
            }
        }
    }

    public void sendMessage(String s){
        if(count<sentBox.length){
            sentBox[count++]=s;
        }
        else{
            System.out.println("Sentbox is full.");
        }
    }

    public String toString(){
        return super.toString()+"\nMessages Sent: "+this.count;
    }
}