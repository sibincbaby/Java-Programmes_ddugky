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
 * Servlet implementation class UpdateProductServlet
 */
@WebServlet(urlPatterns = { "/update" })
public class UpdateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("Welcome to Update Product Servlet");
	
		
        RequestDispatcher dispatcher //
                = this.getServletContext().getRequestDispatcher("/WEB-INF/views/updateProduct.jsp");
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside dopost Update ProductServlets");
		 UserAccount user = null;
		 String sid =request.getParameter("id");
		  int id= Integer.parseInt(sid);	 
   	String pname = request.getParameter("pname");
       String Sprice =request.getParameter("price");
       int price= Integer.parseInt(Sprice);
          
         // System.out.println(price2);
          Connection conn = MyUtils.getStoredConnection(request);
          try {
              // Find the user in the DB.
              boolean flag = DBUtils.updateProduct(conn,id, pname, price);
           
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
