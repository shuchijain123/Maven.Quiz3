package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK,
    PAPER,
    SCISSOR;

    String rock = "ROCK";



    public RockPaperScissorHandSign getWinner() {


        if (PAPER.equals(RockPaperScissorHandSign.ROCK)) {
            return ROCK;
        } else if (SCISSOR.equals(RockPaperScissorHandSign.PAPER)) {
            return PAPER;
        } else if (ROCK.equals(RockPaperScissorHandSign.SCISSOR)) {
            return SCISSOR;
        } else if (PAPER.equals(RockPaperScissorHandSign.ROCK)){
            return ROCK;

        }
    else {
        return SCISSOR;
    }
}








    public RockPaperScissorHandSign getLoser()
    {
        if (PAPER.equals(RockPaperScissorHandSign.PAPER)) {
            return ROCK;
        } else if(SCISSOR.equals(RockPaperScissorHandSign.SCISSOR)) {
            return PAPER;
        } else if(SCISSOR.equals(RockPaperScissorHandSign.ROCK)) {
            return ROCK;
        } else {
            return ROCK;
        }
    }

}
