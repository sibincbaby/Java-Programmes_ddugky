<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<body>
   <jsp:include page="_header.jsp"></jsp:include>
  <jsp:include page="_menu.jsp"></jsp:include>
   <h1> Add Product</h1>
   <form method="POST" action="${pageContext.request.contextPath}/addProduct">
     <table border="0">
          <tr>
             <td>Product name</td>
 <td><input type="text" name="pname" value= "" /> </td>
           </tr>
           <tr>
              <td>Price</td>
<td><input type="text" name="price" value= "" /> </td>
           </tr>
           <tr>
              <td colspan ="2">
                 <input type="submit" value="Submit" />
                 <a href="${pageContext.request.contextPath}/">Cancel</a>
              </td>
           </tr>
        </table>
     </form>
</body>
</html>