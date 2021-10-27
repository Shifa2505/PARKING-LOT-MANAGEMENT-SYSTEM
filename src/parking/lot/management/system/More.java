package parking.lot.management.system;

import java.awt.Color;

import javax.swing.*;

public class More extends JFrame {
	JButton b1, b2, b3, b4, b5;
	
	More(){
		
		b1 = new JButton("Search Parking Spots");
		b1.setBounds(30,30,200,40);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		add(b1);
		
		b2 = new JButton("Customer Info");
		b2.setBounds(30,80,200,40);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		add(b2);
		
		b3 = new JButton("All Employee Info");
		b3.setBounds(30,130,200,40);
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);
		add(b3);
		
		b4 = new JButton("Search Vehicle");
		b4.setBounds(30,180,200,40);
		b4.setBackground(Color.BLACK);
		b4.setForeground(Color.WHITE);
		add(b4);
		
		b5 = new JButton("Log Out");
		b5.setBounds(30,230,200,40);
		b5.setBackground(Color.BLACK);
		b5.setForeground(Color.WHITE);
		add(b5);
		
		getContentPane().setBackground(Color.WHITE);
		
		setLayout(null);
		setBounds(370, 200, 725, 340);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new More().setVisible(true);

	}

}
