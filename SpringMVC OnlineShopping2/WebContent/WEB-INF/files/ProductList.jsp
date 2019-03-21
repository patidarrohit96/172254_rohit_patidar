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
      <a class="navbar-brand"><img src="C:\Users\ropatida\Downloads\image1.jpg" href="index.html"  height="40" width="150" /></a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li ><a href="/SpringOnlineShopping2/welcome">HOME</a></li>
        
        <li class="active"><a href="/SpringOnlineShopping2/ProductList">PRODUCT LIST</a></li>
       
      </ul>
      <ul class="nav navbar-nav navbar-right">
      <% if(session.getAttribute("uname")==null){
        	%><li><a href="/SpringOnlineShopping2/login">LOGIN</a></li>
         <li><a href="/SpringOnlineShopping2/register">REGISTER</a></li>
         <% 
         } else { 
         %>
         <li><a href="logout">LOGOUT</a></li>
         <% } %>
        <li><a href="#"><span class="glyphicon glyphicon-user"></span><%=request.getSession().getAttribute("uname") %> </a></li>
        <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
      </ul>
    </div>
  </div>
</nav>
<form action="Cart.jsp">
<table border="1">

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
		<td width="228">
		<table width="120" height="173" border="0" align="center">
              <tr>
                <td><form action="product.jsp"> 
<input type="hidden" name="product" value="S001"> 
<input name="buy" type="image" value="grand" src=<%=resultSet.getString("image") %> width="114" height="165"> 
</form></td>
              </tr>
            </table>
              <p class="center1"><b>Name:</b><%=resultSet.getString("name") %></p>
              <p class="center1"><b>Price:</b><%=resultSet.getString("price") %></p>
               <% if(session.getAttribute("uname")==null) { %>
              <p class="center1"><a  style="text-decoration: none" href="/SpringOnlineShopping2/login" ><b>Buy Now</b></a></p>
              <% } else { %>
              <p class="center1"><a  style="text-decoration: none" href="Cart.jsp" ><b>Buy Now</b></a></p>
              <% } %>
            </td>
		<%
			}

			} catch (SQLException e) {
				e.printStackTrace();

			}
		%>

</table>

<footer class="container-fluid text-center">
  <p>Flipkart Copyright</p>  
  
     <li><a href="contact.html">CONTACT</a></li>
      <li><a href="about.html">ABOUT US</a></li>
  
</footer>
</body>
</html>
