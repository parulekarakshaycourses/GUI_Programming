package table;

import javax.swing.*;
import java.awt.*;

public class TableDemo
{
    public TableDemo()
    {
        JFrame frame = new JFrame("Table Demo");
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());

        Object[] columns = {"id", "name", "salary"};
        Object[][] rows = {
                {1, "Yashasvi", 99999},
                {2, "Ketaki", 88888},
                {3, "Riya", 77777},
                {1, "Yashasvi", 99999},
                {2, "Ketaki", 88888},
                {3, "Riya", 77777},
                {1, "Yashasvi", 99999},
                {2, "Ketaki", 88888},
                {3, "Riya", 77777},
                {1, "Yashasvi", 99999},
                {2, "Ketaki", 88888},
                {3, "Riya", 77777},
                {1, "Yashasvi", 99999},
                {2, "Ketaki", 88888},
                {1, "Yashasvi", 99999},
                {2, "Ketaki", 88888},
                {3, "Riya", 77777},
                {1, "Yashasvi", 99999},
                {2, "Ketaki", 88888},
                {3, "Riya", 77777},
                {1, "Yashasvi", 99999},
                {2, "Ketaki", 88888},
                {3, "Riya", 77777},
                {1, "Yashasvi", 99999},
                {2, "Ketaki", 88888},
                {3, "Riya", 77777},
                {1, "Yashasvi", 99999},
                {2, "Ketaki", 88888},
                {1, "Yashasvi", 99999},
                {2, "Ketaki", 88888},
                {3, "Riya", 77777},
                {1, "Yashasvi", 99999},
                {2, "Ketaki", 88888},
                {3, "Riya", 77777},
                {1, "Yashasvi", 99999},
                {2, "Ketaki", 88888},
                {3, "Riya", 77777},
                {1, "Yashasvi", 99999},
                {2, "Ketaki", 88888},
                {3, "Riya", 77777},
                {1, "Yashasvi", 99999},
                {2, "Ketaki", 88888},
                {1, "Yashasvi", 99999},
                {2, "Ketaki", 88888},
                {3, "Riya", 77777},
                {1, "Yashasvi", 99999},
                {2, "Ketaki", 88888},
                {3, "Riya", 77777},
                {1, "Yashasvi", 99999},
                {2, "Ketaki", 88888},
                {3, "Riya", 77777},
                {1, "Yashasvi", 99999},
                {2, "Ketaki", 88888},
                {3, "Riya", 77777},
                {1, "Yashasvi", 99999},
                {2, "Ketaki", 88888},
                {3, "Riya", 77777}
        };

        JTable tbl = new JTable(rows, columns);
        JScrollPane jsp = new JScrollPane(tbl);
        jsp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        frame.add(jsp);
    }

    public static void main(String[] args)
    {
        TableDemo obj = new TableDemo();
    }
}
