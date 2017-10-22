package service;

import java.sql.*;
import java.util.ArrayList;

import bean.*;

public class GetResult {
	
	public static final String driver = "com.mysql.jdbc.Driver";
	public static final String url = "jdbc:mysql://localhost:3306/librarydb";
	public static final String user = "root";
	public static final String pw = "1234";
	
	public static ArrayList<Q1> Query1()
	{
		try
		{
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pw);

			String query = "SELECT BL.BranchID, BL.BookID, BL.DateReturned " + 
					"FROM book_loans BL " + 
					"WHERE BL.DateReturned >= '2017-01-01' AND BL.DateReturned <= '2017-01-31' " + 
					"ORDER BY BL.BranchID, BL.BookID, BL.DateReturned";

			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			ArrayList<Q1> result = new ArrayList<Q1>();

			while (rs.next())
			{
				int brid = rs.getInt("BranchID");
				int bid = rs.getInt("BookID");
				String dr = rs.getString("DateReturned");

				Q1 nRow = new Q1(brid, bid, dr);
				result.add(nRow);
			}
			st.close();
			
			return result;
		}
		catch (Exception e)
		{
			System.err.println("Error");
			System.err.println(e.getMessage());
			
			return null;
		}
	}
	
	public static ArrayList<Q2> Query2()
	{
		try
		{
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pw);

			String query = "SELECT BL.CardNo, BL.BookID, BL.DueDate, BL.DateReturned " + 
					"FROM book_loans BL " + 
					"WHERE BL.DueDate = BL.DateReturned " + 
					"ORDER BY BL.DueDate";

			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			ArrayList<Q2> result = new ArrayList<Q2>();

			while (rs.next())
			{
				int cn = rs.getInt("CardNo");
				int bid = rs.getInt("BookID");
				String dd = rs.getString("DueDate");
				String dr = rs.getString("DateReturned");
				
				Q2 nRow = new Q2(cn, bid, dd, dr);
				result.add(nRow);
			}
			st.close();
			
			return result;
		}
		catch (Exception e)
		{
			System.err.println("Error");
			System.err.println(e.getMessage());
			
			return null;
		}
	}
	
	public static ArrayList<Q3> Query3()
	{
		try
		{
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pw);

			String query = "SELECT BO.BorrowerLastName, BO.BorrowerFirstName, COUNT(BL.BookID) AS NoBooksLoaned, BO.Address " + 
					"FROM book_loans BL, borrower BO " + 
					"WHERE BL.CardNo = BO.CardNo AND BO.Address = 'Seoul' " + 
					"GROUP BY BL.CardNo " + 
					"ORDER BY NoBooksLoaned DESC, BO. BorrowerLastName";

			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			ArrayList<Q3> result = new ArrayList<Q3>();

			while (rs.next())
			{
				String ln = rs.getString("BorrowerLastName");
				String fn = rs.getString("BorrowerFirstName");
				int bid = rs.getInt("NoBooksLoaned");
				String a = rs.getString("Address");
				
				Q3 nRow = new Q3(ln, fn, bid, a);
				result.add(nRow);
			}
			st.close();
			
			return result;
		}
		catch (Exception e)
		{
			System.err.println("Error");
			System.err.println(e.getMessage());
			
			return null;
		}
	}
	
	//FOR DEBUGGING
	public static void main(String[] args)
	{
		/*
		try
		{
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pw);

			// SQL SELECT query
			String query = "SELECT BL.BranchID, BL.BookID, BL.DateReturned " + 
					"FROM book_loans BL " + 
					"WHERE BL.DateReturned >= '2017-01-01' AND BL.DateReturned <= '2017-01-31' " + 
					"ORDER BY BL.BranchID, BL.BookID, BL.DateReturned";

			// create the java statement
			Statement st = conn.createStatement();

			// execute the query, and get a java resultset
			ResultSet rs = st.executeQuery(query);

			// iterate through the java resultset
			while (rs.next())
			{
				int branchid = rs.getInt("BranchID");
				int bookid = rs.getInt("BookID");
				String datereturn = rs.getString("DateReturned");

				// print the results
				System.out.println(branchid + " " + bookid + " " + datereturn);
			}
			st.close();
		}
		catch (Exception e)
		{
			System.err.println("Error");
			System.err.println(e.getMessage());
		}
		*/
		ArrayList<Q3> result = Query3();
		
		for(Q3 r: result) {
			System.out.println(r.toString());
		}
	}

}
