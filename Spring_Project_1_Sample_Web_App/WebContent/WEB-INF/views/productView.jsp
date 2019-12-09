<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
     <%@page import="java.util.ArrayList"%>      <%--Importing all the dependent classes--%>
 <%@page import="java.util.Iterator"%>
 <%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

   <jsp:include page="_header.jsp"></jsp:include>
  <jsp:include page="_menu.jsp"></jsp:include>
   <h1>  product details</h1>
  
  <%Iterator itr;%>
          <% List data= (List)request.getAttribute("data1");
              for (itr=data.iterator(); itr.hasNext(); )
              {
          %>
         
           <%=itr.next()%>   <%=itr.next()%> <%=itr.next()%></td><br>
             
            <%
            }
            %>
      
     
   <jsp:include page="_footer.jsp"></jsp:include>
</body>
</html>