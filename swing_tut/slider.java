//package swing_tut;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class slider extends JFrame  implements ChangeListener {
    public static void main(String[] args) {
        slider obj=new slider();
    }
    JLabel l;
    JSlider s;
    slider(){
     JFrame f=new JFrame();
     f.setSize(500,500);
     f.setLayout(new FlowLayout());
     s=new JSlider(JSlider.VERTICAL,0,100,25);
     s.addChangeListener(this);
     s.setMinorTickSpacing(10);
     s.setMajorTickSpacing(20);
     s.setPaintTicks(true);
     s.setPaintLabels(true);
     s.addChangeListener(this);

    //adding a lable
        l=new JLabel();

     f.add(s);
     f.add(l);




     f.setVisible(true);
     f.setDefaultCloseOperation(3);
    }




    @Override
    public void stateChanged(ChangeEvent e) {
        l.setText("Value is "+s.getValue());
    }
}
