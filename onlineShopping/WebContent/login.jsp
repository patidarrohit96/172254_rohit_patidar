<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>login</title>
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
      <a class="navbar-brand" ><img src="image1.jpg" href="index.html" height="40" width="150" /></a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li ><a href="index.jsp">HOME</a></li>
        <li class="active"><a href="login.jsp">LOGIN</a></li>
         <li><a href="registration.jsp">REGISTER</a></li>
        <li><a href="ProductListServlet">PRODUCT LIST</a></li>
       
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-user"></span> Your Account</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
      </ul>
    </div>
  </div>
</nav>
<div class="container">
<div style="color:green">${message}</div>
  <h2><b>LOGIN</b></h2>
  <form action="ValidateServlet" method="post">
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" name="email" placeholder="Enter email">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" name="pwd" placeholder="Enter password">
    </div>
    <div style="color:red">${errormessage}</div>
    <div class="checkbox">
      <label><input type="checkbox"> Remember me</label>
    </div>
    <button type="submit" class="btn btn-default">Submit</button>
  </form>
</div>

 <a  style="color:green"  href = "registration.jsp" ><p style="text-align:center">New user click here</a>
<% session.setAttribute("message", null); %>
<br>
 <br>
  <br>
  <br>
  <br>
  <br>
	<%
	session.setAttribute("errormessage", null);
	%>
     <footer class="container-fluid text-center">
  <p>Flipkart Copyright</p>  
  
     <li><a href="contact.html">CONTACT</a></li>
      <li><a href="about.html">ABOUT US</a></li>
  
</footer>
      
  </body>
</html>
