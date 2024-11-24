package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminPanel extends JFrame implements ActionListener {
JPanel  panel2, panel3;
JButton b1,b2,b4;
JTextField t1;
JLabel label1, label2, label3,label4,label5,label6;
ImageIcon bg1,bg2,bg3;

JPasswordField t2;
JCheckBox showPasswordCheckbox;


public AdminPanel() {
    this.setTitle("A2Z Productivity");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(800, 800);
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    

    panel2 = new JPanel();
    panel2.setLayout(null);
    panel2.setBounds(0, 0, 800, 800);
   panel2.setBackground(new Color(46, 46, 46));
    panel2.setVisible(true);

    bg1 = new ImageIcon("Elements/Sesh.jpg");
    label1 = new JLabel(bg1);
    label1.setVisible(true);
    label1.setBounds(0, 0, 300, 800);
    label1.setLayout(null);
    panel2.add(label1);



    

    bg2 = new ImageIcon("Elements/logop2.jpg");
    label2 = new JLabel(bg2);
    label2.setVisible(true);
    label2.setBounds(450, 15, 200, 200);
    label2.setLayout(null);
    panel2.add(label2);



    bg3 = new ImageIcon("Elements/seshn.jpg");
    b2 = new JButton(bg3);
    b2.setBounds(340,310,410,300);
    
    b2.setVisible(true);
    panel2.add(b2);

    b4 = new JButton("EXIT");
    b4.setBounds(650,690,120,50);
    b4.setFont(new Font("Arial", Font.BOLD, 16));
    b4.setBackground(Color.red);
    b4.setForeground(Color.WHITE);
    b4.setVisible(true);
    panel2.add(b4);
    
    this.add(panel2);
    
    this.setVisible(true);
    b2.addActionListener(this);
    b4.addActionListener(this);


}
public void actionPerformed(ActionEvent ae)
		{
            if(ae.getSource()==b4)
			{
			Selection s = new Selection();
            this.setVisible(false);
            s.setVisible(true);
            

			}
            
		

}
			

}
