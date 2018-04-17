package app2dapi.myadapter;

import app2dapi.graphics.ColorFactory;
import app2dapi.graphics.Screen;

public class IpadScreen implements Screen {

    @Override
    public int getPixelWidth() {
        return 2048;
    }

    @Override
    public int getPixelHeight() {
        return 2732;
    }

    @Override
    public ColorFactory getColorFactory() {
        ColorFactory ColorFactory = null;
        return ColorFactory;
    }

}
