package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;

public class Transport extends JFrame implements ActionListener {

    JPanel  panel2;
    JButton b1,b2;
    JTextField t1;
    JPasswordField t2;
    JLabel label1,label2,label3,label4,label5;
    ImageIcon bg1,bg2,bg3;

    public Transport(){
        this.setTitle("Ticket");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 750);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);

        
    panel2 = new JPanel();
    panel2.setLayout(null);
    panel2.setBackground(Color.WHITE);
    panel2.setBounds(0, 0, 600, 750);
    panel2.setVisible(true);

    bg1 = new ImageIcon("Elements/ticket.jpg");
    label1 = new JLabel(bg1);
    label1.setVisible(true);
    label1.setBounds(0, 0, 200, 750);
    label1.setLayout(null);
    panel2.add(label1);
    
    bg2 = new ImageIcon("Elements/capture.png");
    label2 = new JLabel(bg2);
    label2.setLayout(null);
    label2.setBounds(200, 0, 400, 250);
    label2.setVisible(true);
    panel2.add(label2);

    bg3 = new ImageIcon("Elements/GP (1).jpg");
    label3 = new JLabel(bg3);
    label3.setLayout(null);
    label3.setBounds(200, 590, 400, 150);
    label3.setVisible(true);
    panel2.add(label3);


    label4 = new JLabel("Email or Phone");
	label4.setFont(new Font("Playfair Display",Font.BOLD,30));
	label4.setForeground(Color.black);
	label4.setBounds(220,350,250,25);
    label4.setVisible(true);
	panel2.add(label4);

    t1 = new JTextField();
	t1.setBounds(220,390,350,37);
    t1.setForeground(Color.white);
    t1.setBackground(Color.GRAY);
    t1.setFont(new Font("sheriff",Font.BOLD,21));
	panel2.add(t1);

    label5 = new JLabel("Password");
	label5.setFont(new Font("Playfair Display",Font.BOLD,30));
	label5.setForeground(Color.black);
	label5.setBounds(220,450,250,25);
    label5.setVisible(true);
	panel2.add(label5);

    t2 = new JPasswordField();
	t2.setBounds(220,490,350,37);
    t2.setForeground(Color.white);
    t2.setBackground(Color.GRAY);
    t2.setFont(new Font("sheriff",Font.BOLD,21));
	panel2.add(t2);

    b1 = new JButton("LOGIN");
    b1.setBounds(220,550,100,30);
    b1.setFont(new Font("Arial", Font.BOLD, 16));
    b1.setBackground(Color.WHITE);
    b1.setForeground(Color.RED);
    b1.setVisible(true);
    panel2.add(b1);

    b2 = new JButton("SignUp");
    b2.setBounds(480,550,100,30);
    b2.setFont(new Font("Arial", Font.BOLD, 16));
    b2.setBackground(Color.WHITE);
    b2.setForeground(Color.RED);
    b2.setVisible(true);
    panel2.add(b2);
    
   
    b1.addActionListener(this);
    b2.addActionListener(this);
    this.add(panel2);
  

        




    }
     public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            String username = t1.getText();
            String password = t2.getText();
            if (username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                        JOptionPane.WARNING_MESSAGE);
            } else {
                try {
                    File file = new File("Data\\bd_Ticket_signin.txt");
                    file.createNewFile();

                    FileWriter fw = new FileWriter(file, true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter pw = new PrintWriter(bw);

                    pw.println("BD Ticket USER SIGNUP DATA");
                    pw.println("User Email or Phone   : " + username);
                    pw.println("User Password : " + password);
                    pw.println("-----------------BD---------------------------");
                    pw.close();
                } catch (Exception ex) {
                    System.out.print(ex);
                }
                JOptionPane.showMessageDialog(null, "Sign in Successful!");

                Ticketp p12 = new Ticketp();
                this.setVisible(false);
                p12.setVisible(true);
            }
        } else if (ae.getSource() == b2) {
            SignupForm3 n = new SignupForm3();
            this.setVisible(false);
            n.setVisible(true);
        }
    }
}