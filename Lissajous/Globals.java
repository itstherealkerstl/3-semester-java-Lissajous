
import java.awt.Color;

public interface Globals {

    //Color Crosshair
    Color CROSSHAIR = new Color (107, 160, 50);

    //Labeling fx and fy
    String LABELFX = "fx";
    String LABELFY = "fy";

    //Constants min f, max f, space(ticks)
    int MINIMUMF = 1;
    int MAXIMUMF = 7;
    int SPACEF = 1;

    //DEFAULT fx fy
    int DEFAULTFX = 2;
    int DEFAULTFY = 3;

    //Constants Speed
    String LABELSPEED = "Speed";

    int MINIMUMSPEED = 0;
    int MAXIMUMSPEED = 100;
    int SPACESSPEED = 10;
    int DEFAULTSPEED = 80;
    int SPEEDCLAMPING = 10;

    //forumlar phase shift
    int MAXIMUMPHI = MAXIMUMF * MAXIMUMF * 360;

}
