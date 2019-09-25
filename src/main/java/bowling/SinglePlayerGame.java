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
        public ArrayList<Tuple> playerScore= new ArrayList<Tuple>();
        public boolean firstBall = true;
        public int lastPoint = 0;


	/**
	 * Cette méthode doit être appelée à chaque lancé de boule
	 *
	 * @param nombreDeQuillesAbattues le nombre de quilles abattues lors de
	 * ce lancé
	 */
	public void lancer(int nombreDeQuillesAbattues) {
            
            Tuple points = new Tuple<>(0,0);
            
            points.x=nombreDeQuillesAbattues;
            if(nombreDeQuillesAbattues == 10){
                points.y=1;
                this.playerScore.add(lances,points);               
            }
            else{
                if(firstBall){
                    points.y=0;
                    firstBall=false;
                    lastPoint=points.x;
                }
                else{
                    if(lastPoint+points.x==10){
                        points.y=2;
                    }
                    else{
                        points.y=0;
                    }
                    firstBall=true;
                }
            }
	}
    
	/**
	 * Cette méthode donne le score du joueur
	 *
	 * @return Le score du joueur
	 */
	public int score() {
                return sum(playerScore);
	}
        public int sum(ArrayList<Tuple> score){
            int sum = 0;      
            for(int i = 0; i < score.size(); i++){
                sum += score.get(i).x; 
                if(score.get(i).y==1){
                    sum+=score.get(i+1).x+score.get(i+2).x;
                }
                if(score.get(i).y==2){
                    sum+=score.get(i+1).x;                
                }
            }
            return sum;
        }
}
