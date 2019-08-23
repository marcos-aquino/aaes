<%-- 
    Document   : contatoLista
    Created on : Aug 20, 2019, 10:35:28 PM
    Author     : pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ler contato</title>
    </head>
    <body>
        <h1>Nome do contato: <%= request.getParameter("nome") %> </h1>
    </body>
</html>
