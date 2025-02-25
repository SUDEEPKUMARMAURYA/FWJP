// Assignment-1

class Student {
  private String studentName = "Sudeep Kumar Maurya";
  private String collegeName= "Buddha Institute of Technology Gida Gorakhpur";
  private int studentID = 101;

  public static void main(String[] args) {
    Student myObj = new Student();
    System.out.println("Name: " + myObj.studentName);
    System.out.println("College : " + myObj.collegeName);
    System.out.println("StudentID : " + myObj.studentID );
    System.out.println( "Successful" );
  }
}