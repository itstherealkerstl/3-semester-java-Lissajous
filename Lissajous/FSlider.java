
import javax.swing.event.*;


public class FSlider extends Slider implements Globals, Components{

    public FSlider(String stringlabel, int initalize, ChangeListener listener) {

        super(stringlabel, MINIMUMF, MAXIMUMF, SPACEF, initalize);

        slider.setPaintLabels(true);
        valueLabel.setVisible(false);
        addChangeListener(listener);

    }

}
