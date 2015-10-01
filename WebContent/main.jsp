   <%@ taglib prefix="s" uri="/struts-tags"%>
   <jsp:include page="/header.jsp" />
   
   <tr id="staticContent" name="staticContent">
	<td id="1" ><img alt="Keep it simple" src=""></td>
	<td id="2"><img alt="We are reliable" src=""></td>
	<td id="3"><img alt="Its there for me" src=""></td>   
   </tr>
      <tr name="content" >
      <td colspan="3" style="height: 140px">
      <h2>Dashboard to check the status of a request</h2>
   <form action="checkStatus">
      <label for="name">Please enter the request id</label><br/>
      <input type="text" name="request"/>
      <input type="submit" value="Check Status"/>
   </form></td></tr>
   <tr >
      <td colspan="3" style="height:25px">
      <s:property value="message"/></td></tr>
   <jsp:include page="footer.jsp"/>
   
