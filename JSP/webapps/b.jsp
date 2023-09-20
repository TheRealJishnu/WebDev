<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>PLACEHOLDER</h1>
    <%
        String fn = request.getParameter("fn");
        String ln = request.getParameter("ln");
        out.println("First Name : " + fn);
        out.println("Last Name : " + ln);

    %>
</body>
</html>