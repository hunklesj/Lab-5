import java.util.ArrayList;

class Main {  
  public static void main(String[] args) {    
    Student student1 = new Student(); 
    student1.setName("Arnold Spielberg");    
    student1.setGPA(4.0);    
    student1.setMajor("Electrical Engineering");
    student1.print();

    Student student2 = new Student();
    student2.setName("Sam Hunkler");
    student2.setGPA(4.3);
    student2.setMajor("Accounting");
    student2.print();

   ArrayList<Double> averageGPA = new ArrayList<Double>();
   averageGPA.add(student1.getGPA());
   averageGPA.add(student2.getGPA());
   double sum = 0;
   int studentCount = 0;
   for (int i = 0; i < averageGPA.size();i++){
     sum = averageGPA.get(i) + sum;
     studentCount++;
   }

  sum = sum/studentCount;
  System.out.println("The average GPA is " + sum);
  }
}

  class Student {
  String name;  
  double gpa;  
  String major;  
  
  String getName() {    
    return name;  
    }  
  double getGPA() {    
    return gpa;  
      }  
  String getMajor() {    
    return major;  
      }  
  void setName(String theName) {
      name = theName;  
      } 
  void setGPA(double theGPA) {    
    gpa = theGPA;  
    }  
  void setMajor(String theMajor) {   
    major = theMajor;  
    }
  void print() {
    System.out.println("The Student's Name is " + name);
    System.out.println("The Student's GPA is " + gpa);
    System.out.println("The Student's Major is " + major);
  }
  } 
