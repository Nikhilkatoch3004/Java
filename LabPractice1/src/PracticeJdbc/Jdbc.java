package PracticeJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc {
	
	Scanner sc = new Scanner(System.in);
	
	public void addProduct(Connection con) throws SQLException {
		
		String query1 = "insert into product(productId , productName , category , price , quantity ) values(?, ?, ?, ?,?);";
		PreparedStatement presmt = con.prepareStatement(query1);
		presmt.setInt(1,105);
		presmt.setString(2, "qwe");
		presmt.setString(3, "mno");
		presmt.setDouble(4, 20.00);
		presmt.setInt(5, 10);
		presmt.executeUpdate();
		presmt.close();
		System.out.println("New Item Added ");
//		ResultSet rs = presmt.executeQuery();
		
	}
	public void updateProduct(Connection con) throws SQLException {
		
		String query3 = "Update Product set price = ? , quantity = ? where productId = ?";
		PreparedStatement psmt = con.prepareStatement(query3);
		psmt.setDouble(1, 50.03);
		psmt.setInt(2, 20);
		psmt.setInt(3, 105);
		psmt.executeUpdate();
		psmt.close();
		System.out.println("Updated Successfully");
		
	}
	public void viewAllProduct(Connection con) throws SQLException {
		
		String query2 = "Select * from Product";
		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery(query2);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4)+" "+rs.getInt(5));
		}
		
	}
	public void searchProduct(Connection con) throws SQLException {
		
		System.out.println("Enter Name :");
		String naam = sc.next();
		String query4 = "Select * from product where productName = ?";
		PreparedStatement ps = con.prepareStatement(query4);
		ps.setString(1, naam);
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4)+" "+rs.getInt(5));
		}
	
	}
	public void totalInventoryValue(Connection con) throws SQLException {
		String query5 = "Select price , quantity from product";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query5);
		double total = 0.0 ;
		while(rs.next()) {
			double pri = rs.getDouble("price");
			int quant = rs.getInt("quantity");
			total +=pri*quant ;
		}
		System.out.println("Total inventory value = "+total);
		
		
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306 /dac_db","root","Sanm@3004");
		
		System.out.println("Connection Established");
		
		Jdbc jb = new Jdbc();
		
//		jb.addProduct(con);
		
//		jb.viewAllProduct( con);
		
//		jb.updateProduct(con);
		
		jb.viewAllProduct( con);
		
		System.out.println(" ");
		
//		jb.searchProduct(con);
		
		jb.totalInventoryValue(con);
	}
}
