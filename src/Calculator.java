import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame
{
    Calculator()
    {
        setLayout(new GridLayout(6, 2, 5, 5));
        setSize(500, 500);
        setVisible(true);
        setTitle("Calculator");

        Label lbl1 = new Label("Enter 1st Number");
        add(lbl1);

        TextField t1 = new TextField();
        add(t1);

        Label lbl2 = new Label("Enter 2nd Number");
        add(lbl2);

        TextField t2 = new TextField();
        add(t2);

        Label lbl3 = new Label("Result");
        add(lbl3);

        TextField tResult = new TextField();
        add(tResult);

        Button btnAdd = new Button("ADD");
        Button btnSub = new Button("SUB");
        Button btnMul = new Button("MUL");
        Button btnDiv = new Button("DIV");
        Button btnMod = new Button("MOD");
        Button btnClear = new Button("CLEAR");

        add(btnAdd);
        add(btnSub);
        add(btnMul);
        add(btnDiv);
        add(btnMod);
        add(btnClear);

        Font myFont = new Font("Arial", Font.BOLD, 40);
        t1.setFont(myFont);
        t2.setFont(myFont);
        tResult.setFont(myFont);

        tResult.setEnabled(false);

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                t1.setText("");
                t2.setText("");
                tResult.setText("");
            }
        });

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());
                double c = a + b;
            //    tResult.setText(String.valueOf(c));
                tResult.setText(c + "");
            }
        });

        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());
                double c = a - b;
                //    tResult.setText(String.valueOf(c));
                tResult.setText(c + "");
            }
        });

        btnMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());
                double c = a * b;
                //    tResult.setText(String.valueOf(c));
                tResult.setText(c + "");
            }
        });

        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());
                double c = a / b;
                //    tResult.setText(String.valueOf(c));
                tResult.setText(c + "");
            }
        });

        btnMod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());
                double c = a % b;
                //    tResult.setText(String.valueOf(c));
                tResult.setText(c + "");
            }
        });

    }

    public static void main(String[] args)
    {
        Calculator obj = new Calculator();
    }
}
