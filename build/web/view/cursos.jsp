<%-- 
    Document   : cursos
    Created on : 07/02/2020, 17:59:33
    Author     : Breno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
	<div class="container-fluid mt-5">
        <div class="text-center">
            <h3>CURSOS</h3>
			<hr class="cursos">
			<a href="criarCurso.jsp" class="btn btn-lg btn-light addCurso">
				<i class="fa fa-plus mr-1"></i>
				cadastrar curso
			</a>
			<div class="container pl-5 pb-5">
				<div class="row">
					<div class="col-12 col-sm-3">
						<div class="card bg-secondary mt-3">
							<img src="images/audio-england-great-britain-headphone-3084.jpg" class="card-img-top" alt="curso de ingles">
							<div class="card-body">
							  <h5 class="card-title">Língua Inglesa</h5>
							  <hr>
							  <p class="card-text">Este é o curso que você precisa para aprender inglês de forma descomplicada e rápida.</p>
							  <hr>
								<a href="#" class="btn btn-primary matricularSe">Matricular-se</a>
							</div>
						</div>
					</div>
					<div class="col-12 col-sm-3">
						<div class="card bg-secondary mt-3">
							<img src="images/sky-blue-windy-flag-54097.jpg" class="card-img-top" alt="curso de ingles">
							<div class="card-body">
								<h5 class="card-title">Língua Espanhola</h5>
								<hr>
								<p class="card-text">Um curso para quem precisa aprender espanhol de forma mais eficiente e completa.</p>
								<hr>
								<a href="#" class="btn btn-primary matricularSe">Matricular-se</a>						
							</div>
						</div>
					</div>
					<div class="col-12 col-sm-3">
						<div class="card bg-secondary mt-3">
							<img src="images/blur-close-up-code-computer-546819 (1).jpg" class="card-img-top" alt="curso de ingles">
								<div class="card-body">
								<h5 class="card-title">Informática</h5>
								<hr>
								<p class="card-text">O curso para quem busca se atualizar e compreender mais sobre tecnologia.</p>
								<hr>
								<a href="#" class="btn btn-primary matricularSe">Matricular-se</a>
							</div>
						</div>
					</div>
				</div>
			</div>
        </div>
    </div>
<%@include file="foot.jsp" %>
