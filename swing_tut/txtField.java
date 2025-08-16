//package swing_tut;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class txtField extends JFrame implements ActionListener {
    JTextField tf;
    JButton b;
    txtField() {
        JFrame f=new JFrame();
        f.setSize(300,300);

        f.setDefaultCloseOperation(3);
        f.setLayout(new FlowLayout());

        tf=new JTextField(10);
        b=new JButton("Submit");

        tf.setForeground(Color.red);
        tf.setBackground(Color.darkGray);
        tf.setFont(new Font("MV Boli",Font.BOLD,20));
        tf.setCaretColor(Color.green);




        f.add(tf);
        f.add(b);

        b.addActionListener(this);
        f.setVisible(true);
    }

    public static void main(String[] args){
        txtField obj=new txtField();
    }




    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("hello "+tf.getText());
        b.setEnabled(false);


    }
}
