<%-- 
    Document   : CadastroUsu
    Created on : 27/09/2017, 04:16:08
    Author     : Victor M
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<c:url value="resources/css/bootstrap.css" />" rel="stylesheet" type="text/css"/>
        <title>Cadastrar Usuários</title>
    </head>
    <body>


        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index">Inicio</a>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="index">Usuarios<span class="sr-only">(current)</span></a></li>
                    </ul>

                    <ul class="nav navbar-nav navbar-right">

                    </ul>
                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>



















        <div class="container">
            <h1>Cadastrar Usuários</h1>
            <form id="form" action="salva" method="POST" commandName="">
                <div class="form-group">
                    Nome:
                    <input class="form-control" type="text" name="nome" id="nome" required="" placeholder="Nome" />
                </div>
                <div class="form-group">
                    Sobrenome:
                    <input class="form-control" type="text" name="sobrenome" id="sobrenome" required="" placeholder="Usuário" />
                </div>
                <div class="form-group">
                    Nascimento:
                    <input class="form-control" type="text" name="nascimento" id="nascimento" required="" placeholder="Senha" />
                </div>
                <div class="form-group">
                    Sexo:
                    <input class="form-control" type="text" name="sexo" id="sexo" required="" placeholder="Senha" />
                </div>
                <div class="form-group">
                    Telefone:
                    <input class="form-control" type="text" name="telefone" id="telefone" required="" placeholder="Senha" />
                </div>
                <div class="form-group">
                    Endereço:
                    <input class="form-control" type="text" name="endereco" id="endereco" required="" placeholder="Senha" />
                </div>
                <input class="btn btn-primary" type="submit" value="Cadastrar" />
            </form>

            <!--
            <div class="container">
                <table class="table">
                    <thead class="thead-inverse">
                        <tr>
                            <th>Código</th>
                            <th>Nome</th>
                            <th>Usuário</th>
                            <th>Nível de Acesso</th>
                        </tr>
                    </thead-->
                    <!-- c:forEach items="${lista}" var="atributo">
                        <tr>
                            <th>${atributo.idUsuario}</th>
                            <td>${atributo.nomeUsuario}</td>
                            <td>${atributo.usuario}</td>
                            <td>${atributo.nivelAcesso}</td>
                            <td><a class="btn btn-warning btn-xs"  href="#" data-toggle="modal" data-target="#delete-modal">
                                    Editar
                                </a>  <a class="btn btn-danger btn-xs"  href="#" data-toggle="modal" data-target="#delete-modal">
                                    Excluir
                                </a>
                            </td>
                        </tr-->
                    <!-- /c:forEach>
                </table>
            </div-->


        </div>
    </body>
</html>
