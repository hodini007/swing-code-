

import javax.swing.*;
import java.awt.*;

public class flowLay extends JFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setLayout(new FlowLayout());
        f.setSize(500, 500);
        f.setDefaultCloseOperation(3);

        JPanel p=new JPanel();
        p.setBackground(Color.gray);
        p.setPreferredSize(new Dimension(300,300));
        f.add(p);

        f.add(new JButton("1"));
        f.add(new JButton("2"));
        f.add(new JButton("3"));
        f.add(new JButton("4"));
        f.add(new JButton("5"));
        f.add(new JButton("6"));
        f.add(new JButton("7"));
        f.add(new JButton("8"));
        f.add(new JButton("9"));
        f.add(new JButton("10"));







        f.setVisible(true);
    }
}