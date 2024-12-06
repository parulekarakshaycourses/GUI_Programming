package event_handling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEventDemo implements ItemListener
{
    JLabel lbl;

    public ItemEventDemo()
    {
        JFrame frame = new JFrame("Item Event");
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());

        JCheckBox chkReading = new JCheckBox("Reading");
        JCheckBox chkWriting = new JCheckBox("Writing");
        JCheckBox chkDancing = new JCheckBox("Dancing");
        JCheckBox chkSinging = new JCheckBox("Singing");

        frame.add(chkReading); frame.add(chkWriting); frame.add(chkDancing); frame.add(chkSinging);

        chkReading.addItemListener(this);
        chkWriting.addItemListener(this);
        chkDancing.addItemListener(this);
        chkSinging.addItemListener(this);

        lbl = new JLabel("This is Label");
        frame.add(lbl);
    }

    public static void main(String[] args)
    {
        ItemEventDemo obj = new ItemEventDemo();
    }

    @Override
    public void itemStateChanged(ItemEvent e)
    {
        JCheckBox chk = ((JCheckBox)e.getItem());
        String hobby = chk.getText();
        boolean state = chk.isSelected();
    //    boolean state = e.getStateChange();

        lbl.setText(hobby + " : " + state);
    }
}
