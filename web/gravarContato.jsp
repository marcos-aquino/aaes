<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%--
The taglib directive below imports the JSTL library. If you uncomment it,
you must also add the JSTL library to the project. The Add Library... action
on Libraries node in Projects view can be used to add the JSTL 1.1 library.
--%>
<%--
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
--%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gravar contato</title>
    </head>
    <body>

    <h1>Cadastro de Contatos</h1>
    <form action="FrontController?action=GravarContato" method="post">
      Entre com seu nome
      <input type="text" name="textNome"/><br/>
      Entre com seu email
      <input type="text" name="textEmail"/><br/>
      Escolha a empresa:
      <select name="codigoEmp">
        <c:forEach items="${empresas}" var="emp">
            <option value="${emp.codigo}"> ${emp.nome} </option>
        </c:forEach>
      </select>
      <br>
      <input type="submit"/>
    </form>
    
    <%--
    This example uses JSTL, uncomment the taglib directive above.
    To test, display the page like this: index.jsp?sayHello=true&name=Murphy
    --%>
    <%--
    <c:if test="${param.sayHello}">
        <!-- Let's welcome the user ${param.name} -->
        Hello ${param.name}!
    </c:if>
    --%>
    
    </body>
</html>
