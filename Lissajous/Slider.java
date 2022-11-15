import javax.swing.*;
import javax.swing.event.ChangeListener;


public class Slider extends JPanel implements Globals, Components{


    JSlider slider;
    JLabel valueLabel;
    int minimum;
    int maximum;

    public Slider (String label, int minimum, int maximum, int spaces, int initialize) {

        this.minimum = minimum;
        this.maximum = maximum;

        add (new JLabel(label + " : "));

        valueLabel = new JLabel("" + initialize);
        add(valueLabel);

        slider = new JSlider (minimum, maximum, initialize);
        slider.setPaintTicks(true);
        slider.setSnapToTicks(true);
        slider.setMajorTickSpacing(spaces);
        slider.addChangeListener(changeEvent-> valueLabel.setText(" " + getValue()));

        add(slider);

    }

    public void addChangeListener (ChangeListener listener) {
        slider.addChangeListener(listener);
    }

    public int getValue() {
        return slider.getValue();
    }

    protected void setValue(int value) {
        slider.setValue(value);
    }

}
