public class Student {
    // Private attributes
    private String name;
    private int grade;
    
    // Getter for name
    public String getName() {
        return name;
    }
    
    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
    
    // Getter for grade
    public int getGrade() {
        return grade;
    }
    
    // Setter for grade with validation
    public void setGrade(int grade) {
        if (grade < 0 || grade > 100) {
            this.grade = 0; // Set to 0 if outside valid range
        } else {
            this.grade = grade;
        }
    }
}
