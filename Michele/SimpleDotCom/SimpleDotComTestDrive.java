public class SimpleDotComTestDrive{
    
    public static void main(String[] args) {
        
        SimpleDotCom dot = new SimpleDotCom();

        int[] locations = {2,3,4};
        dot.setLocationCells(locations);

        String userGuess = "2";

        String result = dot.checkYourself(userGuess);
    }    
}

class SimpleDotCom{

    int[] locationCellS;
    int numofHits = 0;

    public void setLocationCells(int[] locs){
        locationCellS = locs;
    }

    public String checkYourself(String stringguess){
        int guess = Integer.parseInt(stringguess);
        String result = "miss";

        for (int cell : locationCellS){
            if (guess == cell){
                result = "hit";
                numofHits++;
                break;
            }
        }

        if (numofHits == locationCellS.length){
            result = "kill";
        }

        System.out.println(result);
        return result;
    }
}