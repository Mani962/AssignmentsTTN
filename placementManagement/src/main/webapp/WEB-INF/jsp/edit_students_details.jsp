 <%@page import="java.sql.*,place.*" %>
<div class="container">

<div class="row">
<div class="col-sm-8">
<% 
 String system_id=request.getParameter("system_id");
Connection con=ConnectionProvider.getCon();
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from updateprofile_db where system_id="+system_id);

if(rs.next())
{
%>
<a href="all_students_details.jsp">&#10094; BACK</a>
  <form action="edit_student_details_db.jsp" method="post">
           <div class="form-row">
  
        <div class="form-group col-md-6">
           <label for="name">Username</label>
            <input type="text" class="form-control" name="username" placeholder="UserName" value="<%=rs.getString(1) %>">

        </div>
        <div class="form-group col-md-6">
<label for="name">System Id</label>
           
            <input type="number" class="form-control" name="system_id" placeholder="SystemId" maxlength="10" readonly value="<%=rs.getString(2) %>">

        </div>
      </div>

        <div class="form-row">
        <div class="form-group col-md-4">
        <label for="name">Roll No</label>
           
            <input type="number" class="form-control" name="rollno" placeholder="Roll no" maxlength="10" value="<%=rs.getString(3) %>">

        </div>

        <div class="form-group col-md-4">
<label for="name">Course</label>
           

            <input type="text" class="form-control" name="course" placeholder="Course" value="<%=rs.getString(4) %>">

        </div>
  
         <div class="form-group col-md-4">
<label for="name">Branch</label>
        <input type="text" class="form-control" name="branch" placeholder="Branch" value="<%=rs.getString(5) %>">

        </div>
      </div>
        <div class="form-row">
          <div class="form-group col-md-4">
    <label for="sectionchange">Section</label>
    <select class="form-control" name="section" value="<%=rs.getString(6) %>">
      <option>A</option>
      <option>B</option>
      <option>C</option>
      <option>D</option>
    </select>
  </div>
         <div class="form-group col-md-4">
<label for="name">Phone  number</label>
        <input type="tel" maxlength="10" class="form-control" name="phonenumber" placeholder="phonenumber" value="<%=rs.getString(7) %>">

</div>

</div>
  <div class="form-row">
             <div class="form-group col-md-4">
<label for="name">10th percentage</label>
        <input type="text" class="form-control" name="ten" placeholder="10th percentage" value="<%=rs.getString(8) %>">

        </div>
         <div class="form-group col-md-4">
<label for="name">12th percentage</label>
        <input type="text" class="form-control" name="twelve" placeholder="12th percentage" value="<%=rs.getString(9) %>">

        </div>
         <div class="form-group col-md-4">
<label for="name">Btech CGPA</label>
        <input type="text" class="form-control" name="btech" placeholder="Btech CGPA" value="<%=rs.getString(10) %>">

        </div>
      </div>
      <div class="form-row">
         <div class="form-group col-md-6">
<label for="name">Backlogs</label>
        <input type="number" class="form-control" name="backlogs" placeholder="Backlogs" value="<%=rs.getString(11) %>">

        </div>
       <div class="form-group col-md-6">
  <label for="exampleInputEmail1">Email address</label>

            <input type="email" class="form-control" name="email" placeholder="Email Address" value="<%=rs.getString(12) %>">

        </div>

</div>
          <button type="submit" class="btn btn-Success">Update</button>

    </form>
<%
}
con.close();
%>

</div>
</div>
<div class="row">
   <div class="col-sm-4">
   </div>
</div>
</div>
