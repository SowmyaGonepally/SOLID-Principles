import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        boolean repeat=true;
        ListShortlisted listShortlisted=new ShortListed();
        while(repeat) {
          System.out.println("Enter student details for placements");
          System.out.println("Enter passed out/passing year");
          int year = sc.nextInt();
          System.out.println("Enter name");
          String name = sc.next();
          System.out.println("Enter roll no");
          int rollNo = sc.nextInt();
          System.out.println("Enter course");
          String course = sc.next();
          System.out.println("Enter cgpa");
          double cgpa = sc.nextDouble();

          boolean isEligibleForPlacements = false;

          if (year < 2021) {
           StudyingStudent studyingStudent = new StudyingStudent(name,rollNo,course,cgpa);
              EligibilityCheck eligibilityCheck = new EligibilityCheck(studyingStudent);
              isEligibleForPlacements = eligibilityCheck.isEligible();
              displayEligibility(isEligibleForPlacements,studyingStudent,listShortlisted);
              //liskov substitution-passing derived object in place of base class object


          } else {
              PassedOutStudent passedOutStudent = new PassedOutStudent(name,rollNo,course,cgpa,year,true);
              EligibilityCheck eligibilityCheck = new EligibilityCheck(passedOutStudent);
              isEligibleForPlacements = eligibilityCheck.isEligible();
              displayEligibility(isEligibleForPlacements,passedOutStudent,listShortlisted);
              //liskov substitution-passing derived object in place of base class object


          }


          System.out.println(" Do you want to continue? Y/N");
          String c=sc.next();
          repeat= c.equals("Y");

           if (repeat==false)
           {
               System.out.println("Here are the list of short listed students");
               listShortlisted.printShortListed();
               break;
           }

      }
    }
    public static void displayEligibility(boolean isEligibleForPlacements,Student student,ListShortlisted listShortlisted)
    {
        if(isEligibleForPlacements)
        {
            System.out.println(student.getName()+ " is eligible for placements ");
            listShortlisted.addToList(student.getRollno(), student.getName());

        }
        else
            System.out.println(student.getName() + " is not eligible for placements ");

    }
}
