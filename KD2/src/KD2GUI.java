import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KD2GUI {
    private JPanel rootPanel;
    private JTextPane textPane1;
    private JButton button1;

    public KD2GUI() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("sasf");
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("KD2GUI");
        frame.setContentPane(new KD2GUI().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
