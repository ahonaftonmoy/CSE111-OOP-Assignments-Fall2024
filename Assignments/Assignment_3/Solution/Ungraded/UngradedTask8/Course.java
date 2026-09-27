public class Course{
     public String name;
     public String code;
     public int count;
     public String [] arr1=new String[4];
     public void addContent(String s){
          if(count<arr1.length){
               arr1[count++]=s;
               System.out.println(s+" was added.");
          }
          else{
               System.out.println("Cannot add more content.");
          }
     }
     public void addContent(String s1,String s2){
          addContent(s1);
          addContent(s2);
     }
     public String updateDetails(String s1,String s2){
          name=s1;
          code=s2;
          return name+code;
     }
     public void printDetails(){
          System.out.println("Course details: "+"\nCourse Name: "+name+
                             "\nCourse code: "+code+"\nCourse Syllabus: ");;
          if(count==0){
               System.out.println("No content yet.");
          }
          else{
               for(int i=0;i<count;i++){
                    if(i==count-1){
                         System.out.println(arr1[i]);
                    }
                    else{
                         System.out.print(arr1[i]+", ");
                    }
               }
          }
     }
}