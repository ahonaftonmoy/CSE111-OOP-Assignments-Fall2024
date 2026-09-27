public class Book{
     public String name;
     public String author="Unknown";
     public String genre;
     public int pages;
     public String createBook(String s){
          name=s;
          return name;
     }
     public String createBook(String s1,String s2){
          createBook(s1);
          author=s2;
          return name+author;
     }
     public String createBook(String s1,String s2,String s3){
          createBook(s1,s2);
          genre=s3;
          return name+author+genre;
     }
     public void customizeGenre(String s){
          genre=s;
          System.out.println("Updated genre of '"+name+"' to "+s+".");
     }
     public void customizePages(int n){
          pages=n;
          System.out.println("Updated pages of '"+name+"' to "+n+" pages.");
     }
     public void displayDetails(){
          System.out.println("Title: "+name+", Author: "+author+
                             ",\nGenre: "+genre+", Pages: "+pages);
     }
}