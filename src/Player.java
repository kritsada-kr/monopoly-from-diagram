public class Player {
    private String name;
    private Piece piece;
    private Die[] dice;
    private Board board;


    public void takeTurn(){
        int fvTotal=0;
        for(Die die:dice){
            die.roll();
            fvTotal += die.getFaceValue();
        }

        Square oldLoc =piece.getLocation();
        Square newLoc =board.getSquare(oldLoc,fvTotal);
        piece.setLocation(newLoc);
    }
}
