<html>
  <head>
<title>Log In Form</title>
  
  <meta charset="utf-8">
<meta content="width=device-width, initial-scale=1.0" name="viewport">
  <meta content="" name="keywords">
  <meta content="" name="description">
 <link rel="stylesheet" href="css/font-awesome.min.css">
     <link rel="stylesheet" href="css/bootstrap.css">
    <!-- Bootstrap CSS File -->
  <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Libraries CSS Files -->
  <link href="lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <link href="lib/animate/animate.min.css" rel="stylesheet">
  <link href="lib/ionicons/css/ionicons.min.css" rel="stylesheet">
  <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
  <link href="lib/lightbox/css/lightbox.min.css" rel="stylesheet">

  <!-- Main Stylesheet File -->
  <link href="style1.css" rel="stylesheet">

  </head>
    <%
  String msg=request.getParameter("msg");
if(msg!=null)
{
	System.out.println("<html><body>");
	System.out.println("<center><font color=green size=5 text-align=center>"+msg);
	System.out.println("</font></center>");
	System.out.println("</body></html>");
}
%>
<body id="LoginForm">
<div class="container">
<h1 class="form-heading"><center>Sharda University</center></h1>
<div class="login-form">
<div class="main-div">
    <div class="panel">
   <h2> Login Form</h2>
   </div>
    <form id="Login" action="login_check.jsp">

        <div class="form-group">


            <input type="text" class="form-control" name="name" id="inputName" placeholder="Username">

        </div>

        <div class="form-group">

            <input type="password" class="form-control" name="pass" id="inputPassword" placeholder="Password">

        </div>
         <div class="form-check"><br>
    <label class="form-check-label">
      <input class="form-check-input" type="checkbox"> Remember me
    </label>
    <b class="ml-5">Type:</b>
    <select name="type" required>
    <option value="Admin">Admin</option>
      <option value="Student">Student</option>
      <option value="Placement">Placement</option>
      
  </select><br><br>
  </div>
        <div class="forgot">
        <a href="reset.html">Forgot password?</a>
</div>
        <button type="submit" class="btn btn-Success">Login</button>

    </form>
    </div>
     <div class="botto-text">  Designed by <a href="#">B.Tech Students</a></div>
</div>
</div>
</body>
</html>
