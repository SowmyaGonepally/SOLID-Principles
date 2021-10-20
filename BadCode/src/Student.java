public class Student implements StudentEligibility{

    private String name;
    private int rollno;
    private String course;
    private double cgpa;

/*
    private int passedYear    //violation of open close
*/


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

  /*  public int getPassedYear() {
        return passedYear;
    }*/

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

   /* public void setPassedYear(int passedYear) {
        this.passedYear = passedYear;
    }*/

    public double getPercentage() {
        return cgpa*10;
    }

    @Override
    public boolean isEligible() {
        return false;
    }

    /*@Override
    public boolean isPassedOut() {
        return passedYear>=2021;
    }*/

    @Override   //more than one responsibility and
    public void addToList(int rollno,String name) {
        list.add(rollno+"-"+name);
    }

    @Override
    public void printShortListed() {

        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }



}
