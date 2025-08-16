package swing_tut;



import javax.swing.*;
import java.awt.*;

public class lable  {
    public static void main(String[] args) {
        abc a=new abc();

    }
}
class abc extends JFrame{
    public abc(){
        //getContentPane().setLayout(null);

            JLabel l=new JLabel("Hello World");


            //adding icons
            ImageIcon i =new ImageIcon("C:\\Users\\raiyan\\IdeaProjects\\Tutorial_java\\src\\swing_tut\\ninja.png");

            l.setIcon(i);
            add(l);

            l.setHorizontalTextPosition(JLabel.CENTER);
            l.setVerticalTextPosition(JLabel.BOTTOM);
            l.setForeground(new Color(0x7777));
            l.setFont(new Font("MV Boli",Font.BOLD,20)); //setting font
            l.setOpaque(true);
            l.setBackground(new Color(0x000000));
            l.setHorizontalAlignment(JLabel.CENTER);
            l.setVerticalAlignment(JLabel.TOP);
            l.setBorder(BorderFactory.createLineBorder(Color.green));
            l.setBounds(0,0,100,100);



            setSize(800,800);
            setVisible(true);
            setDefaultCloseOperation(3);
            pack();

    }
}