
class Main {  
  public static void main(String[] args) {    
    Student student1 = new Student(); 
    student1.setName("Arnold Spielberg");    
    student1.setGPA(4.0);    
    student1.setMajor("Electrical Engineering");
    print();
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
  static void print() {
    System.out.Println("The Student's Name is" + student1.name);
    System.out.printLn("The Student's GPA is" + student1.GPA);
    System.out.Println("The Student's Major is" + student1.Major);
  }
}
}
