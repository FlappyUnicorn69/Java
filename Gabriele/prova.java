import java.util.ArrayList;
import java.util.Random;

public class prova {
    public static ArrayList<Integer> createRandomList(int sizeParameter)
{
    // An ArrayList that method returns
    ArrayList<Integer> setIntegerList = new ArrayList<Integer>(sizeParameter);
    // Random Object helper
    Random randomHelper = new Random();
    
    for (int x = 0; x < sizeParameter; x++)
    {
        setIntegerList.add(randomHelper.nextInt());
    }   // End of the for loop
    
    return setIntegerList;
}
}
