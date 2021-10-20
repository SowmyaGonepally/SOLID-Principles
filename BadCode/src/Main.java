import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean repeat=true;

        ArrayList<String>list=new ArrayList<String>();
        while(repeat) {
        System.out.println("Enter student details for placements");
        System.out.println("Enter passed out/passing year");
        int year=sc.nextInt();
        System.out.println("Enter name");
        String name= sc.next();
        System.out.println("Enter roll no");
        int rollNo=sc.nextInt();
        System.out.println("Enter course");
        String course= sc.next();
        System.out.println("Enter cgpa");
        double cgpa= sc.nextDouble();

        boolean isEligibleForPlacements=false;

        Student s=new Student();
            s.setName(name);
            s.setRollno(rollNo);
            s.setCourse(course);
            s.setCgpa(cgpa);
        Eligibility eligibility=new Eligibility(s);
        isEligibleForPlacements=eligibility.isEligible();

        if(isEligibleForPlacements) {
            System.out.println(name + " is eligible for placements ");
            s.addToList(rollNo,name);
        }
        else
            System.out.println(name + " is not eligible for placements ");

            System.out.println(" Do you want to continue? Y/N");
            String c=sc.next();
            repeat= c.equals("Y");

            if (repeat==false)
            {
                System.out.println("Here are the list of short listed students");
                s.printShortListed();
                break;
            }

        }

    }
}
