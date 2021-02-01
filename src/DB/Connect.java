package DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
	Connection c = null;
	public Connect(String username, String password) {
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager
	            .getConnection("jdbc:postgresql://localhost:5432/csi_sb",
	            username, password);
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      //System.out.println("DB is connected Successfully.");
	}
}