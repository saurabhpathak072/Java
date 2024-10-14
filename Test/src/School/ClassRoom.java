package School;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassRoom {
   private int numberOfStudent;

   public ArrayList<School.Student> getStudents() {
      return students;
   }

   public void setStudents(ArrayList<School.Student> students) {
      this.students = students;
   }

   private ArrayList<Student> students;

   public int getNumberOfStudent() {
      return numberOfStudent;
   }

   public void setNumberOfStudent(int numberOfStudent) {
      this.numberOfStudent = numberOfStudent;
   }

   public void enterNumberOfStudents(){
      Scanner scan = new Scanner(System.in);
      System.out.println("Please Enter Number of Students : ");
      this.setNumberOfStudent(scan.nextInt());

   }

   public void enterStudentsDetails(){

   }
}
