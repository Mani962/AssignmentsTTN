<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<center>
    <form method="post" action="/student/submitForm.html">
        <label>Firstname</label>
        <input name="firstname" type="text">
        <br>
        <br>
        <label>Lastname</label>
        <input name="lastname" type="text">
        <br>
        <br>
        <input type="submit">
        <br><br>
        <hr>
        ${heading}
    </form>
</center>
</body>
</html>