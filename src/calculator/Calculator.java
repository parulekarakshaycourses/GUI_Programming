package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator
{
    Calculator()
    {
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setTitle("Calculator");
        frame.setSize(380, 280);
        frame.setVisible(true);

        JLabel lbl1 = new JLabel("Enter 1st number");
        lbl1.setBounds(20, 20, 100, 30);
        frame.add(lbl1);

        JTextField t1 = new JTextField();
        t1.setBounds(150, 20, 100, 30);
        frame.add(t1);

        JLabel lbl2 = new JLabel("Enter 2nd number");
        lbl2.setBounds(20, 60, 120, 30);
        frame.add(lbl2);

        JTextField t2 = new JTextField();
        t2.setBounds(150, 60, 100, 30);
        frame.add(t2);

        JLabel lbl3 = new JLabel("Result");
        lbl3.setBounds(20, 100, 100, 30);
        frame.add(lbl3);

        JTextField t3 = new JTextField();
        t3.setBounds(150, 100, 100, 30);
        t3.setEnabled(false);
        frame.add(t3);

        Button btnAdd = new Button("ADD");
        btnAdd.setBounds(20, 150, 100, 30);
        frame.add(btnAdd);

        Button btnSub = new Button("SUB");
        btnSub.setBounds(130, 150, 100, 30);
        frame.add(btnSub);

        Button btnMul = new Button("MUL");
        btnMul.setBounds(240, 150, 100, 30);
        frame.add(btnMul);

        Button btnDiv = new Button("DIV");
        btnDiv.setBounds(20, 190, 100, 30);
        frame.add(btnDiv);

        Button btnMod = new Button("MOD");
        btnMod.setBounds(130, 190, 100, 30);
        frame.add(btnMod);

        Button btnClear = new Button("CLEAR");
        btnClear.setBounds(240, 190, 100, 30);
        frame.add(btnClear);

        // Event Handling
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                t1.setText("");
                t2.setText("");
                t3.setText("");
            }
        });

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a + b;
                t3.setText(c + "");
            //    t3.setText(String.valueOf(c));
            }
        });

        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a - b;
                t3.setText(c + "");
            }
        });

        btnMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a * b;
                t3.setText(c + "");
            }
        });

        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a / b;
                t3.setText(c + "");
            }
        });

        btnMod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a % b;
                t3.setText(c + "");
            }
        });
    }

    public static void main(String[] args)
    {
        Calculator obj = new Calculator();
    }
}
