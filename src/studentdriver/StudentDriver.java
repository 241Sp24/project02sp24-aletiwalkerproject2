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
        System.out.println("Enter the no of Graduate students: ");
        System.out.println("Enter the no of online students: ");
        
        // creating an array to store students 
    StudentFees[]students = new StudentFees[12];
     
        File inputfile = new File ("input.csv");
        Scanner input = new Scanner (inputfile);
      while(input.hasNextLine()){
          String[]strings = input.nextLine().split(",") ;
          
          // Typecasting the UGStudent class
          int id =Integer.parseInt(strings[0]);
          String name = strings[1];
          boolean enrolled = Boolean.parseBoolean(strings[2]);
          int courseenrolled = Integer.parseInt(strings[3]);
          boolean HasScholarship = Boolean.parseBoolean(strings[4]);
          double Amount = Double.parseDouble(strings[5]);
         
          // creating an object for UGstudent variable named UG
          UGStudent UG = new UGStudent(name,id,enrolled,HasScholarship ,Amount,courseenrolled );
          
          //typecating for GSclass
          int studentid=Integer.parseInt(strings[0]);
          String studentname = strings[1];
          boolean isstudentenrolled = Boolean.parseBoolean(strings[2]);
          boolean isstudentGraduateAssistant = Boolean.parseBoolean(strings[3]);
          String graduateType = strings[4] ;
          int coursesenrolled = Integer.parseInt(strings[5]);
          
          // creating an object of GraduteStudent variable name  GS
          GraduateStudent GS = new GraduateStudent(studentname,studentid,isstudentenrolled,isstudentGraduateAssistant,graduateType,coursesenrolled);
          
           // type casting for OnlineStudent class
          int idofstudent=Integer.parseInt(strings[0]);
          String studentsname = strings[1];
          boolean isthestudentenrolled = Boolean.parseBoolean(strings[2]);
            int numberofmonths = Integer.parseInt(strings[3]);
            
        // creating an object for online student named os
        OnlineStudent os = new OnlineStudent (studentsname,idofstudent, isthestudentenrolled,numberofmonths );
        
        // 
        
        
          
          
    }
    }

}
