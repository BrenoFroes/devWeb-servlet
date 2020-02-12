<%-- 
    Document   : criarInstrutor
    Created on : 11/02/2020, 13:45:39
    Author     : Breno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
<div class="container">
    <div class="text-center">
        <h3>ADICIONAR CURSO:</h3>
	<hr class="cursos">
        <form method="POST" action="../controller/CursoController">
            <div class="form-group">
              <label for="inputNomeM">Nome do curso:</label>
              <input type="text" class="form-control" id="inputNomeM" name="nome">
              <small id="nomeHelpM" class="form-text" ></small>
            </div>
            <div class="form-group">
                    <label for="inputNomeM">Requisito:</label>
                    <input type="text" class="form-control" id="inputRequisitoM" name="requisito">
                    <small id="requisitoHelpM" class="form-text"></small>
            </div>
            <div class="form-group">
              <label for="inputEmentaM">Ementa:</label>
              <textarea type="text" class="form-control" id="inputEmentaM" rows="3" name="ementa"></textarea>
              <small id="ementaHelpM" class="form-text"></small>
            </div>
            <div class="form-group">
                    <label for="inputCargaM">Carga horária (h):</label>
                    <input type="number" class="form-control" id="inputCargaM" name="cargaHoraria">
                    <small id="cargaHelpM" class="form-text"></small>
            </div>
            <div class="form-group">
                    <label for="inputPrecoM">Preço (R$):</label>
                    <input type="number" class="form-control" id="inputPrecoM" name="preco">
                    <small id="precoHelpM" class="form-text"></small>
            </div>
            <button type="submit" class="btn btn-primary ml-3" style="float: right;">Salvar</button>
            <button type="button" class="btn btn-outline-danger" data-dismiss="modal" style="float: right;">Cancelar</button>

    </form>
    </div>
</div>


<%@include file="foot.jsp" %>
