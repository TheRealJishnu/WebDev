<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h2>Your Input</h2>
    <%
        String nm = request.getParameter("nm");
        String addr = request.getParameter("addr");
        String ph = request.getParameter("ph");
    %>
    <br>
    <% out.println("Name : " + nm + '\n'); %>
    <br>
    <% out.println("Address : " + addr + '\n'); %>
    <br>
    <% out.println("Phone Number : " + ph); %>
</body>
</html>