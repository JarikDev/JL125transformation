package com;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        jFrame.add(new MyComponent());
    }
    static class MyComponent extends JComponent {
        @Override
        public void paint(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            Rectangle2D r2=new Rectangle2D.Double(0,0,100,100);
            g2.scale(2, 2);
            g2.translate(50, 50);
            g2.shear(0.1, 0.1);
            g2.rotate(45);
            g2.draw(r2);
        }
    }
    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 150, 500, 500);
        return jFrame;
    }
}