package org.example;

import javax.swing.*; 
import java.awt.event.*; 
public class Frame { 
  
    public static void converter() 
    { 
  
        JFrame f = new JFrame("CONVERTER"); 
        JLabel l1, l2; 
        JTextField t1, t2; 
        JButton b1, b2;
  
        l1 = new JLabel("Rubles:"); 
        l1.setBounds(20, 40, 60, 30); 
        l2 = new JLabel("Dollars:"); 
        l2.setBounds(250, 40, 60, 30);
        
        t1 = new JTextField("0"); 
        t1.setBounds(80, 40, 150, 30); 
        t2 = new JTextField("0"); 
        t2.setBounds(305, 40, 150, 30); 

        b1 = new JButton("RUB"); 
        b1.setBounds(50, 80, 60, 15); 
        b2 = new JButton("USD"); 
        b2.setBounds(280, 80, 60, 15); 
  
        
        b1.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) 
            { 
                double d = Double.parseDouble(t1.getText()); 
  
                double d1 = d / 96.11;
                double roundedD1 = Math.round(d1 * 100.0) / 100.0; 

                String str1 = String.valueOf(roundedD1); 

                t2.setText(str1); 
            } 
        }); 

        b2.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) 
            { 

                double d2 = Double.parseDouble(t2.getText()); 
  
                
                double d3 = (d2 * 96.11); 
                double roundedD3 = Math.round(d3 * 100.0) / 100.0; 

                String str2 = String.valueOf(roundedD3); 
                
                t1.setText(str2); 
            } 
        });  

        f.addWindowListener(new WindowAdapter() { 
            public void windowClosing(WindowEvent e) 
            { 
                System.exit(0); 
            } 
        }); 

        f.add(l1); 
        f.add(t1); 
        f.add(l2); 
        f.add(t2); 
        f.add(b1); 
        f.add(b2); 

        f.setLayout(null); 
        f.setSize(700, 500); 
        f.setVisible(true); 
    } 
}