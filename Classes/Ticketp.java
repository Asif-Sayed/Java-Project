package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class Ticketp extends JFrame implements ActionListener{
    Map<String, Double> cityPrices;
    JLabel priceLabel;
    JButton purchaseButton,b1,b2;
    JComboBox<String> cityComboBox1, cityComboBox2, seatComboBox;
    JPanel panel2;

    public Ticketp() {
        cityPrices = new HashMap<>();
        cityPrices.put("Select", 0.0);
        cityPrices.put("Bogura", 100.0);
        cityPrices.put("Dhaka", 100.0);
        cityPrices.put("Barishal", 150.0);
        cityPrices.put("Chattogram", 200.0);
        cityPrices.put("Khulna", 120.0);
        cityPrices.put("Rajshahi", 180.0);
        cityPrices.put("Rangpur", 250.0);
        cityPrices.put("Mymensingh", 170.0);
        cityPrices.put("Sylhet", 300.0);

        this.setTitle("Ticket");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 500);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(0, 0, 600, 500);
        panel2.setVisible(true);

        b1 = new JButton("Exit");
    b1.setBounds(415,400,150,50);
    b1.setFont(new Font("Arial", Font.BOLD, 25));
    b1.setBackground(Color.RED);
    b1.setForeground(Color.WHITE);
    b1.setVisible(true);
    panel2.add(b1);
    b1.addActionListener(this);

     b2 = new JButton("Payment");
    b2.setBounds(415,330,150,50);
    b2.setFont(new Font("Arial", Font.BOLD, 25));
    b2.setBackground(Color.green);
    b2.setForeground(Color.WHITE);
    b2.setVisible(true);
    panel2.add(b2);
    b2.addActionListener(this);

        ImageIcon bg1 = new ImageIcon("Elements/101.jpg");
        JLabel label1 = new JLabel(bg1);
        label1.setVisible(true);
        label1.setBounds(0, 0, 400, 500);
        label1.setLayout(null);
        panel2.add(label1);

        JComboBox<String> cityComboBox1 = new JComboBox<>(cityPrices.keySet().toArray(new String[0]));
        JComboBox<String> cityComboBox2 = new JComboBox<>(cityPrices.keySet().toArray(new String[0]));
        JComboBox<String> seatComboBox = new JComboBox<>(new String[]{"0","1", "2", "3", "4", "5"});
        priceLabel = new JLabel("Price: Tk 0.0");
        purchaseButton = new JButton("Purchase");
      
cityComboBox1.addItem("Select");
cityComboBox2.addItem("Select");


cityComboBox1.setSelectedItem("Select");
cityComboBox2.setSelectedItem("Select");
seatComboBox.setSelectedItem("0");

        cityComboBox1.setBounds(410, 50, 150, 30);
        cityComboBox2.setBounds(410, 100, 150, 30);
        seatComboBox.setBounds(410, 150, 150, 30);
        purchaseButton.setBounds(410, 200, 150, 30);
        priceLabel.setBounds(410, 250, 250, 30);

        panel2.add(new JLabel("Select City 1:"));
        panel2.add(cityComboBox1);
        panel2.add(new JLabel("Select City 2:"));
        panel2.add(cityComboBox2);
        panel2.add(new JLabel("Select Number of Seats:"));
        panel2.add(seatComboBox);
        panel2.add(purchaseButton);
        panel2.add(priceLabel);
        this.add(panel2);

        purchaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedCity1 = (String) cityComboBox1.getSelectedItem();
                String selectedCity2 = (String) cityComboBox2.getSelectedItem();
                int numSeats = Integer.parseInt((String) seatComboBox.getSelectedItem());
                double price1 = cityPrices.get(selectedCity1);
                double price2 = cityPrices.get(selectedCity2);
                double totalPrice = (price1 + price2) * numSeats;
                priceLabel.setText("Total Price: Tk" + totalPrice);
            }
        });

        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
   
    
        if(ae.getSource()==b2)
            {
                
             P_Gateway p = new P_Gateway();
             this.setVisible(false);
             p.setVisible(true);
            }
            else  if(ae.getSource()==b1)
            {
                System.exit(0);
             
            }
        
        }

    
}
