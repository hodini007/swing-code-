import javax.swing.*;
import java.awt.*;

public class j_panel {
    public static void main(String[] args) {
        abc a=new abc();
    }
}
class abc extends JFrame {
    public abc(){

        // a gui component to hold other component
        ImageIcon i =new ImageIcon("C:\\Users\\raiyan\\IdeaProjects\\Tutorial_java\\src\\swing_tut\\naruto-icon-14686.png");

        JLabel l=new JLabel("Hello World");
        l.setIcon(i);


        JPanel p1 =new JPanel();
        p1.setBackground(Color.GREEN);
        p1.setBounds(0,0,100,100);
        add(p1);

        JPanel p2 =new JPanel();
        p2.setBackground(Color.RED);
        p2.setBounds(100,0,100,100);
        add(p2);

        JPanel p3 =new JPanel();
        p3.setBackground(Color.BLUE);
        p3.setBounds(0,100,200,200);
        add(p3);
        p3.setLayout(new FlowLayout());


        add(l);






        setLayout(null);
        setSize(750,550);
        setVisible(true);
        setDefaultCloseOperation(3);
    }

}
