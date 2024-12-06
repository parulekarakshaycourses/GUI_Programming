package event_handling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapterDemo
{
    public WindowAdapterDemo()
    {
        JFrame frame = new JFrame("Focus Event");
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());

        JLabel lbl = new JLabel("Welcome");
        frame.add(lbl);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("Window Opened");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window is Closing...");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("Window Closed");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("Window Iconified");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("Window Deiconified");
            }

            @Override
            public void windowGainedFocus(WindowEvent e) {
                System.out.println("Window Focus Gained");
            }

            @Override
            public void windowLostFocus(WindowEvent e) {
                System.out.println("Window Focus Lost");
            }
        });
    }

    public static void main(String[] args)
    {
        WindowAdapterDemo obj = new WindowAdapterDemo();
    }
}
