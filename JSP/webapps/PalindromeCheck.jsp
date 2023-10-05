<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Palindrome Check</h1>
    <%!
        int numAt(int num, int i){
            num /= Math.pow(10, i-1);
            return num % 10;
        }
    %>
    <%
        String s = request.getParameter("st");
        int len = s.length();
        int num = Integer.parseInt(s);
        boolean flg = true;
        for(int i=1; i<=len/2; i++){
            if(numAt(num, i) != numAt(num, len-i+1)){
                flg = false;
                out.println("Not A Palindrome");
                break;
            }
        }
        if(flg){
            out.println("This Number is a Palindrome");
        }

        

    %>
</body>
</html>