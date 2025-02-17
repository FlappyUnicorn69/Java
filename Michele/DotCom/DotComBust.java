import java.util.ArrayList;

public class DotComBust{

    GameHelper helper = new GameHelper();

    ArrayList<DotCom> dotComList = new ArrayList<DotCom>();

    int numOfGuess = 0;


    public void setUpGame(){

        DotCom Dot1 = new DotCom();      //creato nuovo oggetto DotCom
        Dot1.setName("nave1");

        DotCom Dot2 = new DotCom();
        Dot2.setName("nave2");

        DotCom Dot3 = new DotCom();
        Dot3.setName("nave3");

        dotComList.add(Dot1); //aggiunto ad ArrayList dotComList
        dotComList.add(Dot2);
        dotComList.add(Dot3);

        for (DotCom dotComToSet : dotComList){
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    public void startPlaying(){
        while(!dotComList.isEmpty()){
            String userGuess = helper.getUserInput("indovina posizione");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    public void checkUserGuess(String userGuess){
        numOfGuess++;
        String result ="miss";
        
        for (DotCom dotComToTest : dotComList){
            result = dotComToTest.checkYourself(userGuess);
            if(result.equals("hit")){
                break;
            }

            if(result.equals("kill")){
                dotComList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    public void finishGame(){
        System.out.println("tutte le navi affondate");
        if(numOfGuess <= 18){
            System.out.println("bravo ci hai messo solo " + numOfGuess + " tentativi");
        }else{
            System.out.println("ci hai messo troppi tentativi. " + numOfGuess + " tentativi");
        }
    }


    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
