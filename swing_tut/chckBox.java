package swing_tut;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class chckBox extends JFrame  implements ActionListener {
    public static void main(String[] args) {
        chckBox obj=new chckBox();
    }

    chckBox(){
        JFrame f=new JFrame();
        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);

        JCheckBox c1=new JCheckBox("I am a boy");
        c1.setBounds(20,20,100,30);
        c1.addActionListener(this);
        c1.setText("you are gay ?");
        c1.setFont(new Font("MV Boli",Font.BOLD,20));
        c1.setFocusable(false);
        c1.setForeground(Color.pink);


        f.add(c1);
    }








    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
