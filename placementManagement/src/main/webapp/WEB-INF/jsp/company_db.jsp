<%@page import="java.sql.*,place.*" %>
<%
   String company_id=request.getParameter("company_id");
   String company_name=request.getParameter("company_name");
   String website=request.getParameter("website");
   String designation=request.getParameter("designation");
   String degree=request.getParameter("degree");
   String bond=request.getParameter("Bond");
   String timings=request.getParameter("timings");
   String cutoff=request.getParameter("cutoff");
   String joining=request.getParameter("joining");
   String venue=request.getParameter("venue");
   String email=request.getParameter("email");
   String datetime=request.getParameter("datetime");
   String Description=request.getParameter("Description");
   try
   {
	  Connection con=ConnectionProvider.getCon();
       PreparedStatement pst=con.prepareStatement("insert into company_db values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
       pst.setString(1,company_id);
       pst.setString(2,company_name);
       pst.setString(3,website);
       pst.setString(4,designation);
       pst.setString(5,degree);
       pst.setString(6,bond);
       pst.setString(7,timings);
       pst.setString(8,cutoff); 
       pst.setString(9,joining); 
       pst.setString(10,venue); 
       pst.setString(11,email); 
       pst.setString(12,datetime); 
       pst.setString(13,Description);   
       pst.execute();
       response.sendRedirect("companyregistration1.jsp?msg=	Successfully Added Company Details");
       con.close();    
   }
   
   catch(Exception e)
   {
	  out.println(e);   
   }

%>