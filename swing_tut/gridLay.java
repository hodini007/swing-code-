import javax.swing.*;
import java.awt.*;

public class gridLay extends JFrame {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setLayout(new GridLayout(3,3));
        f.setSize(500,500);

        f.add(new JButton("1"));
        f.add(new JButton("2"));
        f.add(new JButton("3"));
        f.add(new JButton("4"));
        f.add(new JButton("5"));
        f.add(new JButton("6"));
        f.add(new JButton("7"));
        f.add(new JButton("8"));
        f.add(new JButton("9"));





        f.setVisible(true);
        f.setDefaultCloseOperation(3);
    }
}
