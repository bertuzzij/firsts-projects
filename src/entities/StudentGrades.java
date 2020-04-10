package entities;

public class StudentGrades {

    public String name;
    public double gradeA;
    public double gradeB;
    public double gradeC;
    public double studentMedia;
    public double totalGrade;

    public double totalGrade(){
        return this.totalGrade = gradeA + gradeB + gradeC;

    }

    public double mediaGrade(){
        if (totalGrade < 60){
            studentMedia = 60 - totalGrade;
        }
        return studentMedia;
    }
}
