/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Students Names: 
 * Description: Lab 02 - LightBulb
 */

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

// TODO #1: define the LightBulb class according to specifications
class LightBulb {

    static final int MIN_LUMENS = 220;
    static final int MAX_LUMENS = 1300;

    // define your instance variables here


    public LightBulb(int lumens) {

    }

    public int getLumens() {
        return 0;
    }

    public boolean isOn() {
        return false;
    }

    public void turnOn() {

    }

    public void turnOff() {

    }
}

// TODO #2: define the DimmableLightBulb class according to specifications
class DimmableLightBulb extends LightBulb {

    static final int MIN_DIMMER = 0;
    static final int MAX_DIMMER = 100;

    // define your instance variable here

    public DimmableLightBulb(int lumens) {
        super(lumens); // this calls the parent's class constructor
    }

    public int getDimmer() {
        return 0;
    }

    public void setDimmer(int dimmer) {

    }
}

class RoomFrame extends JFrame implements ActionListener, ChangeListener {

    static final int WIDTH  = 400;
    static final int HEIGHT = 400;
    static final String TITLE = "CS 2050 - Lab 02";
    private LightBulb lightBulb; // reference to the LightBulb object
    private JToggleButton onOffSwitch;
    private JSlider dimmerSlider;
    private static final String ON_SWITCH_LABEL = "ON";
    private static final String OFF_SWITCH_LABEL = "OFF";
    private static final int MAX_RGB = 255;
    private static final int MIN_RGB = 50;
    private static final double EPS = 0.01;

    RoomFrame(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
        setSize(WIDTH, HEIGHT);
        setTitle(TITLE);

        // content pane
        Container contentPane = getContentPane();
        contentPane.setBackground(Color.BLACK);

        // controls
        JPanel controlPanel = new JPanel(new GridLayout(1, 2));
        onOffSwitch = new JToggleButton(ON_SWITCH_LABEL);
        onOffSwitch.addActionListener(this);
        controlPanel.add(onOffSwitch);
        if (lightBulb instanceof DimmableLightBulb) {
            dimmerSlider = new JSlider(JSlider.HORIZONTAL, DimmableLightBulb.MIN_DIMMER, DimmableLightBulb.MAX_DIMMER, ((DimmableLightBulb) lightBulb).getDimmer());
            Hashtable labelTable = new Hashtable();
            labelTable.put( DimmableLightBulb.MIN_DIMMER, new JLabel("" + DimmableLightBulb.MIN_DIMMER) );
            labelTable.put( DimmableLightBulb.MAX_DIMMER, new JLabel("" + DimmableLightBulb.MAX_DIMMER) );
            dimmerSlider.setLabelTable(labelTable);
            dimmerSlider.setPaintLabels(true);
            dimmerSlider.addChangeListener(this);
            controlPanel.add(dimmerSlider);
        }
        contentPane.add(controlPanel, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.WHITE);
        setVisible(true);
    }

    /**
     * This method is automatically called when the on/off switch button is clicked
     * @param actionEvent
     */
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (onOffSwitch.getText().equals(ON_SWITCH_LABEL)) {
            onOffSwitch.setText(OFF_SWITCH_LABEL);

            // TODO #3:
            // turn the light ON;
            // get its lumens and save it in a (local) variable;
            // if the light is dimmable (hint: use Java's instanceof operator), adjust lumens based on the dimmer value;
            // convert lumens to rgb using the lumensToRgb (static) method


            // rest of the code assumes rgb was saved in variable with the same name
            Color color = new Color(rgb, rgb, 0);
            getContentPane().setBackground(color);
        }
        else {
            onOffSwitch.setText(ON_SWITCH_LABEL);
            lightBulb.turnOff();
            getContentPane().setBackground(Color.BLACK);
        }
        revalidate();
    }

    /**
     * This method is automatically called when the dimmer slider changes
     * @param changeEvent
     */
    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        int dimmer = dimmerSlider.getValue();
        // TODO #4:
        // adjust the light bulb dimmer accordingly;
        // if light is ON, repeat steps described on TODO #3

        if (lightBulb.isOn()) {


            // rest of the code assumes rgb was saved in variable with the same name
            Color color = new Color(rgb, rgb, 0);
            getContentPane().setBackground(color);
            revalidate();
        }
    }

    /**
     * This method converts lumens to the amount of red and green to be used when building a color with a shade of yellow
     * @param lumens
     * @return
     */
    private static int lumensToRgb(int lumens) {
        return (int) Math.round((lumens - LightBulb.MIN_LUMENS) * (double) (MAX_RGB - MIN_RGB) / (LightBulb.MAX_LUMENS - LightBulb.MIN_LUMENS) + MIN_RGB);
    }

    public static void main(String[] args) {
        Object[] options = {"Basic", "Dimmable"};
        int choice = JOptionPane.showOptionDialog(null, "What kind of light bulb do you want?", TITLE, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        String str = JOptionPane.showInputDialog(null, "Enter amount of lumens [" + LightBulb.MIN_LUMENS + ", " + LightBulb.MAX_LUMENS + "]:", TITLE, JOptionPane.QUESTION_MESSAGE);
        int lumens = Integer.parseInt(str);
        // TODO #5:
        //  declare a lightBulb variable of LightBulb type
        //  instantiate a light bulb accordingly to choice (0 -> LightBulb, 1 -> DimmableLightBulb), saving the reference using lightBulb
        // instantiate a RoomFrame object passing the light bulb reference

    }
}


