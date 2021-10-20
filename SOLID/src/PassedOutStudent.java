public class PassedOutStudent extends Student implements StudentDetails
{
    //open for extension and closed for modification- extended Student.java, instead of modifying it

     int passedYear;
     boolean currentlyWorking;
    public void setPassedYear(int passedYear) {
        this.passedYear = passedYear;
    }

    public int getPassedYear() {
        return passedYear;
    }

    public void setCurrentlyWorking(boolean currentlyWorking) {
        this.currentlyWorking = currentlyWorking;
    }

    public boolean isCurrentlyWorking() {
        return currentlyWorking;
    }


    PassedOutStudent(String name,int rollno,String course,double cgpa,int passedYear,boolean currentlyWorking)
    {
        this.name=name;
        this.rollno=rollno;
        this.course=course;
        this.cgpa=cgpa;
        this.passedYear=passedYear;
        this.currentlyWorking=currentlyWorking;
    }
    @Override
    public boolean isPassedOut() {
        return passedYear>=2021;
    }

    @Override
    public double getPercentage() {
        return getCgpa()*10;
    }

    public boolean doneProject()
    {
        return true;
    }



}
