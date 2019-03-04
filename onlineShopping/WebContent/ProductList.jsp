<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>

    <%@page import= " java.io.IOException" %>
    <%@page import= "source.*" %>
    <%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
    
<!DOCTYPE html>
<html>
<head>
 <title>Flipkart</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <style>
   
    .navbar {
      margin-bottom: 50px;
      border-radius: 0;
    }
    

   
   
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }
  </style>
</head>
<body>

  
  <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand"><img src="image1.jpg" href="index.html"  height="40" width="150" /></a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="index.jsp">HOME</a></li>
        <% if(session.getAttribute("uname")==null){
        	%><li><a href="login.jsp">LOGIN</a></li>
         <li><a href="registration.jsp">REGISTER</a></li>
         <% 
         } else { 
         %>
         <li><a href="Logout">LOGOUT</a></li>
         <% } %>
        <li><a href="ProductList.jsp">PRODUCT LIST</a></li>
       
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-user"></span><%=request.getSession().getAttribute("uname") %> </a></li>
        <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
      </ul>
    </div>
  </div>
</nav>
<table border="1">
<tr>
<td>CODE</td>
<td>NAME</td>
<td>PRICE</td>


</tr>
<% 
PreparedStatement statement = null;
ResultSet resultSet = null;
try{
Connection conn = ConnectionFactory.getConnection();
String sql ="select * from product";
statement=conn.prepareStatement(sql);

resultSet = statement.executeQuery();
while(resultSet.next()){
%>
<tr>
<td><%=resultSet.getString("CODE") %></td>
<td><%=resultSet.getString("NAME") %></td>
<td><%=resultSet.getFloat("PRICE") %></td>
<td><a href="Cart.jsp" onclick="productId()">Buy Now</a></td>
</tr>
<%
}

} catch (SQLException e) {
e.printStackTrace();

}
%> 
</table>
</body>
</html>