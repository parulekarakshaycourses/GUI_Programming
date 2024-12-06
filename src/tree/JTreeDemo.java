package tree;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class JTreeDemo
{
    public JTreeDemo()
    {
        JFrame frame = new JFrame("Tree Demo");
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());

        DefaultMutableTreeNode india = new DefaultMutableTreeNode("India");
        DefaultMutableTreeNode maharashtra = new DefaultMutableTreeNode("Maharashtra");
        DefaultMutableTreeNode goa = new DefaultMutableTreeNode("Goa");
        DefaultMutableTreeNode sindhudurg = new DefaultMutableTreeNode("Sindhudurg");
        DefaultMutableTreeNode ratnagiri = new DefaultMutableTreeNode("Ratnagiri");
        DefaultMutableTreeNode southgoa = new DefaultMutableTreeNode("Soouth Goa");
        DefaultMutableTreeNode northgoa = new DefaultMutableTreeNode("North Goa");
        DefaultMutableTreeNode oros = new DefaultMutableTreeNode("Oras");
        DefaultMutableTreeNode kudal = new DefaultMutableTreeNode("Kudal");
        DefaultMutableTreeNode vengurla = new DefaultMutableTreeNode("Vengurla");
        DefaultMutableTreeNode kankavli = new DefaultMutableTreeNode("Kankavli");
        DefaultMutableTreeNode devgad = new DefaultMutableTreeNode("Devgad");
        DefaultMutableTreeNode malvan = new DefaultMutableTreeNode("Malvan");
        DefaultMutableTreeNode vaibhavwadi = new DefaultMutableTreeNode("Vaibhavwadi");
        DefaultMutableTreeNode sawantwadi = new DefaultMutableTreeNode("Sawantwadi");
        DefaultMutableTreeNode dodamarg = new DefaultMutableTreeNode("Dodamarg");

        sindhudurg.add(dodamarg); sindhudurg.add(sawantwadi); sindhudurg.add(vaibhavwadi);
        sindhudurg.add(malvan); sindhudurg.add(devgad); sindhudurg.add(kankavli);
        sindhudurg.add(vengurla); sindhudurg.add(kudal); sindhudurg.add(oros);

        maharashtra.add(sindhudurg); maharashtra.add(ratnagiri);
        goa.add(southgoa); goa.add(northgoa);

        india.add(maharashtra); india.add(goa);

        JTree tree = new JTree(india);
        frame.add(tree);
    }

    public static void main(String[] args)
    {
        JTreeDemo obj = new JTreeDemo();
    }
}
