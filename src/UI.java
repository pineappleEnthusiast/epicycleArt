import javax.swing.*;
import java.awt.*;

public class UI {
    public UI() {
        JFrame frame = new JFrame("User Interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 700);
        frame.setLocation(50, 25);
        JRadioButton canny = new JRadioButton("Canny");
        JRadioButton sobel = new JRadioButton("Sobel");
        JRadioButton laplace = new JRadioButton("None");
        ButtonGroup edgeDetection = new ButtonGroup();
        JPanel edgePanel = new JPanel(new GridLayout(2, 2));
    }}
