package swing_tut.newWin;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fst implements ActionListener {
    JButton b ;
    JFrame f;
    fst() {
        f=new JFrame();
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setSize(500,500);

        b=new JButton("Click me");
        b.setBounds(250,250, 50,50);
        b.setFocusable(false);
        b.addActionListener(this);

        f.add(b);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== b){
            secnd obj=new secnd();
            f.dispose();
        }
    }

    public static void main(String[] args) {
        fst obj=new fst();
    }
}
