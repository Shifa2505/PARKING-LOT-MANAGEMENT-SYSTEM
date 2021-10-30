package parking.lot.management.system;

import java.awt.Color;
import java.awt.Image;

import javax.swing.*;
import java.awt.event.*;

public class More extends JFrame implements ActionListener {
	JButton b1, b2, b3, b4, b5;
	
	More(){
		
		b1 = new JButton("Search Parking Spots");
		b1.setBounds(30,30,200,40);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.addActionListener(this);
		add(b1);
		
		b2 = new JButton("Customer Info");
		b2.setBounds(30,80,200,40);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.addActionListener(this);
		add(b2);
		
		b3 = new JButton("All Employee Info");
		b3.setBounds(30,130,200,40);
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);
		b3.addActionListener(this);
		add(b3);
		
		b4 = new JButton("Search Vehicle");
		b4.setBounds(30,180,200,40);
		b4.setBackground(Color.BLACK);
		b4.setForeground(Color.WHITE);
		b4.addActionListener(this);
		add(b4);
		
		b5 = new JButton("Log Out");
		b5.setBounds(30,230,200,40);
		b5.setBackground(Color.BLACK);
		b5.setForeground(Color.WHITE);
		b5.addActionListener(this);
		add(b5);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("parking/lot/management/system/icons/sixth.jpg"));
		Image i2 = i1.getImage().getScaledInstance(450, 350, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l1 = new JLabel(i3);
		l1.setBounds(250, 10, 450, 350);
		add(l1);
		
		getContentPane().setBackground(Color.WHITE);
		
		setLayout(null);
		setBounds(400, 200, 725, 340);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()== b1) {
		
		}else if(ae.getSource() == b2) {
			
		}else if(ae.getSource() == b3) {
			new EmployeeInfo().setVisible(true);
			this.setVisible(false);
		}else if(ae.getSource() == b4) {
			
		}else if(ae.getSource() == b5) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new More().setVisible(true);

	}

}
