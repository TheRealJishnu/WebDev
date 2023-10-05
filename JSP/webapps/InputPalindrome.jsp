<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=<device-width>, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h2>Palindrome Input</h2>
    <form action="PalindromeCheck.jsp" method="get">
        Please Enter a Number : <input type="text" id="st" name="st">
        <input type="submit" id="box" value="SUBMIT" onclick="return inpCheck()">
    </form>

    <script>
        function inpCheck(){
            let num = document.getElementById("st").value;
            if(isNaN(num) || num=="" || Number(num) < 0){
                alert("Please Input a Valid Number");
                document.getElementById("box").focus();
                return false;
            }
            else{
                return true;
            }
        }
    </script>
</body>
</html>