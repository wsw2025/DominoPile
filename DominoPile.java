import java.util.ArrayList;
import java.util.Random;
public class DominoPile {

    Random rand = new Random();
    private ArrayList<Domino> pile = new ArrayList();

    public DominoPile(){
        pile.clear();
    }

    public ArrayList<Domino> getPile(){
        return pile;
    }
    public void newStack6(){
        for (int i = 0; i <= 6; i++){
            for (int j = i; j <= 6; j++){
                pile.add(new Domino(i, j));
            }
        }
    }

    public void shuffle(){
        ArrayList<Domino> temp = new ArrayList();
        for (int i = 0; i < pile.size(); i++){
            int random = rand.nextInt(pile.size());
            temp.add(pile.get(random));
            pile.remove(random);
        }
        pile = temp;
    }
}
