<%-- 
    Document   : cursos
    Created on : 07/02/2020, 17:59:33
    Author     : Breno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
	<div class="container-fluid mt-5">
        <div class="text-center">
            <h2>CURSOS</h2>
			<hr class="cursos">
			<button class="btn btn-lg btn-light addCurso" data-toggle="modal" data-target="#modalCurso">
				<i class="fa fa-plus mr-1"></i>
				cadastrar curso
			</button>
			<div class="container pl-5 pb-5">
				<div class="row">
					<div class="col-12 col-sm-12 col-lg-4">
						<div class="card bg-secondary mt-3" style="width: 18rem;">
							<img src="../images/audio-england-great-britain-headphone-3084.jpg" class="card-img-top" alt="curso de ingles">
							<div class="card-body">
							  <h5 class="card-title">Língua Inglesa</h5>
							  <hr>
							  <p class="card-text">Este é o curso que você precisa para aprender inglês de forma descomplicada e rápida.</p>
							  <a href="#" class="btn btn-info">Visualizar</a>
							</div>
						</div>
					</div>
					<div class="col-12 col-sm-12 col-lg-4">
						<div class="card bg-secondary mt-3" style="width: 18rem;">
							<img src="../images/sky-blue-windy-flag-54097.jpg" class="card-img-top" alt="curso de ingles">
							<div class="card-body">
								<h5 class="card-title">Língua Espanhola</h5>
								<hr>
								<p class="card-text">Um curso para quem precisa aprender espanhol de forma mais eficiente e completa.</p>
								<a href="#" class="btn btn-info">Visualizar</a>							
							</div>
						</div>
					</div>
					<div class="col-12 col-sm-12 col-lg-4">
						<div class="card bg-secondary mt-3" style="width: 18rem;">
							<img src="../images/blur-close-up-code-computer-546819 (1).jpg" class="card-img-top" alt="curso de ingles">
								<div class="card-body">
								<h5 class="card-title">Informática</h5>
								<hr>
								<p class="card-text">O curso para quem busca se atualizar e compreender mais sobre tecnologia.</p>
								<a href="#" class="btn btn-info">Visualizar</a>
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
			<form method="POST" action="../controller/CursoController">
				<div class="form-group">
				  <label for="inputNomeM">Nome do curso:</label>
				  <input class="form-control" id="inputNomeM" name="nome">
				  <small id="nomeHelpM" class="form-text" ></small>
				</div>
                                <div class="form-group">
                                    <label for="inputNomeM">Requisito:</label>
                                    <input type="text" class="form-control" id="inputRequisitoM" name="requisito">
                                    <small id="requisitoHelpM" class="form-text"></small>
				</div>
				<div class="form-group">
				  <label for="inputEmentaM">Ementa:</label>
				  <textarea class="form-control" id="inputEmentaM" rows="3" name="ementa"></textarea>
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
	</div>
<%@include file="foot.jsp" %>
