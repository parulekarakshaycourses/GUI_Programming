package colorchooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChooserDemo
{
    public ColorChooserDemo()
    {
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 300);
        frame.setVisible(true);
        Container container = frame.getContentPane();

        JButton btn = new JButton("Pick Color");
        frame.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Color colorSelected = JColorChooser.showDialog(null, "Please Choose Color", Color.red);
                container.setBackground(colorSelected);
            }
        });
    }

    public static void main(String[] args)
    {
        ColorChooserDemo obj = new ColorChooserDemo();
    }
}
