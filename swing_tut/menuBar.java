package swing_tut;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class menuBar extends JFrame implements ActionListener {
    public static void main(String[] args) {
        menuBar obj=new menuBar();
    }

    JMenuBar jb ;
    JMenu jm1,jm2,jm3;
    JMenuItem jmi1,jmi2,jmi3;
    menuBar(){
        JFrame f=new JFrame();
        f.setSize(500,500);

        f.setDefaultCloseOperation(3);

        jb=new JMenuBar();
        jm1=new JMenu("File");
        jm2=new JMenu("Edit");
        jm3=new JMenu("Help");

        jmi1=new JMenuItem("New");
        jmi2=new JMenuItem("Open");
        jmi3=new JMenuItem("exit");
        jmi1.addActionListener(this);
        jmi2.addActionListener(this);
        jmi3.addActionListener(this);

        //adding keyboard shortcuts


        jm1.setMnemonic(KeyEvent.VK_F);// alt + f
        jm2.setMnemonic(KeyEvent.VK_E);
        jm3.setMnemonic(KeyEvent.VK_H);

        jmi1.setMnemonic(KeyEvent.VK_N); //only n
        jmi2.setMnemonic(KeyEvent.VK_O);
        jmi3.setMnemonic(KeyEvent.VK_X);

        jm1.add(jmi1);
        jm1.add(jmi2);
        jm1.add(jmi3);

        jb.add(jm1);
        jb.add(jm2);
        jb.add(jm3);

        f.setJMenuBar(jb);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==jmi1){
        System.out.println("in new");
    } else if (e.getSource()==jmi2) {
        System.out.println("opening");
    }
    else if (e.getSource()==jmi3) {
        System.exit(0); // to exit

    }
    }
}
