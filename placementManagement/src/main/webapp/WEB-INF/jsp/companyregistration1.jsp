<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Company Registration</title>
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
</head>
<body>

<%
  String msg=request.getParameter("msg");
if(msg!=null)
{
	out.println("<html><body>");
	out.println("<center><font color=green size=5 text-align=center>"+msg);
	out.println("</font></center>");
	out.println("</body></html>");
}
%>
<div class="container">
<h1>ADD <span class="color">COMPANY DETAILS</span></h1><a href="allcompanyinfo.jsp">&#10094; BACK</a>  
      
       <form action="company_db.jsp" method="post">
  
           <div class="form-row">
          <div class="form-group col-md-4">
           <label for="name">Company ID</label>
            <input type="text" class="form-control" name="company_id" placeholder="companyId">

        </div>
        
        <div class="form-group col-md-4">
           <label for="name">Company Name</label>
            <input type="text" class="form-control" name="company_name" placeholder="companyName">

        </div>
        <div class="form-group col-md-4">
        <label for="name">Company  Website</label>
           <input type="text" class="form-control" name="website" placeholder="company website">

        </div>
      </div>

        <div class="form-row">
        <div class="form-group col-md-4">
        <label for="name">Designation</label>
           
            <input type="text" class="form-control" name="designation" placeholder="designation" >

        </div>

        <div class="form-group col-md-4">
<label for="">Target Degree and Branches</label>
           

            <input type="text" class="form-control" name="degree" placeholder="Target Degree and Branches">

        </div>
  
         <div class="form-group col-md-4">
         <label for="name">Bond</label>
        <input type="text" class="form-control" name="Bond" placeholder="Bond">

        </div>
      </div>
     <div class="form-group">
<label for="name">Shift-Timings</label>
        <textarea class="form-control" rows="4" name="timings" placeholder="shift timings"></textarea>
</div>
  <div class="form-row">
             <div class="form-group col-md-6">
<label for="name">Percentage Cut-off</label>
        <input type="text" class="form-control" name="cutoff" placeholder="Percentage Cut-off">
        </div>
         <div class="form-group col-md-6">
<label for="name">Joining</label>
        <input type="text" class="form-control" name="joining" placeholder="Joining">
        </div>
    </div>
    <div class="form-row">
     <div class="form-group col-md-6">
<label for="name">Venue</label>
        <input type="text" class="form-control" name="venue" placeholder="venue">

        </div>
        
       <div class="form-group col-md-6">
  <label for="name">Company Email address</label>

            <input type="email" class="form-control" name="email" placeholder=" company Email Address">

        </div>
 </div>
 <div class="form-row">
          <div class="form-group col-md-4">
<label for="name">Campus Date & Time</label>
        <input type="text" class="form-control" name="datetime" placeholder="Campus Date & Time">
        </div>

 <div class="form-group col-md-8">
<label for="name">Job Description</label>
        <textarea class="form-control" rows="5" name="Description" placeholder="Description"></textarea>
</div>
</div>
     <div class="form-row">
        <div class="form-group col-md-6">
         <button type="submit" class="btn btn-success">Submit</button> 
         </div>
        <div class="form-group col-md-6">
         <button type="reset" class="btn btn-success" >Reset</button>
         </div>
</div> 
 </form>
 
 </div>
</body>
</html>