package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;
public class SignupForm3 extends JFrame implements ActionListener {
    JPanel panel2;

    JButton b1,b2,b3;
    
    JTextField t1, t2,t3;
    JLabel label1, label2,label3,label4,label5,label6;
    ImageIcon bg1,bg2,bg3,bg4,bg5,bg6,bg7;

    public SignupForm3(){
        this.setTitle("Register from");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(750, 500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);

        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(0, 0, 750, 500);
        panel2.setBackground(   Color.white);
        panel2.setVisible(true);
        
        bg2 = new ImageIcon("Elements/BusLogin.jpg");
        label2 = new JLabel(bg2);
        label2.setVisible(true);
        label2.setBounds(400, 0, 350, 500);
        label2.setLayout(null);

        bg2 = new ImageIcon("Elements/capture.png");
        label3 = new JLabel(bg2);
        label3.setVisible(true);
        label3.setBackground(Color.red);
        label3.setBounds(120, 0, 150, 150);
        label3.setLayout(null);


        label5 = new JLabel("Username");
        label5.setFont(new Font("Playfair Display",Font.ITALIC,20));
        label5.setForeground(Color.ORANGE);
        label5.setBounds(5,160,120,25);
        label5.setVisible(true);
        panel2.add(label5);
    
        t1 = new JTextField();
        t1.setBounds(140,160,250,37);
        t1.setForeground(Color.DARK_GRAY);
        t1.setFont(new Font("sheriff",Font.ITALIC,21));
        panel2.add(t1);
    
        label4 = new JLabel("Password");
        label4.setFont(new Font("Playfair Display",Font.ITALIC,20));
        label4.setForeground(Color.ORANGE);
        label4.setBounds(5,230,120,25);
        label4.setVisible(true);
        panel2.add(label4);
        
        t2 = new JTextField();
        t2.setBounds(140,230,250,37);
        t2.setForeground(Color.DARK_GRAY);
        t2.setFont(new Font("sheriff",Font.ITALIC,21));
        panel2.add(t2);


        label5 = new JLabel("Email");
        label5.setFont(new Font("Playfair Display",Font.ITALIC,20));
        label5.setForeground(Color.ORANGE);
        label5.setBounds(05,290,150,25);
        label5.setVisible(true);
        panel2.add(label5);
        
        t3 = new JTextField();
        t3.setBounds(140,290,250,37);
        t3.setForeground(Color.DARK_GRAY);
        t3.setFont(new Font("sheriff",Font.ITALIC,21));
        panel2.add(t3);
        
        b1 = new JButton("Confirm");
        b1.setBounds(16,400,120,50);
        b1.setFont(new Font("Arial", Font.BOLD, 16));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.blue);
        b1.setVisible(true);
        panel2.add(b1);
    
        b2 = new JButton("RESET?");
        b2.setBounds(300,350,95,15);
        b2.setFont(new Font("Arial", Font.BOLD, 12));
        
        b2.setOpaque(false);
        b2.setContentAreaFilled(false);
        b2.setForeground(Color.red);
        b2.setVisible(true);
        panel2.add(b2);


        b3 = new JButton("Back");
        b3.setBounds(260,400,120,50);
        b3.setFont(new Font("Arial", Font.BOLD, 16));
        b3.setBackground(Color.red);
        b3.setForeground(Color.white);
        b3.setVisible(true);
        panel2.add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    
        



        panel2.add(label2);
        panel2.add(label3);
        this.add(panel2);

    }
    public void actionPerformed(ActionEvent ae)
		{
            if(ae.getSource()==b1)
			{
                if(ae.getSource()==b1)
                {
                    if(ae.getSource() == b1)
                    {
                        String username = t1.getText();
                        String password = t2.getText();
                        String EMAIL = t3.getText();
                        if(username.isEmpty()||password.isEmpty())
                        {
                             JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",JOptionPane.WARNING_MESSAGE);
                        }
                        
                        else
                        {
                            try 
                            {
                                File file = new File("Data\\bd_Ticket_signup.txt");
                                if (!file.exists()) 
                                {
                                    file.createNewFile();
                                }
                                FileWriter fw = new FileWriter(file, true);
                                BufferedWriter bw = new BufferedWriter(fw);
                                PrintWriter pw = new PrintWriter(bw);
            
            
            
                                pw.println("Bd Ticket USER SIGNUP DATA");
                                pw.println("Username              : " + username);
                                pw.println("User Password         : " + password);
                                pw.println("User EMAIL            : " +  EMAIL);
                                pw.println("--------------------------------------------");
                                pw.close();
                            }
                            catch (Exception ex) 
                            {
                                System.out.print(ex);
                            }
                            JOptionPane.showMessageDialog(null,"Sign up Successful!");
                            
                             Transport p12=new Transport();
                            this.setVisible(false);
                            p12.setVisible(true);
                            
                        }
                }
			}
        }
			else if(ae.getSource()==b2)
			{
				t1.setText("");
                t2.setText("");
                t3.setText("");
			}
            else if(ae.getSource()==b3){
                Transport y = new Transport();
                y.setVisible(true);
                this.setVisible(false);

            }

}

}







    