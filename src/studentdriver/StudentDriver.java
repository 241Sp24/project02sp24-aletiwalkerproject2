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
          
          int id =Integer.parseInt(strings[0]);
          String name = strings[1];
        
    }
    }

}
