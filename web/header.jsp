<%-- 
    Document   : header
    Created on : 05/02/2020, 20:55:01
    Author     : Breno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="head.jsp"%>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark"">
		<a class="navbar-brand" href="../index.jsp.html">
		<img src="../cerebro.png" width="30" height="30" class="d-inline-block align-top mr-2 iconeTitulo" alt="">
		<div class="titulo">
			<p class="tituloPrincipal">Lero Lero</p>
			<p class="subtitulo">cursos</p>
		</div>
		</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
			aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav mt-1">
				<li class="nav-item">
					<a class="nav-link" href="../index.jsp.html">home</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="instrutores.html">instrutores</a>
				</li>
				<li class="nav-item active">
					<a class="nav-link" href="cursos.html">cursos <span class="sr-only">(current)</span></a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="tabelas.html">tabelas</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="comentarios.html">comentários</a>
				</li>
				<li class="nav-item mr-5">
					<a class="nav-link" href="sobre.html">sobre</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="login.html">
						<button type="button" class="btn btn-light px-3 py-0">Login</button>
					</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="cadastrar.html">
						<button type="button" class="btn btn-outline-light px-3 py-0" data-toggle="modal"
							data-target="#exampleModal">Registro</button>
					</a>
				</li>
			</ul>
		</div>
	</nav>