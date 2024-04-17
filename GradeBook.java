public class GradeBook {

    private String courseName;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public GradeBook(String courseName) {
        this.courseName = courseName;
    }

    public void displayMessage(){

        System.out.println("Bienvenido al sistema de plantillas del curso: " + getCourseName());
    }
}
