package parking.lot.management.system;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.*;
import net.proteanit.sql.*;

public class CustomerInfo extends JFrame implements ActionListener  {
	JTable t1;
	JButton b1, b2;
	
	CustomerInfo(){
		t1 = new JTable();
		t1.setBounds(0,100,900,300);
		add(t1);
		
		JLabel l1=new JLabel("Liscence Plate Number");
		l1.setBounds(20,70,140,20);
		add(l1);
		
		JLabel l2= new JLabel("First Name");
		l2.setBounds(230,70,70,20);
		add(l2);
		
		JLabel l3=new JLabel("Last Name");
		l3.setBounds(420,70,70,20);
		add(l3);
		
		JLabel l4=new JLabel("Gender");
		l4.setBounds(600,70,70,20);
		add(l4);
		
		JLabel l5=new JLabel("Phone Number");
		l5.setBounds(750,70,140,20);
		add(l5);
		
		JLabel l6 = new JLabel("CUSTOMER INFORMATION");
		l6.setForeground(Color.BLUE);
		l6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		l6.setBounds(270, 10, 400, 30);
		add(l6);
		
		
		b1=new JButton("Load Data");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setBounds(280,400,120,30);
		b1.addActionListener(this);
		add(b1);
		
		b2=new JButton("Back");
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.setBounds(480,400,120,30);
		b2.addActionListener(this);
		add(b2);
		
		getContentPane().setBackground(Color.WHITE);
		
		setLayout(null);
		setBounds(300,200,910,500);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()== b1) {
			try {
				conn c=new conn();
				String str="select * from customer";
				ResultSet rs = c.s.executeQuery(str);
				
				t1.setModel(DbUtils.resultSetToTableModel(rs));
				 
			}catch(Exception e) {}
			
		}else if(ae.getSource()== b2) {
			new More().setVisible(true);
			this.setVisible(false);
		}
	}
	
	public static void main(String[] args) {
		new CustomerInfo().setVisible(true);
		

	}

}


