package app2dapi.myadapter;

import app2dapi.App2D;
import app2dapi.Device;
import app2dapi.graphics.Canvas;

public class Adapter implements App2D {

    private BackgammonAppInterface app;
    private IpadInterface iPad;

    public Adapter(BackgammonAppInterface app) {
        this.app = app;
    }

    @Override
    public boolean showMouseCursor() {
        return app.touch();
    }

    @Override
    public boolean initialize(Device device) {
        double screenX = device.getScreen().getPixelWidth();
        double screenY = device.getScreen().getPixelHeight();
        iPad.init();
        iPad.turnOn();
        iPad.updateViewport(screenX, screenY);
        return true;
    }

    @Override
    public boolean update(double time) {
        return app.pieceCounter();
    }

    @Override
    public void draw(Canvas canvas) {
        app.movePiece(canvas);
    }

    @Override
    public void destroy() {
        app.resetPiece();
    }

}
