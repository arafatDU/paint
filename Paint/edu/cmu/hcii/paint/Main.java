package edu.cmu.hcii.paint;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new PaintWindow(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}