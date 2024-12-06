package event_handling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventDemo
{
    public ActionEventDemo()
    {
        JFrame frame = new JFrame("Action Event");
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());

        JButton btn = new JButton("Click");
        frame.add(btn);

        // Event Handling
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(null, "Action Event Occured");
                System.out.println("TimeStamp = " + e.getWhen());
            }
        });
    }

    public static void main(String[] args)
    {
        ActionEventDemo obj = new ActionEventDemo();
    }
}
