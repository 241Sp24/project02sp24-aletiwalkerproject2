/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdriver;
import java.util.*;
import java.io.*;
/**
 *
 * @author dianar
 */
public class StudentDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        double total = 0.0;
        int count = 0;
// creating scanner  class
          
      Scanner Myscanner= new Scanner(System.in);
        System.out.print("Enter no of UG students : ");
         int UGStudents =Myscanner.nextInt();
        System.out.print("Enter the no of Graduate students: ");
       int  GSStudents = Myscanner.nextInt();
        System.out.print("Enter the no of online students: ");
        int OSStudents = Myscanner.nextInt();
        
        // creating an array to store students
    StudentFees[]students = new StudentFees[12];
     
        File inputfile = new File ("input.csv");
        Scanner input = new Scanner (inputfile);
        int x = 0;
        //
      while(input.hasNextLine()){
          String[]strings = input.nextLine().split(",") ;
           
          if (x < 5){
          int id =Integer.parseInt(strings[0]);
          String name = strings[1];
          boolean enrolled = Boolean.parseBoolean(strings[2]);
          int courseenrolled = Integer.parseInt(strings[3]);
          boolean HasScholarship = Boolean.parseBoolean(strings[4]);
          double Amount = Double.parseDouble(strings[5]);
         
         students [x] = new UGStudent(name,id,enrolled,HasScholarship ,Amount,courseenrolled );
         x++;
          }
        
          //typecating for GSclass
          else if (x < 9){
              if (Boolean.parseBoolean(strings[4]) == true){
             int studentid=Integer.parseInt(strings[0]);
          String studentname = strings[1];
          boolean isstudentenrolled = Boolean.parseBoolean(strings[2]);
          boolean isstudentGraduateAssistant = Boolean.parseBoolean(strings[4]);
          String graduateType = strings[5] ;
          int coursesenrolled = Integer.parseInt(strings[3]);
          
            // creating an object of GraduteStudent variable name  GS
          students [x] = new GraduateStudent(studentname,studentid,isstudentenrolled,isstudentGraduateAssistant,graduateType,coursesenrolled);
              x++;
              }else if(Boolean.parseBoolean(strings[4])== false){
                  int studentid=Integer.parseInt(strings[0]);
          String studentname = strings[1];
          boolean isstudentenrolled = Boolean.parseBoolean(strings[2]);
          boolean isstudentGraduateAssistant = Boolean.parseBoolean(strings[4]);
          int coursesenrolled = Integer.parseInt(strings[3]);
          
            // creating an object of GraduteStudent variable name  GS
            students [x] = new GraduateStudent(studentname,studentid,isstudentenrolled,isstudentGraduateAssistant,coursesenrolled);
          x++;
              }
         }
       
           // type casting for OnlineStudent class
          else{
                int idofstudent=Integer.parseInt(strings[0]);
          String studentsname = strings[1];
          boolean isthestudentenrolled = Boolean.parseBoolean(strings[2]);
            int numberofmonths = Integer.parseInt(strings[3]);
            
        // creating an object for online student named os
        students [x]= new OnlineStudent (studentsname,idofstudent, isthestudentenrolled,numberofmonths );
        x++;
       
          }
     }
      input.close();
      
      double UGFees = 0;
      int noOfScholarships = 0;
      int ugcourses = 0;
          // printing the ugstudent objects
          System.out.println("*******UndergraduteStudent lists *******");
      for (StudentFees a : students){
          if (a instanceof UGStudent){
               System.out.println(a);
              System.out.println("");
                    
              if (a.isIsEnrolled()==true){
              UGFees += a.getPayableAmount();
              ugcourses += ((UGStudent) a).getCoursesEnrolled();
              if (((UGStudent) a).hasScholarShip()==true){
              noOfScholarships ++;
              }
              }else{
                  UGStudents--;
              }
          }      
              }
      
      double GradFees = 0;
      int noofGradAssistants = 0;
      int gradCourses = 0;
      
        System.out.println("**********Graduate students list**********");
      for (StudentFees a : students){
          if (a instanceof GraduateStudent){
              System.out.println(a);
              System.out.println("");
              
              if (a.isIsEnrolled()==true){
              GradFees += a.getPayableAmount();
              gradCourses += ((GraduateStudent) a).getCoursesEnrolled();
              if (((GraduateStudent) a).isIsGraduateAssistant()==true){
              noofGradAssistants ++;
              }
              }else{
                  GSStudents--;
              }
      
          }
      }
      
      double osFees = 0;
         
            System.out.println("**********Online students list**********");   
      for(StudentFees a : students){
          if (a instanceof OnlineStudent){
              System.out.println(a);
              System.out.println("");
              
              if (a.isIsEnrolled()==true){
              osFees += a.getPayableAmount();
              }else{
                  OSStudents--;
              }
          
          }
      }
          System.out.println("**********Undergraduate Students details**********");
         System.out.println("Average student fees: " + (UGFees/4));
         System.out.println("Scholarship Count: "+ noOfScholarships);
         System.out.println("Total number of courses: " + ugcourses);
         System.out.println("");
         
         System.out.println("**********Graduate Students details**********");
         System.out.println("Average student fees: " + (GradFees/GSStudents));
         System.out.println("Graduate Assistantship Count: "+ noofGradAssistants);
         System.out.println("Total number of courses: " + gradCourses);
         System.out.println("");
         
         System.out.println("**********Online Students details**********");
         System.out.println("Average student fees: " + (osFees/OSStudents));
      
           }
    }
    



              
       
            
      
          
        
     
        
           
        
          
          
    

    


