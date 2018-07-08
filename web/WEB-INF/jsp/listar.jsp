<%-- 
    Document   : listar
    Created on : 07/07/2018, 15:04:44
    Author     : denis
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<c:url value="resources/css/bootstrap.css"/>" rel="stylesheet" type="text/css"/>
        <title>Listar Cadastros</title>
    </head>
    <body>
        <div class="container">
            
            <table class="table">
                <thred>
                    <tr>
                        <th>Nome</th>
                        <th>Endereço</th>
                        <th>Telefone</th>
                        <th>E-mail</th>
                        <th>Senha</th>
                    </tr>
                </thred>
                <tbody>
                    <c:forEach items = "${lista}" var="atributo">
                        
                        <tr>
                            <td>${atributo.nome}</td>
                            <td>${atributo.endereco}</td>
                            <td>${atributo.telefone}</td>
                            <td>${atributo.email}</td>
                            <td>${atributo.senha}</td>
                        </tr>
                        
                    </c:forEach>
                </tbody>
            </table>
            
        </div>
    </body>
</html>
