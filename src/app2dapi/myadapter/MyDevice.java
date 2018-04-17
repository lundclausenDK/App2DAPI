package app2dapi.myadapter;

import app2dapi.Device;
import app2dapi.geometry.G2D;
import app2dapi.graphics.Screen;
import app2dapi.input.charinput.CharInput;
import app2dapi.input.keyboard.Keyboard;
import app2dapi.input.mouse.Mouse;

public class MyDevice implements Device {
    
    Screen IpadScreen = new IpadScreen();

    @Override
    public Screen getScreen() {
        return IpadScreen;
    }

    @Override
    public Keyboard getKeyboard() {
        Keyboard Keyboard = null;
        return Keyboard;
    }

    @Override
    public CharInput getCharInput() {
        CharInput CharInput = null;
        return CharInput;
    }

    @Override
    public Mouse getMouse() {
        Mouse Mouse = null;
        return Mouse;
    }

    @Override
    public G2D getGeometry2D() {
        G2D G2D = null;
        return G2D;
    }

}
