<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=, initial-scale=1.0">
    <link rel="stylesheet" href="add.css">
    
    <title>reg_from.html</title>
</head>
<body>
  
   
    <form action="<%= request.getContextPath()%>/Add_customer" method="post" onsubmit="return validation()">
        
        <div class="container">
          <h1>Add new customer</h1>
         
          <hr>
      
          
      <div class="box">
          <label for="name"><b>Name</b></label>
          <input type="text" placeholder="Enter name" name="name" id="name" autocomplete="off">
          <span id="username" > </span>
      </div>
      <div class="box">
          <label for="contact"><b>Contact_Details</b></label>
          <input type="text" placeholder="Mob.No" name="contact" id="contact" autocomplete="off">
           <span id="con" > </span>
      </div>
      <div class="box">
          <label for="address"><b>Address</b></label>
          <input type="text" placeholder="Address" name="address" id="address" autocomplete="off">
           <span id="add" > </span>
          <hr>
        
      </div>  
      
          <button type="submit" class="registerbtn">Add</button>
        
   
  <script type="text/javascript">
  
  function validation(){
	  
	 var user = document.getElementById('name').value;
	 var contact = document.getElementById('contact').value;
	 var address = document.getElementById('address').value;
	 
	 if(user == ""){
		 document.getElementById('username').innerHTML = "**please fill the username field";
		 return false;
	 }
	 
	if((user.length <= 2)||(user.length > 20)){
			 
			 document.getElementById('username').innerHTML = "** name must be btween 3 and 20";
			 return false;
		 }
	
    if(!isNaN(user)){
			 
			 document.getElementById('username').innerHTML = "** only characters allowed";
			 return false;
		 }
	 
		 
     if(contact == ""){
		document.getElementById('con').innerHTML = "**please fill the contact_details";
		 return false;
	 }
     if(isNaN(contact)){
		 
		 document.getElementById('con').innerHTML = "** only digits allowed";
		 return false;
	 }
     if(contact.length != 10){
		 
		 document.getElementById('con').innerHTML = "** mobile Number must be in 10 digits";
		 return false;
	 }
			 
	 if(address == ""){
		 document.getElementById('add').innerHTML = "**please fill the address";
		 return false;
	 }
				 
		 
		
	 
	  
  }
  
  
  </script>

</body>
</html>