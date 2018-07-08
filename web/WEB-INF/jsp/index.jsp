<%-- 
    Document   : index
    Created on : 07/07/2018, 09:55:20
    Author     : denis
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<c:url value="resources/css/bootstrap.css"/>" rel="stylesheet" type="text/css"/>
        <title>Usuário Cadastrado</title>
    </head>
    <body>
        <h3 class="text-center">Olá ${nome},<br> obrigado por Cadastrar!!!</h3><br /><br />
        
            <div class="container">
                <div class="text-center">
                    <a href="cadastro" class="btn btn-link">Cadastro de Usuário</a>
                    <a href="exibir" class="btn btn-link">Listar Usúarios Cadastrado</a>
                </div>
            </div>    
                    
    </body>
</html>
