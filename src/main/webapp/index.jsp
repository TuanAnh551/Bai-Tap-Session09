<%--
  Created by IntelliJ IDEA.
  User: dinht
  Date: 5/20/2024
  Time: 3:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        .discount{
            height: 350px;
            width: 300px;
            margin: 0;
            padding: 10px;
            border: 1px #CCC solid;
        }
        .discount input{
            padding: 5px;
            margin: 5px;
        }
    </style>
</head>
<body>
<form method="post" action="/DisplayDiscount">
    <div class="discount">
        <h2>Discount Calculator</h2>
        Product Description: <input type="text" name="productDescription" size="30"><br>
        List Price: <input type="text" name="listPrice" size="30"><br>
        Discount Percent: <input type="text" name="discountPercent" size="30"><br>
        <input type="submit" value="Calculate Discount">
    </div>
</form>

</body>
</html>
