package com.face.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.face.bo.ProductBO;
import com.face.bo.UserAccount;
public class DBUtils {
    public static UserAccount findUser(Connection conn, //
               String userName, String password) throws SQLException {
           String sql = "Select a.User_Name, a.Password, a.Gender from User_Account a " //
                   + " where a.User_Name = ? and a.password= ?";
           PreparedStatement pstm = conn.prepareStatement(sql);
           pstm.setString(1, userName);
           pstm.setString(2, password);
           ResultSet rs = pstm.executeQuery();
           if (rs.next()) {
               String gender = rs.getString("Gender");
               UserAccount user = new UserAccount();
               user.setUserName(userName);
               user.setPassword(password);
               user.setGender(gender);
               return user;
           }
           return null;
       }
    
//    Get product display fromdb
    public static ArrayList<String> displayProduct(Connection conn,ProductBO user) throws SQLException {
    	int id;
    	String pname;
    	String price;
        String sql = "Select * from product";
        PreparedStatement pstm = conn.prepareStatement(sql);
        ArrayList<String> list = new ArrayList<String>();
        ResultSet rs = pstm.executeQuery();
        while (rs.next()) {
           list.add(String.valueOf(rs.getInt("id")));
            list.add(rs.getString("pname"));
           list.add(rs.getString("price"));
           
            //System.out.println(user.getId()+" "+user.getPname() +" "+user.getPrice());
           
        }
        return list;
    }
    
    //adding product method
    public static boolean addProduct(Connection conn,String pname,int price) throws SQLException {
    	int id;
    	System.out.println("hii"+pname);
    	System.out.println(price);
    	
        String sql = "INSERT INTO product (pname,price) VALUES ('"+pname+"', '"+price+"');";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.executeUpdate(sql);
        System.out.println("Inserted succesfully");
        boolean flag=true;
        return flag;
    }
    
    
    //updating product
    
    public static boolean updateProduct(Connection conn,int id,String pname,int price) throws SQLException {
    	System.out.println("hii"+pname);
    	System.out.println(price);
    	
        String sql = "UPDATE product SET pname = '"+pname+"', price = '"+price+"' WHERE id = '"+id+"';";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.executeUpdate(sql);
        System.out.println("Updated succesfully");
        boolean flag=true;
        return flag;
    }

	public static boolean deleteProduct(Connection conn, int id) throws SQLException {
		String sql = "DELETE FROM product WHERE id = '"+id+"'";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.executeUpdate(sql);
        System.out.println("deleted succesfully");
        boolean flag=true;
		return false;
	}
    
}