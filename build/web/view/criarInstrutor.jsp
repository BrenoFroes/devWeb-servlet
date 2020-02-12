<%-- 
    Document   : criarInstrutor
    Created on : 11/02/2020, 13:45:39
    Author     : Breno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
<div class="container my-2 py-3">
    <div class="text-center">
        <h3>ADICIONAR INSTRUTOR:</h3>
	<hr class="cursos">
        <form method="POST" action="../controller/InstrutorController" onsubmit="adicionarInstrutor(this)">
            <div class="form-group">
                <label for="inputNomeM">Nome:</label>
                <input type="text" class="form-control" id="inputNomeM" name="nome">
                <small id="nomeHelpM" class="form-text"></small>
            </div>
            <div class="form-group">
                <label for="inputEmailM">E-mail:</label>
                <input type="text" class="form-control" id="inputEmailM" name="email">
                <small id="emailHelpM" class="form-text"></small>
            </div>
            <div class="form-group">
                <label for="inputHoraM">Valor hora (R$):</label>
                <input type="number" class="form-control" id="inputHoraM" name="hora">
                <small id="horaHelpM" class="form-text"></small>
            </div>
            <div class="form-group">
                <label for="inputLoginM">Login:</label>
                <input type="text" class="form-control" id="inputLoginM" name="login">
                <small id="loginHelpM" class="form-text"></small>
            </div>
            <div class="form-group">
                <label for="inputSenhaM">Senha:</label>
                <input type="password" class="form-control" id="inputSenhaM" name="senha">
                <small id="senhaHelpM" class="form-text" type="password"></small>
            </div>
            <div class="form-group">
                <label for="inputExperienciaM">Experiência:</label>
                <textarea type="text" class="form-control" id="inputExperienciaM" rows="3" name="experiencia"></textarea>
                <small id="experienciaHelpM" class="form-text"></small>
            </div>
            <button type="submit" class="btn btn-primary ml-3" style="float: right;">Salvar</button>
            <button type="button" class="btn btn-outline-danger" data-dismiss="modal" style="float: right;">Cancelar</button>

        </form>
    </div>
</div>


<%@include file="foot.jsp" %>
