import java.util.ArrayList;

public interface StudentEligibility {

    ArrayList<String> list=new ArrayList<String>();

    double getPercentage();
    boolean isEligible();
    void addToList(int rollno,String name);
    void printShortListed();

    //boolean isPassedOut();
}
