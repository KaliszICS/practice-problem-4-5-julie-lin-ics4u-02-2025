/**
 * Student class that represents student's name, age and their student number
 */
public class Student {
    private String name;
    private int age;
    private String studentNumber;

    /**
     * Constructor for all the instance variables
     * @param name of student
     * @param age of student
     * @param studentNumber for the student
     */
    public Student (String name, int age, String studentNumber) {
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }
    //Getters
    /**
     * Returns the Name of student
     * @return the name of student
     */
    public String getName (){
        return this.name;
    }
    /**
     * Returns the age of Student
     * @return the age of student
     */
    public int getAge (){
        return this.age;
    }
    /**
     * Returns the Student number of student
     * @return student number of student
     */
    public String getStudentNumber(){
        return this.studentNumber;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.age + " - " + this.studentNumber;
    }

    @Override
	public boolean equals(Object obj) { 
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Student Student = (Student)obj;
		if (Student.getStudentNumber().equals(this.studentNumber)) {
			return true;
		}
		return false;
	}
}