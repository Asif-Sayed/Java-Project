package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class First extends JFrame implements ActionListener{
JPanel  panel2, panel3;
JButton b1,b2,b3,b4;
JTextField t1;
JLabel label1, label2, label3,label4,label5,label6;
ImageIcon bg1,bg2,bg3;

JPasswordField t2;
JCheckBox showPasswordCheckbox;


public First() {
    this.setTitle("First");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(600, 500);
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    

    panel2 = new JPanel();
    panel2.setLayout(null);
    panel2.setBounds(0, 0, 400, 500);
    panel2.setVisible(true);

    bg1 = new ImageIcon("Elements/pppp (1).jpg");
    label1 = new JLabel(bg1);
    label1.setVisible(true);
    label1.setBounds(0, 0, 400, 500);
    label1.setLayout(null);
    panel2.add(label1);



    panel3 = new JPanel();
    panel3.setLayout(null);
    panel3.setBackground(new Color(68,51,85));
    panel3.setBounds(410, 0, 190, 500);
    panel3.setVisible(true);




    b1 = new JButton("Exit");
    b1.setBounds(415,400,150,50);
    b1.setFont(new Font("Arial", Font.BOLD, 25));
    b1.setBackground(Color.RED);
    b1.setForeground(Color.WHITE);
    b1.setVisible(true);
    panel3.add(b1);

     b4 = new JButton("Log In");
    b4.setBounds(415,30,150,50);
    b4.setFont(new Font("Arial", Font.BOLD, 25));
    b4.setBackground(Color.green);
    b4.setForeground(Color.WHITE);
    b4.setVisible(true);
    panel3.add(b4);

    b2 = new JButton("Contribution");
    b2.setBounds(415,100,150,50);
    b2.setFont(new Font("Arial", Font.BOLD, 15));
    b2.setBackground(Color.blue);
    b2.setForeground(Color.WHITE);
    b2.setVisible(true);
    panel3.add(b2);


    this.add(panel2);
    this.add(panel3);
    this.setVisible(true);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b4.addActionListener(this);


}
public void actionPerformed(ActionEvent ae){
   
    
if(ae.getSource()==b2)
    {
       Contribution m = new Contribution();
        this.setVisible(false);
        m.setVisible(true);
     
    }
    else  if(ae.getSource()==b1)
    {
        
     System.exit(0);
    }
    else  if(ae.getSource()==b4)
    {
        Selection m = new Selection();
        this.setVisible(false);
        m.setVisible(true);
     
    }

}

}