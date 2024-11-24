package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BkashNagad extends JFrame implements ActionListener {

    JPanel panel2;
    JButton b1, b2, b3;
    JTextField t1, t2;
    JLabel label1, label2, label3, label4, label5;
    ImageIcon bg1, bg2;

    public BkashNagad() {

        this.setTitle("Payment");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(0, 0, 500, 800);
        panel2.setBackground(Color.ORANGE);

        bg2 = new ImageIcon("Elements/Bkash.png");
        b2 = new JButton(bg2);
        b2.setBounds(50, 80, 300, 100);
        b2.setVisible(true);
        panel2.add(b2);

        bg1 = new ImageIcon("Elements/nagad.png");
        b3 = new JButton(bg1);
        b3.setBounds(50, 200, 300, 100);
        b3.setVisible(true);
        panel2.add(b3);

        this.add(panel2);
 
        b2.addActionListener(this);
        b3.addActionListener(this);

        
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b2) {
            BkashPay x = new BkashPay();
            this.setVisible(false);
            x.setVisible(true);

           
        } else if (ae.getSource() == b3) {
             NagadPay l = new NagadPay();
            this.setVisible(false);
            l.setVisible(true);
        } 
    }
}
