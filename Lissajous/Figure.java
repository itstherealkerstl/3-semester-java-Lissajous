
import java.awt.*;
import static java.lang.Math.*;
import javax.swing.JPanel;


public class Figure extends JPanel implements Globals{


    private final int phi;

    static private int fx = DEFAULTFX *180;
    static private int fy = DEFAULTFY *180;

    public Figure(int phi) {

        super(true);
        this.phi = phi;
        Color backgroundGray = new Color (237, 237, 237);
        setBackground(backgroundGray);

    }

    @Override public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;

        //Frame Format Variables
        int height_x2 = getHeight()/2;
        int width_x2 = getWidth()/2;

        //Place Crosshair
        g2D.setColor(CROSSHAIR);
        g2D.drawLine(width_x2, 0, width_x2, getHeight());
        g2D.drawLine(0, height_x2, getWidth(), height_x2);
        g2D.setColor(Color.black);

        int maximumTime = (fx * fy) / 90;
        //System.out.println(maximumTime);

        //For Loop Variables
        int functionXstart = centerToTransform(formularLissajous(0,fx),width_x2);
        int functionYstart = centerToTransform(formularLissajous(phi,fy),height_x2);

        int functionXending;
        int functionYending;

        //Formular For Loop with maximum Time
        for (int i=1; i<=maximumTime;i++) {

            functionXending = centerToTransform(formularLissajous(i,fx),width_x2);
            functionYending = centerToTransform(formularLissajous(i+phi,fy),height_x2);

            g2D.drawLine(functionXstart,functionYstart,functionXending,functionYending);

            functionXstart = functionXending;
            functionYstart = functionYending;

        }

    }

    private double formularLissajous (int zeit, int frequenz) {
        return sin((Math.PI * zeit)/frequenz);
    }

    private int centerToTransform(double coordinate, int center) {
        return center + (int) Math.floor(center * coordinate);
    }

    static void setFunctinX(int value) {
        fx=value*180;
    }

    static void setFunctionY(int value) {
        fy=value*180;
    }

}