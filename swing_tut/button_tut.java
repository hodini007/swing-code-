import javax.swing.*;

public class button_tut {
    public static void main(String[] args) {
        xyz a=new xyz();
    }
}

class xyz extends JFrame {
    public xyz(){
        ImageIcon i =new ImageIcon("C:\\Users\\raiyan\\IdeaProjects\\Tutorial_java\\src\\swing_tut\\ICON.png");
        JButton b=new JButton();
        b.addActionListener(e -> {
                    System.out.println("Hello World");
            b.setEnabled(false);
                }
        );
        b.setIcon(i);
        b.setBounds(0,0,100,100);
        //b.setFocusable(false);
        add(b);



        setLayout(null);
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(3);
    }
}