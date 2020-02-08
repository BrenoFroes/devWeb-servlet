<%-- 
    Document   : instrutores.jsp
    Created on : 08/02/2020, 14:36:27
    Author     : Breno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>

    <div class="container mt-5 px-5">
        <div class="text-center">
            <h2>TABELAS	</h2>
			<hr class="cursos">
			<a class="link" href="cursos.jsp">
				<button class="btn btn-block my-3 btn-secondary btn-lg tabelaCurso">
					<i class="fa fa-plus mr-1"></i>
					cadastrar curso
				</button>
			</a>
			<a class="link" href="instrutores.jsp">
				<button class="btn btn-block my-3 btn-secondary btn-lg tabelaInstrutor">
					<i class="fa fa-plus mr-1"></i>
					cadastrar instrutor
				</button>
			</a>
			<a class="link" href="comentarios.jsp">
				<button class="btn btn-block my-3 btn-secondary btn-lg tabelaComentario">
					<i class="fa fa-plus mr-1"></i>
					adicionar comentários
				</button>
			</a>
			<a class="link" href="cadastrarAluno.jsp">
				<button class="btn btn-block my-3 btn-secondary btn-lg tabelaAluno">
					<i class="fa fa-plus mr-1"></i>
					cadastrar aluno
				</button>
			</a>
				<button class="btn btn-block my-3 btn-secondary btn-lg tabelaMatricula" data-toggle="modal" data-target="#modalMatricula">
					<i class="fa fa-plus mr-1"></i>
					realizar matrículas
				</button>
			<a class="link" href="cadastroAdministrador.jsp">
				<button class="btn btn-block my-3 btn-secondary btn-lg tabelaAdmin">
					<i class="fa fa-plus mr-1"></i>
					cadastrar admin
				</button>
			</a>
			<a class="link" href="turmas.jsp">
				<button class="btn btn-block my-3 btn-secondary btn-lg tabelaAdmin">
					<i class="fa fa-plus mr-1"></i>
					adicionar turma
				</button>
			</a>
		</div>
	</div>
		<!-- Modal -->
		<div class="modal fade" id="modalMatricula" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
			<div class="modal-dialog" role="document">
			<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title" id="exampleModalLabel">Entre com as informações:</h5>
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
				<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body">
				<form action="#" onsubmit="adicionarMatricula(this)">
					<div class="form-group">
					  <label for="inputTurmaM">Turma:</label>
					  <input class="form-control" id="inputTurmaM" name="turma">
					  <small id="turmaHelpM" class="form-text"></small>
					</div>
					<div class="form-group">
						<label for="inputAlunoM">Aluno:</label>
						<input type="text" class="form-control" id="inputAlunoM" name="aluno">
						<small id="alunoHelpM" class="form-text"></small>
					</div>
					<div class="form-group">
					  <label for="inputNotaM">Nota:</label>
					  <input class="form-control" id="inputNotaM" rows="3" name="nota"></textarea>
					  <small id="notaHelpM" class="form-text"></small>
					</div>
					<div class="form-group">
						<label for="inputDataM">Data:</label>
						<input type="date" class="form-control" id="inputDataM" name="data">
						<small id="dataHelpM" class="form-text"></small>
					</div>
					<button type="submit" class="btn btn-primary ml-3" style="float: right;">Salvar</button>
					<button type="button" class="btn btn-outline-danger" data-dismiss="modal" style="float: right;">Cancelar</button>
					
				</form>
			</div>
		</div>
<%@include file="foot.jsp" %>