<%-- 
    Document   : instrutores.jsp
    Created on : 08/02/2020, 14:36:27
    Author     : Breno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>

    <div class="container-fluid mt-5">
        <div class="text-center">
            <h2>INSTRUTORES</h2>
			<hr class="cursos">
			<button class="btn btn-lg btn-light addCurso" data-toggle="modal" data-target="#modalInstrutor">
				<i class="fa fa-plus mr-1 mb-0"></i>
				cadastrar instrutor
			</button>
			<a href="turma.html">
				<button class="btn btn-lg btn-secondary addTurma">
					<i class="fa fa-plus mr-1"></i>
					abrir turma
				</button>
			</a>
			
			<div class="container pl-5 pb-5">
				<div class="row no-gutters">

					<div class="col-12 col-sm-12 col-lg-4">
						<div class="card bg-secondary mt-3" style="width: 18rem;">
							<img src="../images/kowada.jpg" class="card-img-top" alt="Luis">
							<div class="card-body">
								<h5 class="card-title">Luis Antonio Kowada</h5>
								<hr>
								<p class="card-text">Doutor em Engenharia de Sistemas e Computação pela UFRJ.</p>
								<a href="#" class="btn btn-info">Visualizar</a>
							</div>
						</div>
					</div>

						<div class="col-12 col-sm-12 col-lg-4">
							<div class="card bg-secondary mt-3" style="width: 18rem;">
								<img src="../images/flavio.jpg" class="card-img-top" alt="Flavio">
								<div class="card-body">
									<h5 class="card-title">Flavio Seixas</h5>
									<hr>
									<p class="card-text">Obteve Doutorado em Ciência da Computação, e mestrado em Engenharia de Telecomunicações, ambos pela UFF.</p>
									<a href="#" class="btn btn-info">Visualizar</a>
								</div>
							</div>
						</div>

						<div class="col-12 col-sm-12 col-lg-4">
							<div class="card bg-secondary mt-3" style="width: 18rem;">
								<img src="../images/lauro.png" class="card-img-top" alt="Lauro">
								<div class="card-body">
									<h5 class="card-title">Lauro</h5>
									<hr>
									<p class="card-text">Lauro Eduardo Kozovits possui um D.Sc. e um M.S. formado em Ciência da Computação e bacharel em Direito.</p>
									<a href="#" class="btn btn-info">Visualizar</a>
								</div>
							</div>
						</div>

				</div>
			</div>
		</div>
	</div>
	<!-- Modal -->
	<div class="modal fade" id="modalInstrutor" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
		<div class="modal-content">
		<div class="modal-header">
			<h5 class="modal-title" id="exampleModalLabel">Entre com seus dados:</h5>
			<button type="button" class="close" data-dismiss="modal" aria-label="Close">
			<span aria-hidden="true">&times;</span>
			</button>
		</div>
		<div class="modal-body">
			<form action="#" onsubmit="adicionarInstrutor(this)">
				<div class="form-group">
                                    <label for="inputNomeM">Nome:</label>
                                    <input class="form-control" id="inputNomeM" name="nome">
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
                                    <input class="form-control" id="inputLoginM" name="login">
                                    <small id="loginHelpM" class="form-text"></small>
				</div>
				<div class="form-group">
                                    <label for="inputSenhaM">Senha:</label>
                                    <input type="password" class="form-control" id="inputSenhaM" name="senha">
                                    <small id="senhaHelpM" class="form-text" type="password"></small>
				</div>
				<button type="submit" class="btn btn-primary ml-3" style="float: right;">Salvar</button>
				<button type="button" class="btn btn-outline-danger" data-dismiss="modal" style="float: right;">Cancelar</button>
				
			</form>
		</div>
	</div>
	</div>
<%@include file="foot.jsp" %>