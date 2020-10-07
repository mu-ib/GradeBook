public class GradeBook {
    String name, courseName, instructorName;
    public GradeBook(String str){
        name = str;
    }
    //method to set the name of the course
    public void setCourseName(String str){
        courseName = str;
    }
    //method to set the name of the instructor
    public void setInstructorName(String str){
        instructorName = str;
    }
    //return the name of the course
    public String getCourseName(){
        return courseName;
    }
    //return the name of the instructor
    public String getInstructorName(){
        return instructorName;
    }
    //welcome message
    public String toString(){
        return "Welcome to " + name + "'s grade book for " + getCourseName() + ".\nThis course is presented by "
                + getInstructorName();
    }
}
