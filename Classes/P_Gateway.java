package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class P_Gateway extends JFrame implements ActionListener{
JPanel  panel2, panel3;
JButton b1,b2,b3;
JTextField t1;
JLabel label1, label2, label3,label4,label5,label6;
ImageIcon bg1,bg2,bg3;

JPasswordField t2;
JCheckBox showPasswordCheckbox;


public P_Gateway() {
    this.setTitle("Payment Gateway");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(600, 500);
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    

    panel2 = new JPanel();
    panel2.setLayout(null);
    panel2.setBounds(0, 0, 200, 500);
    panel2.setVisible(true);

    bg1 = new ImageIcon("Elements/a.png");
    label1 = new JLabel(bg1);
    label1.setVisible(true);
    label1.setBounds(0, 0, 200, 500);
    label1.setLayout(null);
    panel2.add(label1);



    panel3 = new JPanel();
    panel3.setLayout(null);
    panel3.setBackground(new Color(255, 255, 255));
    panel3.setBounds(230, 220, 580, 300);
    panel3.setVisible(true);

    bg2 = new ImageIcon("Elements/download.png");
    b2 = new JButton(bg2);
    b2.setBounds(250,120,300,100);
    b2.setVisible(true);
    panel3.add(b2);

     bg3 = new ImageIcon("Elements/b.png");
    b3 = new JButton(bg3);
    b3.setBounds(250,250,300,100);
    b3.setVisible(true);
    panel3.add(b3);

   
    

    

    label5 = new JLabel("Hi,there!!");
    label5.setBounds(320,15,300,33);
    label5.setFont(new Font("sheriff",Font.BOLD,39));
    label5.setVisible(true);
    label5.setForeground(new Color(255, 69, 0));
    panel3.add(label5);

    label6 = new JLabel("Please Complete your payment");
    label6.setFont(new Font("Ariel",Font.ITALIC,18));
    label6.setForeground(Color.black);
    label6.setBounds(270,70,350,33);
    label6.setVisible(true);
    panel3.add(label6);


    b1 = new JButton("Exit");
    b1.setBounds(350,400,120,50);
    b1.setFont(new Font("Arial", Font.BOLD, 25));
    b1.setBackground(Color.RED);
    b1.setForeground(Color.WHITE);
    b1.setVisible(true);
    panel3.add(b1);


    this.add(panel2);
    this.add(panel3);
    this.setVisible(true);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);


}
public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==b3)
    {
        DebiC n = new DebiC();
        this.setVisible(false);
        n.setVisible(true);
    }
    else  if(ae.getSource()==b2)
    {
        BkashNagad m = new BkashNagad();
        this.setVisible(false);
        m.setVisible(true);
     
    }
    else  if(ae.getSource()==b1)
    {
        Ticketp x = new Ticketp();
        this.dispose();
        x.setVisible(true);
     
    }

}

}