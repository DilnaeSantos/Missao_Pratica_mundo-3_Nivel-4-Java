package cadastroee.servlets;

import javax.ejb.EJB;

import cadastroee.model.Produto;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServletProdutoFC", urlPatterns = {"/ServletProdutoFC"})
public class ServletProdutoFC extends HttpServlet {
    @EJB
    private ProdutoFacadeLocal facade;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acao = request.getParameter("acao");
        String destino = null;

        if ("listar".equals(acao)) {
            List<Produto> produtos = facade.findAll();
            request.setAttribute("produtos", produtos);
            destino = "ProdutoLista.jsp";
        } else if ("formIncluir".equals(acao) || "formAlterar".equals(acao)) {
            if ("formAlterar".equals(acao)) {
                Long id = Long.parseLong(request.getParameter("id"));
                Produto produto = facade.find(id);
                request.setAttribute("produto", produto);
            }
            destino = "ProdutoDados.jsp";
        } else if ("incluir".equals(acao)) {
            Produto produto = new Produto();
            produto.setNome(request.getParameter("nome"));
            produto.setPrecoVenda(Float.parseFloat(request.getParameter("precoVenda")));
            facade.create(produto);
            List<Produto> produtos = facade.findAll();
            request.setAttribute("produtos", produtos);
            destino = "ProdutoLista.jsp";
        } else if ("alterar".equals(acao)) {
            Long id = Long.parseLong(request.getParameter("id"));
            Produto produto = facade.find(id);
            produto.setNome(request.getParameter("nome"));
            produto.setPrecoVenda(Float.parseFloat(request.getParameter("precoVenda")));
            facade.edit(produto);
            List<Produto> produtos = facade.findAll();
            request.setAttribute("produtos", produtos);
            destino = "ProdutoLista.jsp";
        } else if ("excluir".equals(acao)) {
            Long id = Long.parseLong(request.getParameter("id"));
            Produto produto = facade.find(id);
            facade.remove(produto);
            List<Produto> produtos = facade.findAll();
            request.setAttribute("produtos", produtos);
            destino = "ProdutoLista.jsp";
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(destino);
        dispatcher.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "ServletProdutoFC";
    }
}
