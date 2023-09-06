<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 06/09/2023
  Time: 12:19
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="prenomA" type="java.lang.String" scope="request"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ include file ="/bootStrapimport.html"%>
    <title>Title</title>
</head>
<body>
    <main>
        <p>
            Mon prénom est <%= prenomA.toUpperCase()%>
        </p>
    </main>

</body>
</html>
