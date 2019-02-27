<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
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
        <li><a href="#">PRODUCT LIST</a></li>
       
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-user"></span> Your Account</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
      </ul>
    </div>
  </div>
</nav>

 <div class="row">
    <div class="col-sm-4" ><img src="image3.png" height="300" width="300"><a href=""></a></div>
    <div class="col-sm-4" ><img src="image7.jpg" height="300" width="300"><a href=""></a></div>
    <div class="col-sm-4" ><img src="image5.jpg" height="300" width="300"><a href=""></a></div>
  </div>
   <div class="row">
    <div class="col-sm-4" align center ><a  href="">Mobile</a></div>
    <div class="col-sm-4" align center ><a href="">Laptop</a></div>
    <div class="col-sm-4" align center ><a  href="">DSLR</a></div>
  </div>
  <br>
  <br>
  <br>

     <footer class="container-fluid text-center">
  <p>Flipkart Copyright</p>  
  
     <li><a href="contact.html">CONTACT</a></li>
      <li><a href="about.html">ABOUT US</a></li>
  
</footer>
      
  </body>
</html>