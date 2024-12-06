package list;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;

public class ListDemo
{
    public ListDemo()
    {
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(300, 300);
        frame.setVisible(true);

        DefaultListModel listModel = new DefaultListModel();
        listModel.addElement("India");
        listModel.addElement("USA");
        listModel.addElement("UK");
        listModel.addElement("Australia");
        listModel.addElement("China");
        listModel.addElement("Japan");

        JList list = new JList(listModel);
        frame.add(list);


        JLabel lbl = new JLabel("Welcome");
        frame.add(lbl);

        list.setBounds(20, 20, 200, 300);
        lbl.setBounds(20, 400, 1000, 20);

        // Event Handling
        list.addListSelectionListener(new ListSelectionListener()
        {
            @Override
            public void valueChanged(ListSelectionEvent e)
            {
                lbl.setText("You have selected " + list.getSelectedValuesList());
            }
        });

    }

    public static void main(String[] args)
    {
        ListDemo obj = new ListDemo();
    }
}
