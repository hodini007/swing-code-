import swing_tut.string;

import javax.swing.*;

public class optionPane {

    public static void main(String[] args) {
     //JOptionPane.showMessageDialog(null,"hello","my box ",JOptionPane.YES_NO_CANCEL_OPTION);
     //int x=JOptionPane.showConfirmDialog(null,"hello","my box ",JOptionPane.YES_NO_OPTION);
        String[] res ={"i a good","not quite good"};
        JOptionPane.showOptionDialog(null,"how are you?", "lol!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, res, null);
    }
}
