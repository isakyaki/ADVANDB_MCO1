package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Q1;
import service.GetResult;

/**
 * Servlet implementation class MainServlet
 */

@WebServlet(urlPatterns = {"/queries"})
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String query = request.getParameter("query");
		
		System.out.println(query);
        
		switch(query) {
		
		default:
		case "1":
			request.setAttribute("result", GetResult.Query1());
			break; 	
		case "2": 
			request.setAttribute("result", GetResult.Query2());
			break;
		case "3": 
			request.setAttribute("result", GetResult.Query3("Seoul"));
			break;
		case "4": 
			request.setAttribute("result", GetResult.Query4(2));
			break;
		case "5": 
			request.setAttribute("result", GetResult.Query5());
			break;
		case "6": 
			request.setAttribute("result", GetResult.Query6("Los Angeles"));
			break;
		case "7": 
			request.setAttribute("result", GetResult.Query7());
			break;
		case "8": 
			request.setAttribute("result", GetResult.Query8());
			break;
		
		}

		request.setAttribute("query", query);
		request.setAttribute("time", GetResult.time);
		
        RequestDispatcher rd = request.getRequestDispatcher("Main.jsp");
        rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
//		String urlPattern = request.getServletPath(); 
//		
//		System.out.println(urlPattern);
//		
//		switch(urlPattern) { 
		//	case "/queries": getQueryOne(request, response); 
			
		}
	}

