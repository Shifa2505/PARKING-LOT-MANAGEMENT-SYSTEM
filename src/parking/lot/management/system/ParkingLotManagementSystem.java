package parking.lot.management.system;


//
//import java.awt.Color;
//import java.awt.Font;

import javax.swing.*;
import java.awt.*;  // awt == abstract window toolkit
import java.awt.event.*;

public class ParkingLotManagementSystem extends JFrame implements ActionListener {
	
	ParkingLotManagementSystem(){
		setBounds(700,200,600,390);
//		setSize(600,390);

//		setLocation(300,300);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("parking/lot/management/system/icons/first.jpg"));
		JLabel l1 = new JLabel(i1);
		l1.setBounds(0,0,600,390);
		add(l1);
		
		JLabel l2 = new JLabel("Car Parking Management System");
		l2.setBounds(15,0,2000,70);
		l2.setFont(new Font("serif", Font.ITALIC, 40));
		l1.add(l2);
		
		JButton b1 = new JButton("Next");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setBounds(400,280,150,50);
		b1.addActionListener(this);
		l1.add(b1);
		
		setLayout(null);
		setVisible(true);
		
		while(true) {
			l2.setVisible(false);
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
			l2.setVisible(true);
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
	}

	public void actionPerformed(ActionEvent ae) {
		new login().setVisible(true);
		this.setVisible(false);
	}
	
	public static void main(String[] args) {
		new ParkingLotManagementSystem();

 
	}

}
