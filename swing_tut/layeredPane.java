import javax.swing.*;
import java.awt.*;

public class layeredPane extends JFrame {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setSize(800,800);


        JLayeredPane lp=new JLayeredPane();


        JLabel l1=new JLabel("1");
        JLabel l2=new JLabel("2");
        JLabel l3=new JLabel("3");
        l1.setBackground(Color.GREEN);
        l2.setBackground(Color.RED);
        l3.setBackground(Color.BLUE);
        l1.setOpaque(true);
        l2.setOpaque(true);
        l3.setOpaque(true);
        l1.setBounds(0,0,100,100);
        l2.setBounds(10,0,100,100);
        l3.setBounds(0,10,100,100);

        lp.add(l1,Integer.valueOf(1));
        lp.add(l2,Integer.valueOf(2));
        lp.add(l3,Integer.valueOf(3));

        f.add(lp);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
    }

}
