<%@ page import="FunctionLayer.LogicFacade" %>
<%@ page import="FunctionLayer.Bottom" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!doctype html>
<html lang="en">
<head>

    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

    <title>Cupcakes</title>

</head>

<body class="container">
<div class="row">
        <h1 class="text-center">Din bestilling</h1>
    <br>
</div>
<div class="row">
    <h3 class="text-center">Slet, ret eller tilføj til din ordre.</h3>
    <br>
    <br>
</div>

    <div class="row">
        <div class="col-md-2">
            Cupcakes
        </div>
        <div class="col-md-2">
            Bottom
        </div>
        <div class="col-md-2">
            Topping
        </div>
        <div class="col-md-2">
            Price
        </div>
        <div class="col-md-2">
            Change
        </div>
        <div class="col-md-2">
            Delete
        </div>
    </div>
<hr>

<div class="row">
    <div class="col-md-2">
        ${requestScope.number}
    </div>
    <div class="col-md-2">
        ${requestScope.bottom}
    </div>
    <div class="col-md-2">
        ${requestScope.topping}
    </div>
    <div class="col-md-2">
        N/A
    </div>
    <div class="col-md-2">
        N/A
    </div>
    <div class="col-md-2">
        N/A
    </div>
</div>

<hr>



</div>


<div class="text-left">
    <a class="btn btn-primary" href="FrontController?target=redirect&destination=index" role="button">Add Cupcakes</a>
</div>




<!-- Option 2: jQuery, Popper.js, and Bootstrap JS -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
