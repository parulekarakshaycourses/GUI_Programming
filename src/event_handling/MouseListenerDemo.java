package event_handling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseListenerDemo
{
    public MouseListenerDemo()
    {
        JFrame frame = new JFrame("Mouse Event");
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());

        JLabel lbl = new JLabel("Welcome");
        frame.add(lbl);

//        frame.addMouseListener(new MouseListener() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                lbl.setText("Mouse Clicked : (" + e.getX() + ", " + e.getY() + "), click count = " + e.getClickCount());
//            }
//
//            @Override
//            public void mousePressed(MouseEvent e) {
//                lbl.setText("Mouse Pressed : (" + e.getX() + ", " + e.getY() + ")");
//            }
//
//            @Override
//            public void mouseReleased(MouseEvent e) {
//                lbl.setText("Mouse Released : (" + e.getX() + ", " + e.getY() + ")");
//            }
//
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                lbl.setText("Mouse Entered : (" + e.getX() + ", " + e.getY() + ")");
//            }
//
//            @Override
//            public void mouseExited(MouseEvent e) {
//                lbl.setText("Mouse Exited : (" + e.getX() + ", " + e.getY() + ")");
//            }
//        });

//        frame.addMouseMotionListener(new MouseMotionListener() {
//            @Override
//            public void mouseDragged(MouseEvent e) {
//                lbl.setText("Mouse Dragged : (" + e.getX() + ", " + e.getY() + ")");
//            }
//
//            @Override
//            public void mouseMoved(MouseEvent e) {
//                lbl.setText("Mouse Moved : (" + e.getX() + ", " + e.getY() + ")");
//            }
//        });

        frame.addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                System.out.println("Mouse wheel rotation : " + e.getWheelRotation());
                System.out.println("Mouse precise wheel rotation : " + e.getPreciseWheelRotation());
                System.out.println("Mouse scroll amount : " + e.getScrollAmount());
                System.out.println("Mouse scroll type : " + e.getScrollType());
                System.out.println("Mouse units to scroll : " + e.getUnitsToScroll());
            }
        });
    }

    public static void main(String[] args)
    {
        MouseListenerDemo obj = new MouseListenerDemo();
    }
}
