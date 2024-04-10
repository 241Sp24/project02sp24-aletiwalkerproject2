/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentdriver;

/**
 *
 * @author s551736
 */
public class OnlineStudent extends StudentFees {

    //create instance variables
    private int noOfMonths;
    private double MONTHLY_FEE = 1245.25;

    //method to assign values to instance variables uses method from StudentFees
    public OnlineStudent(String studentName, int studentID, boolean isEnrolled, int noOfMonths) {
        super(studentName, studentID, isEnrolled);
        this.noOfMonths = noOfMonths;
    }

    //method to find cost of tuition
    public double getPayableAmount() {
        return noOfMonths * MONTHLY_FEE;
    }

    //toString method the builds off of StudentFees toString method
    @Override
    public String toString() {
        return super.toString() + "\nNo of months: " + noOfMonths + "\nPayable amount: " + getPayableAmount();
    }

}
