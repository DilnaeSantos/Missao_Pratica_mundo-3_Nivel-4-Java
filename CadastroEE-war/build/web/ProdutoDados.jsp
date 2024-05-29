<%-- 
    Document   : ProdutoDados
    Created on : 29 de mai. de 2024, 13:45:18
    Author     : Dilnae
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Dados do Produto</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/5.3.0/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
            padding: 20px;
        }

        .container {
            background-color: #fff;
            border-radius: 8px;
            padding: 20px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }

        h1 {
            color: #343a40;
        }
    </style>
</head>
<body class="container"> <!-- Adicionando a classe container ao body -->
    <div>
        <h1>Dados do Produto</h1>
        <form class="form" action="ServletProdutoFC" method="post"> <!-- Adicionando a classe form -->
            <input type="hidden" name="acao" value="${produto == null ? 'incluir' : 'alterar'}">
            <c:if test="${produto != null}">
                <input type="hidden" name="id" value="${produto.id}">
            </c:if>
            <div class="mb-3"> <!-- Adicionando a classe mb-3 -->
                <label class="form-label" for="nome">Nome:</label> <!-- Adicionando a classe form-label -->
                <input type="text" class="form-control" id="nome" name="nome" value="${produto != null ? produto.nome : ''}"> <!-- Adicionando a classe form-control -->
            </div>
            <div class="mb-3"> <!-- Adicionando a classe mb-3 -->
                <label class="form-label" for="quantidade">Quantidade:</label> <!-- Adicionando a classe form-label -->
                <input type="text" class="form-control" id="quantidade" name="quantidade" value="${produto != null ? produto.quantidade : ''}"> <!-- Adicionando a classe form-control -->
            </div>
            <div class="mb-3"> <!-- Adicionando a classe mb-3 -->
                <label class="form-label" for="precoVenda">Preço Venda:</label> <!-- Adicionando a classe form-label -->
                <input type="text" class="form-control" id="precoVenda" name="precoVenda" value="${produto != null ? produto.precoVenda : ''}"> <!-- Adicionando a classe form-control -->
            </div>
            <div>
                <input type="submit" class="btn btn-primary" value="${produto == null ? 'Incluir Produto' : 'Alterar Produto'}"> <!-- Adicionando as classes btn e btn-primary -->
            </div>
        </form>
        <a href="ServletProdutoFC?acao=listar">Cancelar</a>
    </div>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/5.3.0/js/bootstrap.bundle.min.js"></script>
</body>
</html>
