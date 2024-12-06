import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BiodataForm extends JFrame
{
    BiodataForm()
    {
        setLayout(null);
        setSize(500, 450);
        setVisible(true);
        setTitle("Biodata Form");
        setBackground(Color.decode("#e7f1f1"));


        Font myFont = new Font("Times New Roman", Font.BOLD, 20);

        Label lblHeader = new Label("Biodata Form");
        lblHeader.setFont(myFont);
        lblHeader.setBounds(150, 10, 300, 20);
        add(lblHeader);

        Label lblName = new Label("Enter Name");
        lblName.setBounds(10, 50, 100, 20);
        lblName.setAlignment(Label.RIGHT);
        add(lblName);

        TextField tName = new TextField();
        tName.setBounds(120, 50, 150, 20);
        add(tName);

        Label lblGender = new Label("Select Gender");
        lblGender.setBounds(10, 80, 100, 20);
        lblGender.setAlignment(Label.RIGHT);
        add(lblGender);

        JRadioButton rMale = new JRadioButton("Male", true);
        JRadioButton rFemale = new JRadioButton("Female", false);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rMale);
        bg.add(rFemale);

        rMale.setBounds(120, 80, 100, 20);
        rFemale.setBounds(220, 80, 100, 20);
        add(rMale);
        add(rFemale);

        Label lblHobby = new Label("Select Hobby");
        lblHobby.setBounds(10, 110, 100, 20);
        lblHobby.setAlignment(Label.RIGHT);
        add(lblHobby);

        Checkbox chkReading = new Checkbox("Reading");
        Checkbox chkWriting = new Checkbox("Writing");
        Checkbox chkDancing = new Checkbox("Dancing");
        Checkbox chkSinging = new Checkbox("Singing");

        chkReading.setBounds(120, 110, 100, 20);
        chkWriting.setBounds(120, 140, 100, 20);
        chkDancing.setBounds(120, 170, 100, 20);
        chkSinging.setBounds(120, 200, 100, 20);

        add(chkReading);
        add(chkWriting);
        add(chkDancing);
        add(chkSinging);

        Label lblCountry = new Label("Select Country");
        lblCountry.setBounds(10, 230, 100, 20);
        lblCountry.setAlignment(Label.RIGHT);
        add(lblCountry);

        JComboBox cmbCountry = new JComboBox();
        cmbCountry.addItem("India");
        cmbCountry.addItem("USA");
        cmbCountry.addItem("UK");
        cmbCountry.addItem("Russia");
        cmbCountry.addItem("Australiya");

        cmbCountry.setBounds(120, 230, 100, 20);
        add(cmbCountry);

        Label lblAddress = new Label("Select Address");
        lblAddress.setBounds(10, 260, 100, 20);
        lblAddress.setAlignment(Label.RIGHT);
        add(lblAddress);

        TextArea tAddress = new TextArea();
        tAddress.setBounds(120, 260, 250, 80);
        add(tAddress);

        Button btnClear = new Button("CLEAR");
        btnClear.setBounds(120, 350, 100, 30);
        btnClear.setBackground(Color.red);
        btnClear.setForeground(Color.white);
        add(btnClear);

        Button btnSubmit = new Button("SUBMIT");
        btnSubmit.setBounds(230, 350, 100, 30);
        btnSubmit.setBackground(Color.green);
        add(btnSubmit);

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                tName.setText("");
                tAddress.setText("");
                rMale.setSelected(true);
                chkReading.setState(false);
                chkWriting.setState(false);
                chkDancing.setState(false);
                chkSinging.setState(false);
                cmbCountry.setSelectedIndex(0);
            }
        });

        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(null, "Data Saved Sucesssfully", "Biodata Form", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    public static void main(String[] args)
    {
        BiodataForm obj = new BiodataForm();
    }
}
