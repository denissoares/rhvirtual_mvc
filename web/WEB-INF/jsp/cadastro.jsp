<%-- 
    Document   : cadastro
    Created on : 07/07/2018, 10:18:59
    Author     : denis
--%>


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<c:url value="resources/css/bootstrap.css"/>" rel="stylesheet" type="text/css"/>
        <link href="<c:url value="resources/css/style.css"/>" rel="stylesheet" type="text/css"/>
        <title>Cadastro Funcionário</title>
    </head>
    <body>
        <div class="container">
            <div class="col-md-6 cadastro">
                <h1 class="text-center">Cadastro Funcionário</h1><br/>
                <form action="index" method="POST">
                        <div class="form-group">
                            Nome
                            <input type="text" name="nome" id="nome" class="form-control" required>           
                        </div>

                        <div class="form-group">
                            Endereço
                            <input type="text" name="endereco" id="endereco" class="form-control" required>           
                        </div>

                        <div class="form-group">
                            Telefone
                            <input type="int" name="telefone" id="telefone" class="form-control" required>           
                        </div>

                        <div class="form-group">
                            E-mail
                            <input type="email" name="email" id="email" class="form-control" required>           
                        </div>
                    
                        <div class="form-group">
                            Senha
                            <input type="tetxt" name="senha" id="senha" class="form-control" required>           
                        </div><br /> 

                        <div class="text-center">
                            <input type="submit" id="submit" class=" btn btn-primary" value="Cadastrar Funcionário">           
                        </div><br /><br /><br />
                        
                        <div class="text-center">
                            <a href="exibir" class="btn btn-link">Listar Usúarios Cadastrado</a>
                        </div>
                       
                    </form>
            </div>
        </div>
        
    </body>
</html>
