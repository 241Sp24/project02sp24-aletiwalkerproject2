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
        // creating scanner 
          
      Scanner Myscanner= new Scanner(System.in);
        System.out.println("Enter no of UG students : ");
         int UGStudents =Myscanner.nextInt();
        System.out.println("Enter the no of Graduate students: ");
       int  GSStudents = Myscanner.nextInt();
        System.out.println("Enter the no of online students: ");
        int OSStudents = Myscanner.nextInt();
        
        // creating an array to store students 
    StudentFees[]students = new StudentFees[12];
     
        File inputfile = new File ("input.csv");
        Scanner input = new Scanner (inputfile);
        int x = 0;
        
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
          
      for (StudentFees a : students){
              System.out.println(a);
              System.out.println("");
                  
              }
          }
            
      
          
        
     
        }
           
        
          
          
    

    


