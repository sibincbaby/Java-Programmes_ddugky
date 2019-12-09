package com.face.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.UserAccount;
import com.face.dao.DBUtils;
import com.face.dao.MyUtils;

/**
 * Servlet implementation class AddProductServlet
 */
@WebServlet(urlPatterns = { "/addProduct" })
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("Welcome to AddProduct Servlet");
	
		
        RequestDispatcher dispatcher //
                = this.getServletContext().getRequestDispatcher("/WEB-INF/views/addProduct.jsp");
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside dopost addProductServlets");
		 UserAccount user = null;
    	String pname = request.getParameter("pname");
        String Sprice =request.getParameter("price");
        System.out.println("to db"+pname);
        System.out.println(Sprice);
        int price= Integer.parseInt(Sprice);
           
          // System.out.println(price2);
           Connection conn = MyUtils.getStoredConnection(request);
           try {
               // Find the user in the DB.
               boolean flag = DBUtils.addProduct(conn, pname, price);
            
               //response.sendRedirect("/WEB-INF/views/productView.jsp");
               
           } catch (SQLException e) {
               e.printStackTrace();
               
           }
           String list="name";
           request.setAttribute("data1",list);
   		
      RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/userInfoView.jsp");
      dispatcher.forward(request, response);   
	}

}
