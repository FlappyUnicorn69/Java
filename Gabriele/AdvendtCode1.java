import java.util.ArrayList;
import java.util.Collections;

public class AdvendtCode1 {
 public static void main(String[] args) {
  String filePath = "AdventCode1.txt";

    ArrayList<Integer> rightList = new ArrayList<Integer>();
    ArrayList<Integer> leftList = new ArrayList<Integer>();

    Collections.sort(leftList);
    Collections.sort(rightList);

  int totDist = 0; {
    
   
        for (int i = 0; i < sizeParameter; i++){
          
        totDist += Math.abs(rightList[i] - leftList[i]);
   }
   return 
 }
 System.out.println("The value is: " + totDist);
}