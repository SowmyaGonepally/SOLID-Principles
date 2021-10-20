public class StudyingStudent extends Student implements StudentDetails{
    //open for extension and closed for modification- extended Student.java, instead of modifying it

    StudyingStudent(String name,int rollno,String course,double cgpa)
    {
        this.name=name;
        this.rollno=rollno;
        this.course=course;
        this.cgpa=cgpa;
    }
    @Override
    public double getPercentage() {
        return getCgpa()*10;
    }
    @Override
    public boolean isPassedOut() {
        return false;
    }

}
