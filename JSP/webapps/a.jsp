<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <h2>WELCOME TO FIRST WEBAPP</h2>
    <form action="b.jsp" method="get()">
        <table>
            <tr>
                <td>
                    First Name
                </td>
                <td>
                    <input type="text" id="fname">
                </td>
            </tr>
            <tr>
                <td>
                    Last Name
                </td>
                <td>
                    <input type="text" id="lname">
                </td>
            </tr>
            <tr>
                <td>
                    <input type="reset" value="CLEAR">
                </td>
                <td>
                    <input type="button" id="btn" onclick="submission()" value="SUBMIT">
                </td>
            </tr>
        </table>
    </form>


    <script>
        function submission() {
            fname = document.getElementById("fname").value;
            lname = document.getElementById("lname").value;
            if (fname == "") {
                alert("Empty First Name");
                document.getElementById("fname").focus();
            }
            else if (lname == "") {
                alert("Empty Last Name");
                document.getElementById("lname").focus();
            }
            else {
                alert("Form Submitted Successfully");
                alert("First Name : " + fname + '\n' + "Last Name : " + lname);
            }
        }
    </script>
</body>

</html>
