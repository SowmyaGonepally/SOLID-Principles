import java.util.ArrayList;

public interface ListShortlisted {   //interface segregation

    ArrayList<String>list=new ArrayList<String>();

    void addToList(int rollno,String name);
    void printShortListed();
}
