public class Playlist{
     public String name;
     public Song head;
     public int count;
     
     //Task2
     public Playlist(String s){
          this.name=s;
          System.out.println(s+" created.");
     }   
     
     //Task3&4
     public void info(){
          System.out.println(this.name+" has the following songs: ");
          if(this.head==null){
               System.out.println("No songs in "+this.name);
          }
          else{
               Song current=head;
               int i=1;
               while(current!=null){
                    System.out.println("Song-"+i);
                    current.songInfo();
                    current=current.next;
                    i++;
               }
          }
     }
     
     
     public void addSong(Song s){
          if(this.head==null){
               this.head=s;        
          }
          else{
               Song temp=this.head;
               while(temp.next!=null){
                    temp=temp.next;
               }
               temp.next=s;
          }
          count++;
          System.out.println(s.name+" added to "+this.name+".");
     }
     
     //Task5
     public void addSong(Song s, int n){
          if(n>count){
               System.out.println("Cannot add song to Index "+n+".");
          }
          else if(n==0){
               s.next=this.head;
               this.head=s;
               System.out.println(s.name+" added to "+this.name+".");
               count++;
          }
          else{
               Song temp=this.head;
               int i=1;
               while(temp.next!=null){
                    if(i==n){
                         Song current=temp.next;
                         temp.next=s;
                         s.next=current;
                         System.out.println(s.name+" added to "+this.name+".");
                         count++;
                         return;
                    }
                    else{
                         i++;
                         temp=temp.next;
                    }
               }
               temp.next=s;
               System.out.println(s.name+" added to "+this.name+".");
               count++;
          }
     }
     
     //Task6
     public void playSong(String s){
          boolean found=false;
          if(this.head==null){
               System.out.println("No songs in "+this.name+".");
          }
          else{
               Song temp=this.head;
               while(temp!=null){
                    if(temp.name.equals(s)){
                         System.out.println("Playing "+s+" by "+temp.artist);
                         found=true;
                         break;
                    }
                    else{
                         temp=temp.next;
                    }
               }
               if(!found){
                    System.out.println(s+" not found in playlist "+this.name+".");
               }
          }
     }
     
     //Task7
     public void playSong(int n){
          if(n>(count-1)){
               System.out.println("Song at Index "+n+" not found in "+this.name+".");
          }
          else if(this.head==null){
               System.out.println("No songs in "+this.name+".");
          }
          else{
               Song temp=this.head;
               int i=0;
               while(temp!=null){
                    if(i==n){
                         System.out.println("Playing "+temp.name+" by "+temp.artist+".");
                         break;
                    }
                    else{
                         i++;
                         temp=temp.next;
                    }
               }
          }
     }
     
     //Task8
     public void deleteSong(String s){ 
          boolean found=false; 
          if(this.head==null){ 
               System.out.println("No songs in "+this.name+".");
               found=true; 
          } 
          else if(this.head.name.equals(s)){ 
               this.head=this.head.next; 
               System.out.println(s+" deleted from "+this.name);
               found=true; count--; 
          }
          else{
               Song temp=this.head; 
               while(temp.next!=null){
                    if(temp.next.name.equals(s) && temp.next.next!=null){ 
                         temp.next=temp.next.next;
                         System.out.println(s+" deleted from "+this.name); 
                         found=true; 
                         count--; 
                         return;
                    }
                    else if(temp.next.name.equals(s) && temp.next.next==null){ 
                         temp.next=null; 
                         System.out.println(s+" deleted from "+this.name); 
                         found=true; 
                         count--; 
                         return;
                    }
                    temp=temp.next; 
               }
          }
          if(!found){
               System.out.println(s+" not found in "+this.name);
          }
     }
     
     //Task9
     public int totalSong(){
          return count;
     }
     
     //Task10
     public void merge(Playlist p){
          if(this.head==null){
               this.head=p.head;
          }
          else{
               Song temp=this.head;
               while(temp.next!=null){
                    temp=temp.next;
               }
               temp.next=p.head;
          }
          System.out.println("Merge Completed!");
     }
}
