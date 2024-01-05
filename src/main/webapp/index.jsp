<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
    
    <title>Admin panel</title>
</head>
<body>
   <nav>
    
      <div class="Side-menu">
        <div class="admin-name">
             <h1>Admin</h1>
             
        </div>
        <ul>
            <a href="index.jsp"><li><li><img src="Image/dashboard (1).png" alt="" > &nbsp; Dashboard</li></a>
            <a href="Employee.jsp"><li> <img src="Image/employee.png" alt="" > &nbsp; Employee</li></a>
            <a href="Customer.jsp"><li><img src="Image/rating.png" alt="" > &nbsp; Customer</li></a>
            <a href="Medicine.jsp"> <li><img src="Image/medicine.png" alt="" > &nbsp; Medicine</li></a>
            <a href="Supplier.jsp"> <li><img src="Image/supplier.png" alt="" > &nbsp;  Supplier</li></a>
            <a href="Total_sale.jsp"> <li><img src="Image/bag (1).png" alt="" > &nbsp; Total Sale</li></a>
            <a href="Invoice.jsp"> <li><img src="Image/invoice.png" alt="" > &nbsp; Invoice</li></a>
            <a href="History.jsp"><li><img src="Image/search.png" alt="" > &nbsp; History</li></a>
           
        </ul>
        

    </nav>
  
    <div class="container">
      <div class="header">
          <div class="nav">
             
          <div class="search">
                  <input type="text" placeholder="Search..">
                  <button type="submit"><img src="Image/search.png" alt=""></button>
              </div>
              <div class="user">
                  
                  <img src="Image/icons8-alarm-30.png" alt="">
                  <div class="img-case">
                      <img src="Image/icons8-user-48.png" alt="">
                  </div>
              </div>
          </div>
      </div>
      <div class="main">
        <div class="users">
          <div class="card">
            <img src="Image/rating.png">
            <h4>Total Customer</h4>
            <p>50</p>
            
            <button>Total customer</button>
          </div>
          <div class="card">
            <img src="Image/supplier.png">
            <h4>Total Supplier</h4>
            <p>20</p>
            <button>Total Supplier</button>
          </div>
          <div class="card">
            <img src="Image/medicine.png">
            <h4>Total Medicine</h4>
            <p>100</p>
            <button>Total Medicine</button>
          </div>
          <div class="card">
            <img src="Image/3674264.jpg">
            <h4>Out of Stock</h4>
            <p>10</p>
            <button>Out of Stock</button>
          </div>
          <div class="card">
            <img src="Image/big-no-waiting-sign.jpg">
            <h4>Expired</h4>
            <p>15</p>
            <button>Expried</button>
          </div>
          
        </div>
      </div>
      <div class="content-2">
        <div class="recent-payments">
          <div class="title">
              <h2>Analysis</h2>
              
          </div>
          <table>
            <tr>
              <th><img src="Image/trend.png" alt=""></th>
              
          </tr>
          </table>
      </div>
        <div class="new">
            <div class="title">
                <h2>Todays Report</h2>
            </div>
            <table>
                <tr>
                    <th>Todays Report</th>
                    <th>Amount</th>
                </tr>
                <tr>
                    <td>Total Purchase</td>
                    <td>$0</td>
                    
                </tr>
                <tr>
                  <td>Bank Recive</td>
                  <td>$0</td>
                </tr>
                <tr>
                 <td>Total Sale</td>
                  <td>$0</td>
                </tr>
                <tr>
                  <td>Total Customer</td>
                  <td>0</td>
                </tr>
                <tr>
                  <td>Case Recive</td>
                  <td>$0</td>
                </tr><tr>
                  <td>Total Supplier</td>
                  <td>0</td>
                </tr>

            </table>
        </div>  
</body>
</html>