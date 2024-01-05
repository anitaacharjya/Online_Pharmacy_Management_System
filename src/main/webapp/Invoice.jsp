<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <link rel="stylesheet" href="Invoice.css">
</head>
<body>
    
    <div class="header">
        <div class="logo">
            <span class="text">Annu Pharmacy</span>
            
        </div>
        <div class="home">
            <a href="index.jsp"><button class="w3-xlarge"><i class="glyphicon glyphicon-home"> Home</li></i></button></a>

        </div>
        
        <div class="search">
            <span class="icon">
                <img src="Image/search.png" alt="">
            </span>
            <input type="text" class="form-control" placeholder="Search">
        </div>
    </div>
    <div class="main-content">
        <div class="invoice-container">
            <div class="top">
                <div class="top-left">
                    <h1 class="main">Invoice</h1>
                    <span class="code">#2589</span>
                </div>
                <div class="top-right">
                    <div class="date">Date: 22.02.2023</div>
                    
                </div>
            </div>
            <div class="bill-box">
                <div class="left">
                    <div class="text-m">Bill from:</div>
                    <div class="title">Annu Pharmacy</div>
                    <div class="addr">Parihati,Jhargram,721505</div>
                </div>
                <div class="right">
                    <div class="text-m">Bill TO:</div>
                    <div class="title">Pallab Mahata</div>
                    <div class="addr">Ramchandrapur,Jhargram</div>
                </div>
            </div>
            <div class="table-bill">
                <table class="table-service">
                    <thead>
                        <th class="quantity">Quantity</th>
                        <th>Medicine</th>
                        <th class="cost">Cost</th>
                    </thead>
                    <tbody>
                        <tr>
                            <td>1</td>
                            <td>Calpol</td>
                            <td class="cost">22 /-</td>
                        </tr>
                        <tr>
                            <td>2</td>
                            <td>Pantoprazole</td>
                            <td class="cost">40 /-</td>
                        </tr>
                        <tr>
                            <td>3</td>
                            <td>Azithromycin</td>
                            <td class="cost">100 /-</td>
                        </tr>
                    </tbody>
                    <tfoot>
                        <tr class="total">
                            <td class="name">Total</td>
                            <td colspan="2" class="number">162 /-</td>
                        </tr>
                    </tfoot>
                </table>
            </div>
            <div class="actions">
                <button class="btn btn-main">Print</button>
                <button class="btn btn-main">Pay Now</button>
            </div>
            <div class="note">
                <p>Thank You for visit us!</p>
                <p>Annu_Pharmacy.com</p>
            </div>
        </div>
    </div>
</body>
</html>
