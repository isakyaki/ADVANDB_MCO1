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
	
	public static ArrayList<Q3> Query3(String address)
	{
		try
		{
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pw);

			String query = "SELECT BO.BorrowerLastName, BO.BorrowerFirstName, COUNT(BL.BookID) AS NoBooksLoaned, BO.Address " + 
					"FROM book_loans BL, borrower BO " + 
					"WHERE BL.CardNo = BO.CardNo AND BO.Address = '" + address + "' " + 
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
	
	public static ArrayList<Q4> Query4(int num)
	{
		try
		{
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pw);

			String query = "SELECT BO.BorrowerFirstName, COUNT(BL.CardNo) AS NoBooksBor " + 
					"FROM borrower BO, book_loans BL " + 
					"WHERE BO.CardNo = BL.CardNo " + 
					"GROUP BY BL.CardNo " + 
					"HAVING COUNT(BL.CardNo) <= " + num + " " + 
					"ORDER BY COUNT(BL.CardNo) DESC, BO.BorrowerFirstName";

			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			ArrayList<Q4> result = new ArrayList<Q4>();

			while (rs.next())
			{
				String fn = rs.getString("BorrowerFirstName");
				int c = rs.getInt("NoBooksBor");
				
				Q4 nRow = new Q4(fn, c);
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
	
	public static ArrayList<Q5> Query5()
	{
		try
		{
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pw);

			String query = "SELECT DISTINCT BO.CardNo, BO.BorrowerFirstName, BO.Address, BL.BranchID, LB.BranchName, LB.BranchAddress " + 
					"FROM book_loans BL, borrower BO, library_branch LB " + 
					"WHERE BO.Address <> LB.BranchAddress AND BL.CardNo = BO.CardNo AND BL.BranchID = LB.BranchID";

			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			ArrayList<Q5> result = new ArrayList<Q5>();

			while (rs.next())
			{
				int cn = rs.getInt("CardNo");
				String fn = rs.getString("BorrowerFirstName");
				String a = rs.getString("Address");
				int brid = rs.getInt("BranchID");
				String bn = rs.getString("BranchName");
				String ba = rs.getString("BranchAddress");
				
				Q5 nRow = new Q5(cn, fn, a, brid, bn, ba);
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
	
	public static ArrayList<Q6> Query6(String address)
	{
		try
		{
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pw);

			String query = "SELECT B.title, BA.AuthorLastName, BA.AuthorFirstName, P.Address " + 
					"FROM book B, book_authors BA, publisher P " + 
					"WHERE B.bookID = BA.bookID AND B.PublisherName = P.PublisherName AND P.Address = '" + address + "' " + 
					"ORDER BY BA.AuthorLastName";

			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			ArrayList<Q6> result = new ArrayList<Q6>();

			while (rs.next())
			{
				String t = rs.getString("Title");
				String ln = rs.getString("AuthorLastName");
				String fn = rs.getString("AuthorFirstName");
				String a = rs.getString("Address");
				
				Q6 nRow = new Q6(t, ln, fn, a);
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
	
	public static ArrayList<Q7> Query7()
	{
		try
		{
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pw);

			String query = "SELECT COUNT(b.BookID) AS NoOfBooksBorrowed, bo.BorrowerLastName, bo.BorrowerFirstName, p.Address " + 
					"FROM book b, book_loans bl, borrower bo, publisher p " + 
					"WHERE b.BookID = bl.BookID AND b.PublisherName = p.PublisherName AND bl.CardNo = bo.CardNo AND bo.Address = p.Address " + 
					"GROUP BY bl.CardNo " + 
					"ORDER BY bo.BorrowerLastName";

			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			ArrayList<Q7> result = new ArrayList<Q7>();

			while (rs.next())
			{
				int c = rs.getInt("NoOfBooksBorrowed");
				String ln = rs.getString("BorrowerLastName");
				String fn = rs.getString("BorrowerFirstName");
				String a = rs.getString("Address");
				
				Q7 nRow = new Q7(c, ln, fn, a);
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
	
	public static ArrayList<Q8> Query8()
	{
		try
		{
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pw);

			String query = "SELECT COUNT(bl.BookID) AS NoOfTimesBorrowed, lb.BranchName, b.PublisherName " + 
					"FROM book b, book_loans bl, publisher p, library_branch lb " + 
					"WHERE b.BookID = bl.BookID AND b.PublisherName = p.PublisherName AND bl.BranchID = lb.BranchID " + 
					"GROUP BY lb.BranchID,  p.PublisherName " + 
					"ORDER BY lb.BranchName";

			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			ArrayList<Q8> result = new ArrayList<Q8>();

			while (rs.next())
			{
				int c = rs.getInt("NoOfTimesBorrowed");
				String bn = rs.getString("BranchName");
				String pn = rs.getString("PublisherName");
				
				Q8 nRow = new Q8(c, bn, pn);
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
		
//		ArrayList<Q6> result = Query6("New York");
//		
//		for(Q6 r: result) {
//			System.out.println(r.toString());
//		}
		
//		ArrayList<Q4> result = Query4(5);
//		
//		for(Q4 r: result) {
//			System.out.println(r.toString());
//		}
		
		ArrayList<Q8> result = Query8();
		
		for(Q8 r: result) {
			System.out.println(r.toString());
		}
	}

}
