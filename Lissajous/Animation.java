
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Animation extends JPanel implements Globals, ActionListener{

    CardLayout cardSetLayout;
    private final Timer timer;

    public Animation () {

        cardSetLayout = new CardLayout();
        setLayout(cardSetLayout);

        //maximum phase shift figure for loop
        for(int i = 0; i <= MAXIMUMPHI; i++) {
            add(new Figure(i));
        }

        setFigure(DEFAULTFX, DEFAULTFY);
        timer = new Timer(MAXIMUMSPEED - DEFAULTSPEED + MINIMUMSPEED, this);

    }

    public void setFigure(int fx, int fy) {
        Figure.setFunctinX(fx);
        Figure.setFunctionY(fy);
    }

    public void startAnimation(int delay) {
        timer.setDelay(delay);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cardSetLayout.next(this);
    }

}
