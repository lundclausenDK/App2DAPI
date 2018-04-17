package app2dapi.myadapter;

import app2dapi.graphics.Canvas;

public class BackgammonAppPlayer implements BackgammonAppInterface {

    @Override
    public boolean touch() {
        System.out.println("We do not need mousecursor on iPad!");
        return false;
    }

    @Override
    public void movePiece(Canvas canvas) {
        System.out.println("Dices thrown and piece moved!");
    }

    @Override
    public void resetPiece() {
        System.out.println("Reset opponents piece, back to start!");
    }

    @Override
    public boolean pieceCounter(double delay) {
        System.out.println("Pieces counted with: " + delay + " delay");
        return true;
    }

    

}
