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

    private int coursesEnrolled;
    private boolean isGraduateAssistant;
    private String graduateAssistantType;
    private double ADDITIONAL_FEES = 654.45;

    public GraduateStudent(String studentName, int studentID, boolean isEnrolled, boolean isGraduateAssistant, String graduateAssistantType, int coursesEnrolled) {
        super(studentName, studentID, isEnrolled);
        this.coursesEnrolled = coursesEnrolled;
        this.isGraduateAssistant = isGraduateAssistant;
        this.graduateAssistantType = graduateAssistantType;
    }

    public GraduateStudent(String studentName, int studentID, boolean isEnrolled, boolean isGraduateAssistant, int coursesEnrolled) {
        super(studentName, studentID, isEnrolled);
        this.coursesEnrolled = coursesEnrolled;
        this.isGraduateAssistant = isGraduateAssistant;
    }

    public boolean isIsGraduateAssistant() {
        return isGraduateAssistant;
    }

    public int getCoursesEnrolled() {
        return coursesEnrolled;
    }

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

    public String toString() {
        return super.toString() + "\nGraduate assistant: " + isIsGraduateAssistant() + "\nGraduate assistant type: " + graduateAssistantType + "\nCourses enrolled: " + getCoursesEnrolled() + "\nPayable amount: " + getPayableAmount();
    }

}
