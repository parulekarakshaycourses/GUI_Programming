package event_handling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class FocusListenerDemo
{
    public FocusListenerDemo()
    {
        JFrame frame = new JFrame("Focus Event");
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());

        JLabel lbl = new JLabel("Welcome");
        frame.add(lbl);

        frame.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                lbl.setText("Focus Gained");
            }

            @Override
            public void focusLost(FocusEvent e) {
                lbl.setText("Focus Lost");
            }
        });
    }

    public static void main(String[] args)
    {
        FocusListenerDemo obj = new FocusListenerDemo();
    }
}
