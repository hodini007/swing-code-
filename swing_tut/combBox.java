package swing_tut;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class combBox extends JFrame implements ActionListener  {

    public static void main(String[] args) {
        combBox obj=new combBox();
    }
    combBox(){
     JFrame f=new JFrame();
     f.setSize(500,500);
     f.setVisible(true);
     f.setLayout(new FlowLayout());

     String[] items={"one","two","three","four","five"};
     JComboBox cb=new JComboBox(items);
     f.add(cb);
     cb.addActionListener(this);

    }










    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
    }
}
