<%@ include file="table_creation_p_db.jsp" %>
<%@page import="java.sql.*,place.*" %>
<%
   String email=request.getParameter("email");
   String name=request.getParameter("name"); 
   String subject=request.getParameter("subject");
   String message=request.getParameter("message");
  
   try
   {
	   Connection con=ConnectionProvider.getCon();
       PreparedStatement pst=con.prepareStatement("insert into contact_index values(?,?,?,?)");
       pst.setString(1,email);      
       pst.setString(2,name);       
       pst.setString(3,subject);       
       pst.setString(4,message);
       pst.execute();
       response.sendRedirect("index.jsp?msg=Your message has been sent.Thank you!");
       con.close();    
   }
   
   catch(Exception e)
   {
	  out.println(e);   
   }

%>