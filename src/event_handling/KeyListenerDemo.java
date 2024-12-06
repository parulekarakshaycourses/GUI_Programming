package event_handling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerDemo
{
    public KeyListenerDemo()
    {
        JFrame frame = new JFrame("Key Event");
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());

        JLabel lbl = new JLabel("Welcome");
        frame.add(lbl);

        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                lbl.setText("Key Typed : key char = " + e.getKeyChar() + ", key code = " + e.getKeyCode());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                lbl.setText("Key Pressed : key char = " + e.getKeyChar() + ", key code = " + e.getKeyCode());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                lbl.setText("Key Released : key char = " + e.getKeyChar() + ", key code = " + e.getKeyCode());
            }
        });
    }

    public static void main(String[] args)
    {
        KeyListenerDemo obj = new KeyListenerDemo();
    }
}
