package piece;
public class Rook extends Piece
{   
    public Rook(String player, int x, int y)
    {
        //setting initial board position
        super(player, "rook", x, y);
    }
    
    @Override
    public boolean moveLegal(int finX, int finY)
    {
        //x is unchanged xor y is unchanged
        return (finX == this.curX) ^ (finY == this.curY);
    }
}