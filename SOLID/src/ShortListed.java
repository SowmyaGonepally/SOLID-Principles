import java.util.ArrayList;

//single responsibility- deals with only adding to the list and printing the list
public class ShortListed implements ListShortlisted{

    @Override
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

