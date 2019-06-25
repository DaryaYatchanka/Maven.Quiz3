package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
   SIGN, SCISSORS, ROCK, PAPER;

    public RockPaperScissorHandSign getWinner() {
        if (SIGN ==ROCK){
            return PAPER;

        }
        else if(SIGN ==PAPER){
            return SCISSORS;
        }
        else {
            return ROCK;
        }

    }

    public RockPaperScissorHandSign getLoser() {

     return null;
    }
}
