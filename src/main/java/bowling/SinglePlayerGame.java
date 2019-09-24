package bowling;

import java.util.ArrayList;

/**
 * Cette classe a pour but d'enregistrer le nombre de quilles abattues lors des
 * lancés successifs d'<b>un seul et même</b> joueur, et de calculer le score
 * final de ce joueur
 */
public class SinglePlayerGame {

	/**
	 * Constructeur
	 */
	public SinglePlayerGame() {
	}
        public int lances=0;
        public int tours=0;
        public ArrayList playerScore= new ArrayList<Integer>();
        public boolean lastTurnStrike = false;


	/**
	 * Cette méthode doit être appelée à chaque lancé de boule
	 *
	 * @param nombreDeQuillesAbattues le nombre de quilles abattues lors de
	 * ce lancé
	 */
	public void lancer(int nombreDeQuillesAbattues) {
            this.playerScore.add(lances,nombreDeQuillesAbattues);
                this.lances+=1;                      
	}
    
	/**
	 * Cette méthode donne le score du joueur
	 *
	 * @return Le score du joueur
	 */
	public int score() {
                return sum(playerScore);
	}
        public int sum(ArrayList<Integer> score){
            int sum = 0;
            for(int i = 0; i < score.size(); i++){
                if(score.get(i)==10){
                    sum = sum+score.get(i)+score.get(i+1)+score.get(i+2);
                }
                else{
                  sum = sum+score.get(i);  
                }
                
            }
            return sum;
        }
}
