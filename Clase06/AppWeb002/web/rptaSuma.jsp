<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>SUMA</title>
  </head>
  <body>
    <h1>SUMA</h1>
    <p>NUMERO 1:  <%= request.getAttribute("n1") %></p>
    <p>NUMERO 2: <%= request.getAttribute("n2") %></p>
    <p>SUMA:  <%= request.getAttribute("suma") %></p>
  </body>
</html>
