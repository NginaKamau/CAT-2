public class Student {
    //creation of the private variables
    private String name;
    private int grade;

    //creating the constructor that will be used for the getter and setter
    public Student(String name,int grade){
        this.name=name;
        setGrade(grade);
    }
    //getter for the name
    public String getName(){
        return name;
    }
    //setter for the name
    public void setName(String name){
        this.name=name;
    }
    //getter for the grade
    public int getGrade(){
        return grade;
    }


}
