package BiodataForm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BiodataForm
{
    BiodataForm()
    {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setTitle("Biodata Form");
        frame.setLayout(null);

        JLabel lblTitle = new JLabel("Biodata Form");
    //    lblTitle.setText("Biodata Form");
        lblTitle.setBounds(180, 0, 200, 30);

        Font myFont = new Font("Arial", Font.BOLD, 20);
        lblTitle.setFont(myFont);
        lblTitle.setForeground(Color.BLACK);

        frame.add(lblTitle);

        JLabel lblName = new JLabel("Enter Name");
        lblName.setBounds(20, 50, 100, 30);
        frame.add(lblName);

        JTextField tName = new JTextField();
        tName.setBounds(150, 50, 200, 30);
        frame.add(tName);

        JLabel lblPassword = new JLabel("Enter Password");
        lblPassword.setBounds(20, 100, 100, 30);
        frame.add(lblPassword);

        JPasswordField tPassword = new JPasswordField();
        tPassword.setBounds(150, 100, 100, 30);
        frame.add(tPassword);

        JLabel lblGender = new JLabel("Select Gender");
        lblGender.setBounds(20, 150, 100, 30);
        frame.add(lblGender);

        JRadioButton rMale = new JRadioButton("Male", true);
        JRadioButton rFemale = new JRadioButton("Female");

        rMale.setBounds(150, 150, 70, 30);
        rFemale.setBounds(220, 150, 70, 30);

        frame.add(rMale); frame.add(rFemale);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rMale); bg.add(rFemale);

        JLabel lblHobbies = new JLabel("Select Hobbies");
        lblHobbies.setBounds(20, 200, 100, 30);
        frame.add(lblHobbies);

        JCheckBox chkReading = new JCheckBox("Reading");
        JCheckBox chkWriting = new JCheckBox("Writing");
        JCheckBox chkDancing = new JCheckBox("Dancing");
        JCheckBox chkSinging = new JCheckBox("Singing");

        chkReading.setBounds(150, 200, 150, 30);
        chkWriting.setBounds(150, 230, 150, 30);
        chkDancing.setBounds(150, 260, 150, 30);
        chkSinging.setBounds(150, 290, 150, 30);

        frame.add(chkReading); frame.add(chkWriting);
        frame.add(chkDancing); frame.add(chkSinging);

        JLabel lblAddress = new JLabel("Address");
        lblAddress.setBounds(20, 330, 100, 30);
        frame.add(lblAddress);

        JTextArea tAddress = new JTextArea();
        tAddress.setBounds(150, 330, 200, 70);
        frame.add(tAddress);

        JButton btnSave = new JButton("SAVE");
        btnSave.setBounds(150, 420, 100, 30);
        frame.add(btnSave);

        JButton btnClear = new JButton("CLEAR");
        btnClear.setBounds(260, 420, 100, 30);
        frame.add(btnClear);

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tName.setText("");
                tPassword.setText("");
                tAddress.setText("");
                rMale.setSelected(true);
                chkReading.setSelected(false);
                chkWriting.setSelected(false);
                chkDancing.setSelected(false);
                chkSinging.setSelected(false);
            }
        });

        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Data Saved Successfully", "Biodata Form", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    public static void main(String[] args)
    {
        BiodataForm obj = new BiodataForm();
    }
}
