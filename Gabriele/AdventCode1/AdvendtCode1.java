package AdventCode1;
import java.util.ArrayList;
import java.util.Collections;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class AdvendtCode1 {
 public static void main(String[] args) {
  String filePath = "AdventCode1.txt";

    try {
      FileReader fr = new FileReader("AdventCode1.txt");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    try {
      FileWriter fw = new FileWriter("AdventCode1.txt");
    } catch (IOException e) {
      e.printStackTrace();
    }
  
  
// Da mettere sopra?
    ArrayList<Integer> rightList = new ArrayList<Integer>();
    ArrayList<Integer> leftList = new ArrayList<Integer>();

    Collections.sort(leftList);
    Collections.sort(rightList);

  int totDist = 0; {
    for (int i = 0; i <= leftList.size(); i++){
          totDist += Math.abs(rightList.get(i) - leftList.get(i));
      }
 }
 System.out.println("The value is: " + totDist);
}
}