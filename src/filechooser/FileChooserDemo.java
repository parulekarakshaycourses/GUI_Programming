package filechooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class FileChooserDemo
{
    public FileChooserDemo()
    {
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 300);
        frame.setVisible(true);

        JButton btnOpen = new JButton("Open File");
        JButton btnSave = new JButton("Save File");
        frame.add(btnOpen); frame.add(btnSave);

        btnOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JFileChooser fileChooser = new JFileChooser();
                int status = fileChooser.showOpenDialog(null);

                if(status == JFileChooser.APPROVE_OPTION)
                {
                    File fileSelected = fileChooser.getSelectedFile();
                    JOptionPane.showMessageDialog(null, "File Opened : " + fileSelected.getAbsolutePath(), "Dialogue", JOptionPane.INFORMATION_MESSAGE);
                }
                else if(status == JFileChooser.CANCEL_OPTION)
                {
                    JOptionPane.showMessageDialog(null, "File Canced", "Dialogue", JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Error Occured", "Dialogue", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JFileChooser fileChooser = new JFileChooser();
                int status = fileChooser.showSaveDialog(null);

                if(status == JFileChooser.APPROVE_OPTION)
                {
                    File fileSelected = fileChooser.getSelectedFile();
                    JOptionPane.showMessageDialog(null, "File Saved : " + fileSelected.getAbsolutePath(), "Dialogue", JOptionPane.INFORMATION_MESSAGE);
                }
                else if(status == JFileChooser.CANCEL_OPTION)
                {
                    JOptionPane.showMessageDialog(null, "File Canced", "Dialogue", JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Error Occured", "Dialogue", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args)
    {
        FileChooserDemo obj = new FileChooserDemo();
    }
}
