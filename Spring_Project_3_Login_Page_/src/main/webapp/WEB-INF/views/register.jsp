<%@ page language="java" contentType="text/html; charset=ISO-8859-1"    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="registercontroller" method="post">
       <center>
           <table >
               <h1>Register here</h1>
            
               <tr>
                   <td>
                       <label>First Name:</label>
                   </td>
                   <td>
                       <input type="text" name="fname" required="required"><br>
                   </td>
               </tr>
              
               <tr>
                   <td>
                       <label>Last Name:</label>
                   </td>
                   <td> <input type="text" name="lname" required="required"><br>
                   </td>
               </tr>
             
               <tr>
                   <td>
                       <label>Username:</label>
                   </td>
                   <td> <input type="text" name="uname" required="required"><br>
                   </td>
               </tr>
               
               <tr>
                   <td>
                       <label>Password:</label>
                   </td>
                   <td> <input type="password" name="pass" required="required"><br>
                   </td>
               </tr>
               <tr>
                   <td>
                       <label>Email:</label>
                   </td>
                   <td> <input type="email" name="email" required="required"><br>
                   </td>
               </tr>
             
               <tr>
                   <td>
                       <label>Mobile No:</label>
                   </td>
                   <td> <input type="tel" name="mob" required="required"><br>
                   </td>
               </tr>
               <tr>
                   <td>
                       <label></label>
                   </td>
                   <td>
                       <label>City:</label>
                       <select name="city">
                           <option value="Thrissur">Thrissur</option>
                           <option value="kottayam">Kottayam</option>
                           <option value="Kollam">Kollam</option>
                           <option value="Kollam">Kochi</option>
                       </select>
                       <br>
                   </td>
               </tr>
               <tr>
                   <td>
                       <label></label>
                   </td>
                   <td>
                       <input type="submit" class="button" value="Submit"></input>
                       <a href="login.jsp">Back to home</a>
                       <br>
                   </td>
               </tr>
            
           </table>
          
       </center>
   </form>

</body>
</html>