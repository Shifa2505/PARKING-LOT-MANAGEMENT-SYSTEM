package parking.lot.management.system;

import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {

	JMenuBar mb;
	JMenu m1, m2, m3, m4;
	JMenuItem i1;
	
	Dashboard(){
		
		mb = new JMenuBar();
		add(mb);
		
		m1 = new JMenu("ENTRY");
		m1.setForeground(Color.RED);
		mb.add(m1);
		
		m2 = new JMenu("EXIT");
		mb.add(m2);
		
		m3 = new JMenu("SEARCH");
		mb.add(m3);
		
		m4 = new JMenu("CURRENT");
		mb.add(m4);
		
		i1 = new JMenuItem("ENTRY");
		m1.add(i1);
		
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
	public static void main(String[] args) {
		new Dashboard().setVisible(true);

	}

}
