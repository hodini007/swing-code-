package swing_tut.newWin;

import javax.swing.*;

public class secnd {
    JFrame f2;
    JLabel l2;
    public secnd(){
        f2=new JFrame();
        f2.setVisible(true);
        f2.setDefaultCloseOperation(3);
        f2.setSize(500,500);
        l2=new JLabel("Hello World");
        f2.add(l2);

    }



}
