import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Gioco2{
    public static void main(String[] args){
        int reportSafe = 0;


        try {
            List<String> lines = Files.readAllLines(Paths.get("input.txt"));
            for (String line : lines){

                String[] valori =line.split(" ");

                ArrayList<Integer> report = new ArrayList<>();

                for (String num : valori){
                    int a = Integer.parseInt(num);
                    report.add(a);
                }

                boolean decre = true;      //controllo se il report è decrescente
                for (int i=0; i < report.size()-1; i++){
                    if(report.get(i) <= report.get(i+1)){
                        decre = false;
                        break;
                    }
                }
                //System.out.println(decre);

                boolean cresce = true;      //controllo se il report è crescente
                for (int i=0; i < report.size()-1; i++){
                    if(report.get(i) >= report.get(i+1)){
                        cresce = false;
                        break;
                    }
                }
                //System.out.println(cresce);


                boolean dist = true;                    //controlla la differenza se è accettabile
                for(int i=0; i < report.size()-1; i++){
                    if (Math.abs(report.get(i) - report.get(i+1)) < 1 ||  Math.abs(report.get(i) - report.get(i+1)) > 3 ){
                        dist = false;
                    }
                }
                //System.out.println(dist);

                if((decre == true || cresce == true) && dist == true){
                    reportSafe++;
                }


                // for (String num : valori){
                //     int a = Integer.parseInt(num);
                //     System.out.print(a);
                // }
                // System.out.println();
                // break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(reportSafe);
    }
}