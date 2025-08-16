
import javax.swing.*;
import java.awt.*;

public class borderLay extends JFrame {
    public static void main(String[] args) {
        JFrame f=new borderLay();
        f.setLayout(new BorderLayout(10,10));
        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);


        JPanel l1=new JPanel();
        JPanel l2=new JPanel();
        JPanel l3=new JPanel();
        JPanel l4=new JPanel();
        JPanel l5=new JPanel();

        l1.setBackground(Color.red);
        l2.setBackground(Color.green);
        l3.setBackground(Color.blue);
        l4.setBackground(Color.yellow);
        l5.setBackground(Color.pink);

        l1.setPreferredSize(new Dimension(100,100));
        l2.setPreferredSize(new Dimension(100,100));
        l3.setPreferredSize(new Dimension(100,100));
        l4.setPreferredSize(new Dimension(100,100));
        l5.setPreferredSize(new Dimension(100,100));

        f.add(l1,BorderLayout.NORTH);
        f.add(l2,BorderLayout.EAST);
        f.add(l3,BorderLayout.SOUTH);
        f.add(l4,BorderLayout.CENTER);
        f.add(l5,BorderLayout.WEST);





        JPanel l6=new JPanel();
        JPanel l7=new JPanel();
        JPanel l8=new JPanel();
        JPanel l9=new JPanel();
        JPanel l10=new JPanel();


        //setting layout
        l4.setLayout(new BorderLayout(10,10));

        l6.setBackground(Color.darkGray);
        l7.setBackground(Color.cyan);
        l8.setBackground(Color.magenta);
        l9.setBackground(Color.gray);
        l10.setBackground(Color.orange);

        l6.setPreferredSize(new Dimension(50,50));
        l7.setPreferredSize(new Dimension(50,50));
        l8.setPreferredSize(new Dimension(50,50));
        l9.setPreferredSize(new Dimension(50,50));
        l10.setPreferredSize(new Dimension(50,50));

        l4.add(l6,BorderLayout.NORTH);
        l4.add(l7,BorderLayout.EAST);
        l4.add(l8,BorderLayout.SOUTH);
        l4.add(l9,BorderLayout.CENTER);
        l4.add(l10,BorderLayout.WEST);





    }
}
