<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
   <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Status check Dashboard</title>
</head>
<body>
   <h1>Dashboard to check the status of a request</h1>
   <form action="checkStatus">
      <label for="name">Please enter the request id</label><br/>
      <input type="text" name="request"/>
      <input type="submit" value="Check Status"/>
   </form>
</body>
</html>