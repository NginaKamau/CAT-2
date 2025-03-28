public class Student {
    //creation of the private variables
    private String name;
    private int grade;

    //creating the constructor that will be used for the getter and setter
    public Student(String name,int grade){
        this.name=name;
        setGrade(grade);//this is the setter for grade which will ensure grading within 0 and 100
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

    //the method that deals with the grading of the numbers within 0 and 100
    public void setGrade(int grade){
        if (grade>=0&&grade<=100){
            this.grade=grade;
        }
        else{
            this.grade=0;
        }
    }

    //method that will bbe used to display student details
    public void displayStudent(){
        System.out.println("Name of Student:"+ name);
        System.out.println("Student Grade:" +grade);

    }

}
