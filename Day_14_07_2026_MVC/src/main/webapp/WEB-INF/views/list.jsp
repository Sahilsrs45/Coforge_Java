<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Account List</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
      rel="stylesheet">

<style>
body{
    background-color:#f4f6f9;
    font-family: Arial, Helvetica, sans-serif;
}

.container{
    margin-top:40px;
}

.card{
    border:none;
    border-radius:12px;
    box-shadow:0 4px 12px rgba(0,0,0,0.15);
}

.card-header{
    background:#0d6efd;
    color:white;
    font-size:28px;
    font-weight:bold;
    text-align:center;
}

.table{
    margin-bottom:0;
}

.table thead{
    background:#0d6efd;
    color:white;
}

.table tbody tr:hover{
    background:#f1f5ff;
    transition:.3s;
}

.btn{
    border-radius:20px;
    padding:5px 15px;
}

.action-btn{
    margin-right:5px;
}

.balance{
    font-weight:bold;
    color:green;
}
</style>

</head>

<body>

<div class="container">

    <div class="card">

        <div class="card-header">
            Account Management
        </div>

        <div class="card-body">

            <div class="d-flex justify-content-between mb-3">
                <h4 class="text-primary">Account List</h4>

                <a href="accounts/add" class="btn btn-primary">
                    + Add Account
                </a>
            </div>

            <div class="table-responsive">

                <table class="table table-bordered table-hover align-middle">

                    <thead class="text-center">
                        <tr>
                            <th>Account ID</th>
                            <th>Account Holder</th>
                            <th>Bank Name</th>
                            <th>Address</th>
                            <th>Balance</th>
                            <th width="260">Actions</th>
                        </tr>
                    </thead>

                    <tbody>

                        <c:forEach items="${accountList}" var="acc">

                            <tr>

                                <td>${acc.accNo}</td>

                                <td>${acc.accHolderName}</td>

                                <td>${acc.bankName}</td>

                                <td>${acc.address}</td>

                                <td class="balance">
                                    ₹ ${acc.balance}
                                </td>

                                <td>

                                    <a href="accounts/update/${acc.accNo}"
                                       class="btn btn-success btn-sm action-btn">
                                        Update
                                    </a>

                                    <a href="accounts/delete/${acc.accNo}"
                                       class="btn btn-danger btn-sm action-btn"
                                       onclick="return confirm('Are you sure you want to delete this account?')">
                                        Delete
                                    </a>

                                    <a href="accounts/info/${acc.accNo}"
                                       class="btn btn-info btn-sm text-white">
                                        Info
                                    </a>

                                </td>

                            </tr>

                        </c:forEach>

                    </tbody>

                </table>

            </div>

        </div>

    </div>

</div>

</body>
</html>