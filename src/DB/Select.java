package DB;

import java.sql.ResultSet;
import java.sql.Statement;

public class Select {
	public Select(String str) throws Exception {
		if(str.equals("Event")) {
			Statement st = null;
			Connect conn = new Connect("organizer", "organizer@123");
			st = conn.c.createStatement();
			String sql1 ="select * from event;";
			ResultSet rs1 = st.executeQuery( sql1 );
			while ( rs1.next() ) {  
		    	System.out.println("Event_id:"+rs1.getString(2));
		    	System.out.println("Event_name:"+rs1.getString(1));
		    	System.out.println("Event_Date:"+rs1.getString(3));
		    	System.out.println("Vanue:"+rs1.getString(4));
		    	System.out.println("Year:"+rs1.getString(5));
				System.out.println();
			} 
			System.out.println();
		} else if (str.equals("Participent")) {
			Connect conn = new Connect("organizer", "organizer@123");
			Statement st = null;
			st = conn.c.createStatement();
			String sql2 ="select * from participent;";
			ResultSet rs2 = st.executeQuery( sql2 );
			while ( rs2.next() ) {  
		    	System.out.println("Participent_id:"+rs2.getString(1));
		    	System.out.println("Participent_name:"+rs2.getString(3));
		    	System.out.println("Contact Number:"+rs2.getString(2));
		    	System.out.println("Email:"+rs2.getString(4));
		    	System.out.println("College Name:"+rs2.getString(5));
		    	System.out.println("Participated Event Name:"+rs2.getString(6));
				System.out.println();
			} 
			System.out.println();
		}
	}
}
