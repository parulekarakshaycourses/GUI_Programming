package menu;

import javax.swing.*;

public class MenuDemo
{
    public MenuDemo()
    {
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(300, 300);
        frame.setVisible(true);

        JMenuItem miNew = new JMenuItem("New");
        JMenuItem miOpen = new JMenuItem("Open");
        JMenuItem miSave = new JMenuItem("Save");
        JMenuItem miSaveAs = new JMenuItem("Save As");

        JMenuItem miUndo = new JMenuItem("Undo");
        JMenuItem miRedo = new JMenuItem("Redo");
        JMenuItem miCut = new JMenuItem("Cut");
        JMenuItem miCopy = new JMenuItem("Copy");
        JMenuItem miPaste = new JMenuItem("Paste");
        JMenuItem miFind = new JMenuItem("Find");
        JMenuItem miReplace = new JMenuItem("Replace");

        JMenuItem miZoomIn = new JMenuItem("Zoom In");
        JMenuItem miZoomOut = new JMenuItem("Zoom Out");
        JMenuItem miStatusBar = new JMenuItem("Status Bar");

        JMenu mFile = new JMenu("File");
        mFile.add(miNew);
        mFile.add(miOpen);
        mFile.addSeparator();
        mFile.add(miSave);
        mFile.add(miSaveAs);

        JMenu mEdit = new JMenu("Edit");
        mEdit.add(miUndo);
        mEdit.add(miRedo);
        mEdit.addSeparator();
        mEdit.add(miCut);
        mEdit.add(miCopy);
        mEdit.add(miPaste);
        mEdit.addSeparator();
        mEdit.add(miFind);
        mEdit.add(miReplace);

        JMenu mZoom = new JMenu("Zoom");
        mZoom.add(miZoomIn);
        mZoom.add(miZoomOut);

        JMenu mView = new JMenu("View");
        mView.add(mZoom);
        mView.add(miStatusBar);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(mFile);
        menuBar.add(mEdit);
        menuBar.add(mView);

        miUndo.setEnabled(false);
        miRedo.setEnabled(false);

        frame.setJMenuBar(menuBar);
    }

    public static void main(String[] args)
    {
        MenuDemo obj = new MenuDemo();
    }
}
