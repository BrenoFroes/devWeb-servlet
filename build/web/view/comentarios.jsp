<%-- 
    Document   : comentarios
    Created on : 08/02/2020, 14:23:41
    Author     : Breno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
	<div class="container-fluid mt-5 py-2">
        <div class="text-center">
            <h2>COMENTÁRIOS</h2>
			<hr class="cursos">
			<button class="btn btn-lg btn-light addCurso" data-toggle="modal" data-target="#modalCurso">
				<i class="fa fa-plus mr-1"></i>
				adicionar comentário 
			</button>
			<div class="container pl-5">
				<div class="row">
                    <div class="row">
                        <div class="col-sm-6">
                          <div class="card cardComentario bg-secondary">
                            <div class="card-body">
                              <h5 class="card-title">Breno</h5>
                              <hr>
                              <p class="card-text">Ótimo curso, aprendi muito.</p>
                            </div>
                          </div>
                        </div>

                        <div class="col-sm-6">
                          <div class="card cardComentario bg-secondary">
                            <div class="card-body">
                              <h5 class="card-title">Rodolfo</h5>
                              <hr>
                              <p class="card-text">Informações muito completas.</p>
                            </div>
                          </div>
                        </div>
                    </div>
				</div>
			</div>
        </div>
    </div>
	<!-- Modal -->
	<div class="modal fade" id="modalCurso" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
		<div class="modal-content">
		<div class="modal-header">
			<h5 class="modal-title" id="exampleModalLabel">Entre com as informações:</h5>
			<button type="button" class="close" data-dismiss="modal" aria-label="Close">
			<span aria-hidden="true">&times;</span>
			</button>
		</div>
		<div class="modal-body">
			<form action="#" onsubmit="adicionarComentario(this)">
				<div class="form-group">
				  <label for="inputNomeM">Nome:</label>
				  <input class="form-control" id="inputNomeM"  name="nome">
				  <small id="nomeHelpM" class="form-text"></small>
				</div>
				<div class="form-group">
                                    <label for="inputComentarioM">Comentário:</label>
                                    <input type="text" class="form-control" id="inputComentarioM" name="comentario">
                                    <small id="comentarioHelpM" class="form-text"></small>
				</div>
				<button type="submit" class="btn btn-primary ml-3" style="float: right;">Salvar</button>
				<button type="button" class="btn btn-outline-danger" data-dismiss="modal" style="float: right;">Cancelar</button>
				
			</form>
		</div>
	</div>
	</div>
<%@include file="foot.jsp"%>
