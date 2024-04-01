/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentdriver;

/**
 *
 * @author s551736
 */
public class GraduateStudent extends StudentFees {

    //Instance Variables.
    private int coursesEnrolled;
    private boolean isGraduateAssistant;
    private String graduateAssistantType;
    private double ADDITIONAL_FEES = 654.45;

    //method to set values uses method from StudentFees.
    public GraduateStudent(String studentName, int studentID, boolean isEnrolled, boolean isGraduateAssistant, String graduateAssistantType, int coursesEnrolled) {
        super(studentName, studentID, isEnrolled);
        this.coursesEnrolled = coursesEnrolled;
        this.isGraduateAssistant = isGraduateAssistant;
        this.graduateAssistantType = graduateAssistantType;
    }

    //method to set values of instance variables uses method from StudentFees.
    public GraduateStudent(String studentName, int studentID, boolean isEnrolled, boolean isGraduateAssistant, int coursesEnrolled) {
        super(studentName, studentID, isEnrolled);
        this.coursesEnrolled = coursesEnrolled;
        this.isGraduateAssistant = isGraduateAssistant;
    }

    //get method to see if person is a assistant
    public boolean isIsGraduateAssistant() {
        return isGraduateAssistant;
    }

    //get method to find the num of enrolled courses
    public int getCoursesEnrolled() {
        return coursesEnrolled;
    }

    //method to find the cost of tuition includes selction structure to find deductable for assitance types.
    public double getPayableAmount() {
        if (isIsGraduateAssistant() == true) {
            if (graduateAssistantType.equals("full")) {
                return 0.0;
            } else if (graduateAssistantType.equals("half")) {
                return (((coursesEnrolled * getCREDITS_PER_COURSE()) * getPER_CREDIT_FEE()) + ADDITIONAL_FEES) / 2;
            }
        } else {
            return ((coursesEnrolled * getCREDITS_PER_COURSE()) * getPER_CREDIT_FEE());
        }
    }

    //toString method that adds to toString method of StudentFees
    public String toString() {
        return super.toString() + "\nGraduate assistant: " + isIsGraduateAssistant() + "\nGraduate assistant type: " + graduateAssistantType + "\nCourses enrolled: " + getCoursesEnrolled() + "\nPayable amount: " + getPayableAmount();
    }

}
