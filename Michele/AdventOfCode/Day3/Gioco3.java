import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Gioco3{
    int molti = 0;
    public static void main(String[] args) {
        //String parola = "ciao";
        //System.out.println(parola.charAt(1));
        //System.out.println(parola.length());

        Gioco3 game = new Gioco3();
        game.Leggi();
        System.out.println(game.molti);
    }

    void Leggi(){

        try {
            List<String> lines = Files.readAllLines(Paths.get("input.txt"));
            for (String line : lines){

                for (int i=0; i<line.length(); i++){ //brutto brutto
                    String n1 = "";
                    String n2 = "";
                    if (line.charAt(i) == 'm' ){
                        if (line.charAt(i+1) == 'u' ){
                            if (line.charAt(i+2) == 'l' ){
                                if (line.charAt(i+3) == '(' ){

                                    int cont = i+3;
                                    char[] numeri = {'0','1','2','3','4','5','6','7','8','9'};
                                    boolean bol = true;

                                    while(bol){
                                        bol = false;
                                        cont++;
                                        for (char valore : numeri){
                                            if (line.charAt(cont) == valore){
                                                n1 = n1 + line.charAt(cont);
                                                bol = true;
                                            }
                                        }
                                    }

                                    if (line.charAt(cont) == ','){
                                        bol = true;

                                        while(bol){
                                            bol = false;
                                            cont++;
                                            for (char valore : numeri){
                                                if (line.charAt(cont) == valore){
                                                    n2 = n2 + line.charAt(cont);
                                                    bol = true;
                                                }
                                            }
                                        }

                                        if (line.charAt(cont) == ')'){
                                            int x = 0;
                                            int y = 0;
                                            if (n1.length()<4){
                                                x = Integer.parseInt(n1);
                                            }
                                            if (n2.length()<4){
                                                y = Integer.parseInt(n2);
                                            }
                                            molti = molti + (x*y);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}