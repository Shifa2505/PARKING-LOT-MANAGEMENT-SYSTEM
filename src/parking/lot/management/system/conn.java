package parking.lot.management.system;

import java.sql.*;
public class conn {
	Connection c;
	Statement s;
	
	public conn() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql:///projectplms","shifa2505","2505*Shifa");
			s = c.createStatement();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
	}

}
