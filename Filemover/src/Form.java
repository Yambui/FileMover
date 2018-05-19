import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form {
    private JTextField textField1;
    private JTextField textField2;
    private JButton copyButton;
    private JPanel panel;
    private JButton Repl;

    public Form() {


        copyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, FileMover.copyFile(textField1.getText(),textField2.getText()));
            }
        });
        Repl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,FileMover.replFile(textField1.getText(),textField2.getText()));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("File mover");
        frame.setContentPane(new Form().panel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
}
