<%-- 
    Document   : turmas.jsp
    Created on : 08/02/2020, 14:40:38
    Author     : Breno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
    <div class="container mt-5 pb-5">
        <div class="text-center">
            <h2>ABRIR TURMA:</h2>
			<hr class="cursos">
			<form action="#" onsubmit="adicionarTurma(this)" style="color: white;">
				<div class="form-group">
				<label for="inputInstrutoresM">Instrutores:</label>
				<input class="form-control" id="inputInstrutoresM">
				<small id="instrutoresHelpM" class="form-text"></small>
				</div>
				<div class="form-group">
					<label for="inputCursosM">Cursos:</label>
					<input type="text" class="form-control" id="inputCursosM" name="cursos">
					<small id="cursosHelpM" class="form-text"></small>
				</div>
				<div class="form-group">
					<label for="inputDataIniM">Data de início:</label>
					<input type="date" class="form-control" id="inputDataIniM" name="dataInicio">
					<small id="dataIniHelpM" class="form-text"></small>
				</div>
				<div class="form-group">
					<label for="inputDataFinM">Data de fim:</label>
					<input type="date" class="form-control" id="inputDataFinM" name="dataFim">
					<small id="dataFinHelpM" class="form-text"></small>
				</div>
				<div class="form-group">
					<label for="inputCargaM">Carga horária (h):</label>
					<input type="number" class="form-control" id="inputCargaM" name="cargaHoraria">
					<small id="cargaHelpM" class="form-text"></small>
				</div>
				<button type="submit" class="btn btn-primary ml-3" style="float: right;">Salvar</button>
				<a href="tabelas.jsp">
                    <button type="button" class="btn btn-danger" data-dismiss="modal" style="float: right;">Voltar</button>
                </a>
				
			</form>
		</div>
	</div>
<%@include file="foot.jsp" %>