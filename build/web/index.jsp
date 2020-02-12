
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="pt-br">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="shortcut icon"  href="cerebro.ico">
	<link rel="stylesheet" type="text/css" href="view/css/bootstrap.min.css" crossorigin="anonymous">
	<link rel="stylesheet" type="text/css" href="style.css" crossorigin="anonymous">
	<link rel="stylesheet" type="text/css" href="view/css/all.css">
	<script defer src="view/js/all.js"></script>
	
	<title>Lero Lero</title>
</head>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark"">
		<a class="navbar-brand" href="../index.jsp">
		<img src="cerebro.png" width="30" height="30" class="d-inline-block align-top mr-2 iconeTitulo" alt="">
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
					<a class="nav-link" href="index.jsp">home</a>
				</li>
                                <li class="nav-item">
					<a class="nav-link" href="view/perfil.jsp">meu perfil</a>
				</li>
                                <li class="nav-item">
					<a class="nav-link" href="view/minhasTurmas.jsp">minhas turmas/cursos (aluno)</a>
				</li>
                                <li class="nav-item">
					<a class="nav-link" href="view/minhasTurmasAlunos.jsp">minhas turmas/cursos (instrutor)</a>
				</li>
                                 <li class="nav-item">
					<a class="nav-link" href="view/centralAdministrador.jsp">central administrador (administrador)</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="view/instrutores.jsp">instrutores</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="view/cursos.jsp">cursos</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="view/tabelas.jsp">tabelas</a>
				</li>
				<li class="nav-item mr-5">
					<a class="nav-link" href="view/sobre.jsp">sobre</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="view/login.jsp">
						<button type="button" class="btn btn-light px-3 py-0">Login</button>
					</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="view/cadastrarAluno.jsp">
						<button type="button" class="btn btn-outline-light px-3 py-0" data-toggle="modal"
							data-target="#exampleModal">Registro</button>
					</a>
				</li>
			</ul>
		</div>
	</nav>
        <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
		<div class="carousel-inner">
			<div class="carousel-item active">
			<img class="d-block w-100" src="view/images/pexels-photo-2010794.jpeg" style="height: auto;" alt="First slide">
			</div>
			<div class="carousel-item">
			<img class="d-block w-100" src="view/images/pexels-photo-374016.jpeg" alt="Second slide">
			</div>
			<div class="carousel-item">
			<img class="d-block w-100" src="view/images/pexels-photo-669996.jpeg" alt="Third slide">
			</div>
		</div>
		</a>
	</div>
        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="view/js/nossosScripts/adicionarItens.js"></script>
        <script src="view/js/nossosScripts/validacoes.js"></script>
        <script src="view/js/jquery-3.4.1.slim.min.js" crossorigin="anonymous"></script>
        <script src="view/js/popper.min.js" crossorigin="anonymous"></script>
        <script src="view/js/bootstrap.min.js" crossorigin="anonymous"></script>
</body>

</html>
        