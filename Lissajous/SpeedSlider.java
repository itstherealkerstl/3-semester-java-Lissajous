
public class SpeedSlider extends Slider implements Globals, Components{


    public SpeedSlider(String stringlabel, int initialize) {

        //Super from Slider
        super(stringlabel, MINIMUMSPEED, MAXIMUMSPEED, SPACESSPEED, initialize);
        slider.setPaintLabels(false);
        valueLabel.setVisible(true);

        //Slider Spaceing 5
        slider.setMinorTickSpacing(5);

        addChangeListener(changeEvent -> {
            if(getValue() > MINIMUMSPEED) {
                       animateFigure.startAnimation(super.getValue()+ SPEEDCLAMPING);
            }
        });

        setValue(MAXIMUMSPEED - initialize + MINIMUMSPEED);

    }

    @Override public int getValue() {
        return maximum - super.getValue() + minimum;
    }

}
