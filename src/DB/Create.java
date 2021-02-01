package DB;

import java.sql.Statement;

public class Create {
	Statement st = null;
	public Create() {
	//public static void main(String[] args) {
		//Statement st = null;
		Connect conn = new Connect("postgres", "5174");
		try {
			st = conn.c.createStatement();
			String sql = "create table event(event_name varchar(50), event_id int, event_date date, venue varchar(50), year varchar(5), primary key(event_name));"; 
			st.executeUpdate(sql);
			System.out.println("Event Table created successfully..");
		}

		catch(Exception e) {
			//e.printStackTrace();
		}
		
		try {
			st = conn.c.createStatement();
			String sql = "create table participent(p_id int, contact_no varchar(11) not null, name varchar(70) not null, email varchar(40), college_name varchar(100), event_name varchar(50), primary key(p_id), foreign key(event_name) references event(event_name));";
			st.executeUpdate(sql);
			System.out.println("participent Table created successfully..");
		}

		catch(Exception e) {
			//e.printStackTrace();
		}
/*
		try {
			st = conn.c.createStatement();
			String sql = "create table organizing_team(organizer varchar(50), tech_head varchar(50), publicity_head varchar(50), reg_head varchar(50), primary key(tech_head, publicity_head, reg_head));"; 
			st.executeUpdate(sql);
			System.out.println("organizing_team Table created successfully..");
		}

		catch(Exception e) {
			//e.printStackTrace();
		}
		
		try {
			st = conn.c.createStatement();
			String sql = "create table report(event_name varchar(50), prize int, year varchar(5), winner varchar(50), judge varchar(50)," +
					"organizer varchar(50), tech_head varchar(50), publicity_head varchar(50), reg_head varchar(50)," +
					"foreign key(tech_head, publicity_head, reg_head) references organizing_team(tech_head, publicity_head, reg_head), "
					+ "foreign key(event_name) references event(event_name));";  
			st.executeUpdate(sql);
			System.out.println("Report Table created successfully..");
		}

		catch(Exception e) {
			//e.printStackTrace();
		}*/
	}
}
