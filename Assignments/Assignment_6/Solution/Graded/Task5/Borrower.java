//Task5
public class Borrower{
    public static int book_count[] = {3, 3, 3};
    public static String book_name[] = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};
    
    public String name;
    public String books_borrowed [] = new String [9];
    public int count;

    public static void bookStatus(){
        System.out.println("Available Books: ");
        for(int i=0;i<book_count.length;i++){
            System.out.println(book_name[i]+": "+book_count[i]);
        }
    }
    
    public Borrower(String s){
        this.name=s;
    }

    public void borrowBook(String s){
        for(int i=0;i<book_name.length;i++){
            if(s.equals(book_name[i])){
                if(book_count[i]!=0){              
                    book_count[i]-=1;              
                    books_borrowed[count++]=s;                
                    break;
                }
                else{
                    System.out.println("This book is not available.");
                }
            }
        }
    }

    public void borrowerDetails(){
        System.out.println("Name: "+this.name+"\nBooks Borrowed: ");
        for(int i=0;i<count;i++){
            System.out.println(books_borrowed[i]);
        }
    }

    public static int remainingBooks(String s){
        int n=0;
        for(int i=0;i<book_name.length;i++){
            if(s.equals(book_name[i])){
                n=book_count[i];
                break;
            }
        }
        return n;
    }
}
  