<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Page</title>
</head>
<body>

    <form action="login" method="post">
        <label for="input1">Enter first value:</label>
        <input type="text" id="input1" name="input1" required>
        <br><br>

        <label for="input2">Enter second value:</label>
        <input type="text" id="input2" name="input2" required>
        <br><br>

        <button type="submit">Submit</button>
    </form>

</body>
</html>
