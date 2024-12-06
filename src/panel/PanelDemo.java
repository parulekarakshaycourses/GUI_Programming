package panel;

import javax.swing.*;
import java.awt.*;

public class PanelDemo
{
    public PanelDemo()
    {
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(500, 500);

        Button btn1 = new Button("Outisde");
        btn1.setBounds(100, 20, 100, 30);
        frame.add(btn1);

        Panel panel = new Panel();
        panel.setSize(200, 200);
        panel.setName("My Panel");
        panel.setBackground(Color.gray);
        panel.setBounds(100, 100, 200, 200);

        Button btn2 = new Button("Inside");
        panel.add(btn2);

        frame.add(panel);
    }

    public static void main(String[] args)
    {
        PanelDemo obj = new PanelDemo();
    }
}
