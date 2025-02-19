import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class AdventOfCode2 {
    public static void main(String[] args) throws IOException {
        int Safe = 0;
        List<Integer> report = new ArrayList<Integer>();
    }

         boolean Cresce(List<Integer> l)  {
             return IntStream.range(0, l.size()-1).allMatch(i -> l.get(i) < l.get(i+1)); }
        boolean Decresce(List<Integer> l) { 
            return IntStream.range(0, l.size()-1).allMatch(i -> l.get(i) > l.get(i+1)); }
        boolean Diff(List<Integer> l) { 
            return IntStream.range(0, l.size()-1)
                    .allMatch(i -> Math.abs(l.get(i)-l.get(i+1)) >= 1 && Math.abs(l.get(i)-l.get(i+1)) <= 3); 

        }
                   

    }
