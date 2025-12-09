package classes;

public abstract class ChessPiece {
    public boolean taken = false;
    public int rowNumber;
    public int columnNumber;

    public void exitChessBoard(){
        this.taken = true;
    }

}
