
import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class ControlPanel extends JPanel implements Globals, ChangeListener, Components{

    FSlider sliderX;
    FSlider sliderY;
    SpeedSlider speedSlider;

    public ControlPanel() {

        sliderX = new FSlider(LABELFX, 1, this);
        sliderY = new FSlider(LABELFY, 1, this);
        speedSlider = new SpeedSlider(LABELSPEED, 1);

        setLayout(new FlowLayout());

        add(sliderX);
        add(sliderY);
        add(speedSlider);

    }

    @Override
    public void stateChanged(ChangeEvent e) {

        //System.out.println(sliderX.getValue());
        animateFigure.setFigure(sliderX.getValue(), sliderY.getValue());
        speedSlider.getValue();

    }
}
