package parking.lot.management.system;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.*;
import net.proteanit.sql.*;

public class EmployeeInfo extends JFrame implements ActionListener {
	
	JTable t1;
	JButton b1, b2;
	
	EmployeeInfo(){
		t1 = new JTable();
		t1.setBounds(0,40,1010,300);
		add(t1);
		
		JLabel l1=new JLabel("Name");
		l1.setBounds(40,10,70,20);
		add(l1);
		
		JLabel l2= new JLabel("Age");
		l2.setBounds(200,10,70,20);
		add(l2);
		
		JLabel l3=new JLabel("Gender");
		l3.setBounds(335,10,70,20);
		add(l3);
		
		JLabel l4=new JLabel("Job");
		l4.setBounds(485,10,70,20);
		add(l4);
		
		JLabel l5=new JLabel("Phone");
		l5.setBounds(630,10,70,20);
		add(l5);
		
		JLabel l6=new JLabel("Aadhar No");
		l6.setBounds(760,10,70,20);
		add(l6);
		
		JLabel l7=new JLabel("Email Id");
		l7.setBounds(900,10,70,20);
		add(l7);
		
		b1=new JButton("Load Data");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setBounds(330,360,120,30);
		b1.addActionListener(this);
		add(b1);
		
		b2=new JButton("Back");
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.setBounds(530,360,120,30);
		b2.addActionListener(this);
		add(b2);
		
		getContentPane().setBackground(Color.WHITE);
		
		setLayout(null);
		setBounds(300,200,1020,450);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()== b1) {
			try {
				conn c=new conn();
				String str="select * from employee";
				ResultSet rs = c.s.executeQuery(str);
				
				t1.setModel(DbUtils.resultSetToTableModel(rs));
				 
			}catch(Exception e) {}
			
		}else if(ae.getSource()== b2) {
			new More().setVisible(true);
			this.setVisible(false);
		}
	}
	
	public static void main(String[] args) {
		new EmployeeInfo().setVisible(true);

	}

}
