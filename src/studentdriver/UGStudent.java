/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentdriver;

/**
 *
 * @author s551736
 */
public class UGStudent extends StudentFees {

    private double scholarshipAmount;
    private int coursesEnrolled;
    private boolean hasScholarship;
    private final double ADDITIONAL_FEE = 820.76;

    public UGStudent(String studentName, int studentID, boolean isEnrolled, boolean hasScholarship, double scholarshipAmount, int coursesEnrolled) {
        super(studentName, studentID, isEnrolled);
        this.coursesEnrolled = coursesEnrolled;
        this.hasScholarship = hasScholarship;
        this.scholarshipAmount = scholarshipAmount;
    }

    public boolean hasScholarShip() {
        return hasScholarship;
    }

    public double getScholarShipAmount() {
        return scholarshipAmount;

    }

    public int getCoursesEnrolled() {
        return coursesEnrolled;
    }

    @Override
    public double getPayableAmount() {
        if(super.isIsEnrolled()==false){
          return 0.00;  
        }else {
            return (this.coursesEnrolled*super.getCREDITS_PER_COURSE()*super.getPER_CREDIT_FEE())+ADDITIONAL_FEE  - scholarshipAmount ;
        }
        
    }

    @Override
    public String toString() {
        return super.toString() + "\nScholarship: " + hasScholarShip() + "y\nScholarship amount: " + scholarshipAmount + "\ncourses Register : " + coursesEnrolled + "\nPayable amount: " + getPayableAmount();
    }

}
