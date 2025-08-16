package swing_tut;

import javax.swing.*;
import java.awt.*;

public class frame {
    public static void main(String[] args) {
        JFrame f= new JFrame();
        f.setTitle("My First GUI");
        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setResizable(false);

        ImageIcon icon= new ImageIcon("ICON.png");
        f.setIconImage(icon.getImage());

        f.getContentPane().setBackground(new Color(23,54,7));



    }

}
