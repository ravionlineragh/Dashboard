     <%@ taglib prefix="s" uri="/struts-tags"%>
     <jsp:include page="/header.jsp" />
     
     <tr name="content">
      <td colspan="3" height="180px">  <h1>Request status</h1>
   		<span><s:property escape="false" value="imageid"/></span>
   		</td></tr>
   		<tr><td colspan="3">
   		<s:property escape="false" value="message"/>
   		</td></tr>
   <jsp:include page="footer.jsp"/>