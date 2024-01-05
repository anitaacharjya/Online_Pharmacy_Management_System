<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="Login.css">
</head>
<body>
 <form action="<%= request.getContextPath()%>/Login" method="Get" ">
 <div class="loginbox">
  
     <div>
     <img src="Image/login.png" alt="Avatar" class="avatar">
     
            <h1> Admin</h1>
           <label> ${LoginError}</label>
            <div>
            <h>
             <b>Username</b> 
            </h>
                <input type="text"placeholder=" Type your username" name="Username">

            </div>
            <br>
            <div>
                <h>
                 <b>Password</b>  
                </h> 
                <input type="text"placeholder=" Type your password" name="Password">
            
            </div>
            <br>
            <div>
                <a href= "#"> Forgot Password? </a>
            </div>
            <br>
            <div>
           <button type="submit" class="btn btn-danger">Login</button>
            </div>
            <br>
            <div>
                don't have any account <a href="#">Sign up</a>
            </div>
      </div>
      
    </div>
    </form>
    
</body>
</html>