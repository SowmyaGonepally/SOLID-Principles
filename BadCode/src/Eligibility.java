public class Eligibility implements StudentEligibility{

    Student student=new Student();   //violation of DI

    Eligibility(Student student)
    {
        this.student=student;
    }
    @Override
    public double getPercentage() {
        return 0;
    }

    @Override
    public boolean isEligible() {
        return student.getPercentage()>65;
    }

    @Override
    public void addToList(int rollno, String name) {

    }

    @Override
    public void printShortListed() {

    }
}
