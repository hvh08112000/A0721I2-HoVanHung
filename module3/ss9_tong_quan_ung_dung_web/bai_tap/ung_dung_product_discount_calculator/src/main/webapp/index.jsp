<%--
  Created by IntelliJ IDEA.
  User: hvh08
  Date: 04/01/2022
  Time: 10:19 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <body>
  <form method="post" action="/index">
    <h2>Product Discount Calculator</h2>
    <p>Product Description:</p>
    <input type="text" name="productDescription">
    <p>List Price:</p>
    <input type="text" name="listPrice">
    <p>Discount Percent:</p>
    <input type="text" name="discountPercent">
    <button type="submit">Calculate Discount</button>
  </form>
  </body>
</html>
