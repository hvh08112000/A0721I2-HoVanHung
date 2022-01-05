<%--
  Created by IntelliJ IDEA.
  User: hvh08
  Date: 04/01/2022
  Time: 10:30 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Discount Calculator</title>
</head>
<body>
<h2>Product Discount Calculator</h2>
<h3>Discount Amount: <%=request.getAttribute("discountAmount")%></h3>
<h3>Discount Price: <%=request.getAttribute("discountPrice")%></h3>
</body>
</html>
