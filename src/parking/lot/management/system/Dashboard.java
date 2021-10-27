package parking.lot.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {

	JMenuBar mb;
	JMenu m1, m2, m3, m4, m5;
	JMenuItem i1, i2, i3;
	
	Dashboard(){
		
		mb = new JMenuBar();
		add(mb);
		
		m2 = new JMenu("ENTRY");
		mb.add(m2);
		
		m3 = new JMenu("EXIT");
		mb.add(m3);
		
		m4 = new JMenu("PAYMENT");
		mb.add(m4);
		
		m1 = new JMenu("PARKING MANAGEMENT");
		m1.setForeground(Color.RED);
		mb.add(m1);
		
		m5 = new JMenu("ADMIN");
		m5.setForeground(Color.BLUE);
		mb.add(m5);
		
		i1 = new JMenuItem("Add Employee");
		i1.addActionListener(this);
		m5.add(i1);
		
		i2 = new JMenuItem("Add Parking Spots");
		i2.addActionListener(this);
		m5.add(i2);
		
		i3 = new JMenuItem("More");
		i3.addActionListener(this);
		m1.add(i3);
		
		mb.setBounds(0,0,1950,30);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("parking/lot/management/system/icons/third.jpeg"));
		Image i2 = i1.getImage().getScaledInstance(1530, 780, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l1 = new JLabel(i3);
		l1.setBounds(0,0,1530,780);
		add(l1);
				
		JLabel l2 = new JLabel("P A R K I N G");
		l2.setBounds(600,5, 400, 200);
		l2.setForeground(Color.YELLOW);
		l2.setFont(new Font("serif", Font.ITALIC, 60));
		l1.add(l2);
		
		setLayout(null);
		setBounds(0,0,1530,820);
		setVisible(true);
		
		
		
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand().equals("More")){
			new More().setVisible(true);
		}else if(ae.getActionCommand().equals("Add Employee")) {
			new AddEmployee().setVisible(true);
		}else if(ae.getActionCommand().equals("Add Parking Spots")) {
			new AddParkingSpots().setVisible(true);
		}
	}
	public static void main(String[] args) {
		new Dashboard().setVisible(true);

	}

}
