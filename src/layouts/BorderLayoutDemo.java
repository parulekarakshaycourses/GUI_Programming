package layouts;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo
{
    public BorderLayoutDemo()
    {
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout(10, 10));
        frame.setSize(300, 300);
        frame.setVisible(true);

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");

        frame.add(b1, BorderLayout.NORTH);
        frame.add(b2, BorderLayout.SOUTH);
        frame.add(b3, BorderLayout.EAST);
        frame.add(b4, BorderLayout.WEST);
        frame.add(b5, BorderLayout.CENTER);
    }

    public static void main(String[] args)
    {
        BorderLayoutDemo obj = new BorderLayoutDemo();
    }
}
