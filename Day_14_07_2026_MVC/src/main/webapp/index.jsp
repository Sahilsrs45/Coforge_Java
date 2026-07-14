<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Account Management System</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
      rel="stylesheet">

<style>
body{
    background: linear-gradient(to right, #4facfe, #00f2fe);
    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
    font-family:Arial, Helvetica, sans-serif;
}

.card{
    width:500px;
    border:none;
    border-radius:15px;
    box-shadow:0 8px 20px rgba(0,0,0,0.2);
}

.card-header{
    background:#0d6efd;
    color:white;
    text-align:center;
    font-size:28px;
    font-weight:bold;
    padding:20px;
}

.card-body{
    padding:30px;
}

.btn{
    margin:10px 0;
    padding:12px;
    font-size:18px;
    border-radius:8px;
}

.footer{
    text-align:center;
    margin-top:20px;
    color:#6c757d;
    font-size:14px;
}
</style>

</head>

<body>

<div class="card">

    <div class="card-header">
        Account Management System
    </div>

    <div class="card-body">

        <div class="d-grid gap-3">

            <a href="hello" class="btn btn-primary">
                Hello
            </a>

            <a href="name" class="btn btn-success">
                Name
            </a>

            <a href="welcome" class="btn btn-warning text-dark">
                Welcome
            </a>

            <a href="accounts" class="btn btn-danger">
                Account Management
            </a>

        </div>

        <div class="footer">
            Spring MVC | JSP | Bootstrap
        </div>

    </div>

</div>

</body>
</html>