//package swing_tut;

import javax.swing.*;
import java.awt.*;

public class progress extends JFrame {
    public static void main(String[] args) {
        progress obj=new progress();
    }

    JProgressBar jp;
    progress(){
        JFrame f=new JFrame();
        jp=new JProgressBar(0,100);
        jp.setValue(0);
        jp.setBounds(0,0,50,200);
        f.setSize(500,500);
        f.add(jp);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(3);
        jp.setStringPainted(true);
        jp.setString("Loading...");
        jp.setForeground(Color.red);
        for(int i=0;i<=100;i++){
            jp.setValue(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }





    }
}
