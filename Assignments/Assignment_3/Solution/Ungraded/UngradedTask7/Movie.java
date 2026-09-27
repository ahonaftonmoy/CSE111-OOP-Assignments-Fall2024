public class Movie{
     public String name;
     public String direc;
     public double rate;
     public int count;
     public String [] actors=new String[20];
     public String setMovieDetails(String s1, String s2){
          name=s1;
          direc=s2;
          return name+direc;
     }
     public String setMovieDetails(String s1, String s2, double d){
          setMovieDetails(s1,s2);
          rate=d;
          return name+direc+rate;
     }
     public void addActors(String s){
          actors[count++]=s;
          System.out.println("Added actor ''"+s+"'' to ''"+name+"''.");
     }
     public void addActors(String s1,String s2){
          addActors(s1);
          addActors(s2);
     }
     public void addActors(String s1,String s2,String s3){
          addActors(s1,s2);
          addActors(s3);
     }
     public void showInfo(){
          System.out.println("Title: "+name+"\nDirector: "+direc+"\nRating: "+rate+"\nActors: ");
          for(int i=0;i<count;i++){
               if(i==count-1){
                    System.out.println(actors[i]);
               }
               else{
                    System.out.print(actors[i]+", ");
               }
          }
     }
     public void updateRating(double n){
          rate=n;
          System.out.println("Updated rating of ''"+name+"'' to "+rate);
     }
}