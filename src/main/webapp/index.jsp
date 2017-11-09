<html>
<head>
    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <script src="../js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <h2>User</h2>
    <form action="/hello" method="get" id="seachEmployeeForm" role="form">
        <div class="form-group col-xs-5">
            <input type="text" name="user" id="user" class="form-control" required="true"
                   placeholder="Type the userName"/>
        </div>
        <button type="submit" class="btn btn-info">Call Servlet</button>
    </form>
</div>
</body>
</html>
