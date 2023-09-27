<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Input</title>
</head>
<body>
    <form action="result.jsp" method="get">
        <table>
            <tr>
                <td>Enter Your Name</td>
                <td><input type="text" id="nm" name="nm"></td>
            </tr>
            <tr>
                <td>Address</td>
                <td><input type="text" id="addr" name="addr"></td>
            </tr>
            <tr>
                <td>Phone Number</td>
                <td><input type="text" id="ph" name="ph"></td>
            </tr>
            <tr>
                <td><input type="submit" onclick="return check()" value="SUBMIT"></td>
            </tr>
        </table>
    </form>
    <script>
        function check(){
            let name = document.getElementById("nm").value;
            let addr = document.getElementById("addr").value;
            let ph = document.getElementById("ph").value;

            if(name == ""){
                alert("Please Enter Name");
                return false;
            }
            else if(addr == ""){
                alert("Please Enter Address");
                return false;
            }
            else if(ph == ""){
                alert("Please Enter Phone Number");
                return false;
            }
            else if(isNaN(ph)){
                alert("Phone Number is not Valid");
                return false;
            }
            else if(ph.length != 10){
                alert("Phone Number must be of 10 digits");
                return false;
            }
            else{
                alert("Form Submitted Successfully");
                return true;
            }
        }
    </script>
</body>
</html>