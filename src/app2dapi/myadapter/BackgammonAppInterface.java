package app2dapi.myadapter;

import app2dapi.graphics.Canvas;

public interface BackgammonAppInterface {
    boolean touch();
    void throwDice();
    void movePiece(Canvas canvas);
    void resetPiece();
    boolean pieceCounter();
}
