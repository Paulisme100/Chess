package classes;

public abstract class ChessPiece {

    public String id;

    public boolean taken = false;
    public int rowNumber;
    public int columnNumber;
    public Team team;

    public ChessPiece(String id, int rowNumber, int columnNumber, Team team) {
        this.id = id;
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
        this.team = team;
    }

    public void exitChessBoard(){
        this.taken = true;
    }

}
