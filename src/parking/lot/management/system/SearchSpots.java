package parking.lot.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;

public class SearchSpots extends JFrame implements ActionListener {
	JTable t1;
	JButton b1, b2;
	JCheckBox c1;
	
	SearchSpots(){
		t1 = new JTable();
		
		
		
		b1=new JButton("Load Data");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setBounds(330,360,120,30);
//		b1.addActionListener(this);
		add(b1);
		
		b2=new JButton("Back");
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.setBounds(530,360,120,30);
		b2.addActionListener(this);
		add(b2);
//	    getContentPane().setBackground(Color.WHITE);
		
		setLayout(null);
		setBounds(300,200,1020,450);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()== b1) {
//			try {
//				conn c=new conn();
//				String str="select * from employee";
//				ResultSet rs = c.s.executeQuery(str);
//				
//				t1.setModel(DbUtils.resultSetToTableModel(rs));
//				 
//			}catch(Exception e) {}
			
		}else if(ae.getSource()== b2) {
			new More().setVisible(true);
			this.setVisible(false);
		}
	}
	public static void main(String[] args) {
		new SearchSpots().setVisible(true);
			

	}

}
