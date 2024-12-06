package combobox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ComboBoxDemo
{
    public ComboBoxDemo()
    {
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(300, 300);
        frame.setVisible(true);

        JComboBox cmb = new JComboBox();
        cmb.addItem("India");
        cmb.addItem("USA");
        cmb.addItem("UK");
        cmb.addItem("Australia");
        cmb.addItem("China");
        cmb.addItem("Japan");
        frame.add(cmb);

        JLabel lbl = new JLabel("Welcome");
        frame.add(lbl);

        cmb.setBounds(20, 20, 200, 30);
        lbl.setBounds(20, 100, 200, 20);

        // Event Handling

        cmb.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e)
            {
                lbl.setText("You have selected " + cmb.getSelectedItem());
            }
        });
    }

    public static void main(String[] args)
    {
        ComboBoxDemo obj = new ComboBoxDemo();
    }
}
