package PracticeJdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc1 {
	Scanner sc = new Scanner(System.in);
	public void addBook(Connection con) throws SQLException {
		String query1 = "insert into library(bookId , title , author , isAvailable ) values(103, 'abc', 'xyz', true);" ;
		Statement smt = con.createStatement();
		smt.execute(query1);
	}
	public void view(Connection con) throws SQLException {
		String query2 = "Select * from library";
		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery(query2);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+ rs.getString(3)+" "+rs.getBoolean(4));
		}
	}
	public void delete(Connection con) throws SQLException {
		System.out.print("Enter The Id you Want to Delete :");
		int id = sc.nextInt();
		String query3 = "Delete from library where bookId = ?";
		PreparedStatement ps = con.prepareStatement(query3);
		ps.setInt(1, id);
		ps.executeUpdate();
		System.out.println("ID Deleted Successfully ");
		
	}
	public void update(Connection con) throws SQLException {
		System.out.println("Enter New Title and Id");
		String nt = sc.next();
		int id = sc.nextInt();
		String query4 = "update library set title = ? where bookId = ?";
		PreparedStatement ps = con.prepareStatement(query4);
		ps.setString(1, nt);
		ps.setInt(2, id);
		ps.executeUpdate();
	
	}
	public void search(Connection con) throws SQLException {
		System.out.print("Enter Title :");
		String tit = sc.next();
		String query5 = "Select * from library where title = ?";
		PreparedStatement ps = con.prepareStatement(query5);
		ps.setString(1,tit);
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+ rs.getString(3)+" "+rs.getBoolean(4));
		}
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dac_db","root","Sanm@3004");
		System.out.println("Connection Established");
		
		Jdbc1 jd = new Jdbc1();
		
//		jd.addBook(con);
		
		jd.view(con);
		
//		jd.delete(con);
		
//		jd.update(con);
		
		jd.search(con);
	}
}
