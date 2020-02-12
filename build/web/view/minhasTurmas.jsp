<%-- 
    Document   : comentarios
    Created on : 08/02/2020, 14:23:41
    Author     : Breno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
	<div class="container-fluid mt-5 py-2">
        <div class="text-center">
            <h3>TURMAS</h3>
            <div class="row">
                <div class="col-12 col-sm-3">
                  <div class="card cardTurmas bg-secondary">
                    <div class="card-body">
                      <h5 class="card-title" name="nome">Informática</h5>
                      <hr>
                      <p class="card-text" name="comentario">Ótimo curso, aprendi muito.<br>
                          <a href="#" data-toggle="modal" data-target="#modalComentario">(editar comentário)</a>
                      </p>
                      <p class="card-text" name="nota">6,5</p>
                      <p class="card-text" name="cargaHoraria">60h</p>
                    </div>
                  </div>
                </div>
            </div>
        </div>
    </div>
	<!-- Modal -->
	<div class="modal fade" id="modalComentario" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
		<div class="modal-content">
		<div class="modal-header">
			<h5 class="modal-title" id="exampleModalLabel">Entre com as informações:</h5>
			<button type="button" class="close" data-dismiss="modal" aria-label="Close">
			<span aria-hidden="true">&times;</span>
			</button>
		</div>
		<div class="modal-body">
			<form method="POST" action="../controller/CursoController">
				<div class="form-group">
				  <label for="inputComentarioM" style="color: black;">Comentário:</label>
				  <input class="form-control" id="inputComentarioM" name="comentario">
				  <small id="comentarioHelpM" class="form-text" ></small>
				</div>
				<button type="submit" class="btn btn-primary ml-3" style="float: right;">Enviar</button>
				<button type="button" class="btn btn-outline-danger" data-dismiss="modal" style="float: right;">Cancelar</button>
				
			</form>
		</div>
            </div>
	</div>
<%@include file="foot.jsp"%>
