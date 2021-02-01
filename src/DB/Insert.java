package DB;

import java.sql.ResultSet;
import java.sql.Statement;

public class Insert {
	static int pid;
	
	public Insert( String event_id, String event_name, String event_date, String year, String venue, boolean f) {
		Connect conn = new Connect("organizer", "organizer@123");
		try {
			Statement st = null;		
			st = conn.c.createStatement();
			String sql = "insert into event values('"+ event_name +"', "+ event_id +", '"+event_date+"', '" + venue+ "', '"+year+"');";
			System.out.println(sql);
			st.executeUpdate(sql);
			System.out.println("value of Client inserted successfully..");
		}catch(org.postgresql.util.PSQLException e) {
			System.out.println("Error accured due to some insersion operation.");
			//e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Done");
	}
	
	public Insert( String name, String phone, String clg, String email, String event_name) {
		Connect conn = new Connect("registration_team", "register@123");
		try {
			Statement st = null;		
			st = conn.c.createStatement();
			String sql2 ="select MAX(p_id) from participent;";
			ResultSet rs2 = st.executeQuery( sql2 );
			try{
				pid = Integer.parseInt(rs2.getString(1));
			}catch(Exception e){
				//pid = 1;
			}
			String sql = "insert into participent values("+ String.valueOf(pid) +", '"+ phone +"', '"+name+"', '" + email+ "', '"+clg+"', '"+event_name+"');";
			System.out.println(sql);
			st.executeUpdate(sql);
			System.out.println("value of Participent inserted successfully..");
		}catch(org.postgresql.util.PSQLException e) {
			System.out.println("Error accured due to same values occured twice.");
			//e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Done");
		pid++;
	}
}
