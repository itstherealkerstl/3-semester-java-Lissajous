
import java.awt.*;
import javax.swing.*;


public class Lissajous extends JFrame implements Globals, Components{

    public Lissajous() {

        super ("Lissajous Figure");
        setLayout(new BorderLayout());

        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setLocation(0,0);

        add(controlPanel, BorderLayout.NORTH);
        add(animateFigure, BorderLayout.CENTER);

        setVisible(true);

    }

    public static void main(String[] args) {

        new Lissajous();
        animateFigure.startAnimation(0);

    }

}
