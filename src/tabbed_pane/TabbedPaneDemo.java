package tabbed_pane;

import javax.swing.*;
import java.awt.*;

public class TabbedPaneDemo
{
    public TabbedPaneDemo()
    {
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.setSize(400, 400);
        frame.setVisible(true);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.red);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.yellow);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.blue);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.add("Tab1", panel1);
        tabbedPane.add("Tab2", panel2);
        tabbedPane.add("Tab3", panel3);

        frame.add(tabbedPane);
    }

    public static void main(String[] args)
    {
        TabbedPaneDemo obj = new TabbedPaneDemo();
    }
}
