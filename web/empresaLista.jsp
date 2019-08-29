<%-- 
    Document   : empresaLista
    Created on : Aug 22, 2019, 10:26:20 PM
    Author     : pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ler empresa</title>
    </head>
    <body>
        <h1>Código da empresa: <%= request.getParameter("codigo") %> </h1>
    </body>
</html>
