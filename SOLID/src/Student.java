
public class Student {
     String name;
     int rollno;
     String course;
     double cgpa;

    Student()
    {

    }
    Student(String name,int rollno,String course,double cgpa)
    {
        this.name=name;
        this.rollno=rollno;
        this.course=course;
        this.cgpa=cgpa;
    }
    public String getName() {
        return name;
    }
    public int getRollno() {
        return rollno;
    }
    public String getCourse() {
        return course;
    }
    public double getCgpa() {
        return cgpa;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }




}

