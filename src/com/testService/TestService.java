package com.testService;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Servlet implementation class TestService
 */
@WebServlet("/json")
public class TestService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestService() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    protected void doGet(HttpServletRequest request,
    		HttpServletResponse response) throws ServletException, IOException {
    	 
    	 String value= 	request.getHeader("Authorization");
    	 //value = "v";
    //	String value = request.getParameter("encryptedkey");
    	if (value.contentEquals("a"))
    	  {
    		
    		RequestDispatcher view = request.getRequestDispatcher("res.json");
    		response.setContentType("application/json");
        	view.forward(request, response);
    	  }
    	else
      {
//    		 String htmlResponse = "<html><h3> hi </h3></html>";
//    		   	PrintWriter writer = response.getWriter();
//    		   	writer.write(htmlResponse+ value);
    		RequestDispatcher view = request.getRequestDispatcher("res.json");
    		response.setContentType("application/json");
    		response.setHeader("Access-Control-Allow-Origin", "http://localhost:8080");
        	view.forward(request, response);
    	  }
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
