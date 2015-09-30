   <jsp:include page="/header.jsp" />
   
   <tr id="staticContent" name="staticContent">
	<td id="1" ><img alt="Keep it simple" src="images/simply.jpg"></td>
	<td id="2"><img alt="We are reliable" src="images/reliable.jpg"></td>
	<td id="3"><img alt="Its there for me" src="images/forme.jpg"></td>   
   </tr>
      <tr name="content" >
      <td colspan="3" style="height:200px">
      <h2>Dashboard to check the status of a request</h2>
   <form action="checkStatus">
      <label for="name">Please enter the request id</label><br/>
      <input type="text" name="request"/>
      <input type="submit" value="Check Status"/>
   </form></td></tr>
   
   <jsp:include page="footer.jsp"/>
   
