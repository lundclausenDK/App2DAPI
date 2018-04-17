package app2dapi.myadapter;

import app2dapi.App2D;
import app2dapi.Device;
import app2dapi.graphics.Canvas;

public class Main {
    
    static Canvas canvas;
    
    public static void main(String[] args) {
        Device device = new MyDevice();
        BackgammonAppInterface BackgammonPlayer = new BackgammonAppPlayer();
        App2D appPlayer = new Adapter(BackgammonPlayer);
        
        // Play backgammon
        appPlayer.initialize(device);
        appPlayer.showMouseCursor();
        appPlayer.draw(canvas);
        appPlayer.destroy();
        appPlayer.update(0);
        
    }
    
}
