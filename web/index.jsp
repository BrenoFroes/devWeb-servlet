
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="pt-br">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="shortcut icon"  href="cerebro.ico">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" crossorigin="anonymous">
	<link rel="stylesheet" type="text/css" href="style.css" crossorigin="anonymous">
	<link rel="stylesheet" type="text/css" href="css/all.css">
	<script defer src="js/all.js"></script>
	
	<title>Lero Lero</title>
</head>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark"">
		<a class=" navbar-brand" href="index.html">
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
				<li class="nav-item active">
					<a class="nav-link" href="#">home <span class="sr-only">(current)</span></a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="pages/cadastrarAluno.jsp">instrutores</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="pages/cursos.html">cursos</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="pages/tabelas.html">tabelas</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="pages/comentarios.html">comentários</a>
				</li>
				<li class="nav-item mr-5">
					<a class="nav-link" href="pages/sobre.html">sobre</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="pages/login.html">
						<button type="button" class="btn btn-light px-3 py-0">Login</button>
					</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="pages/cadastrar.html">
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
			<img class="d-block w-100" src="images/pexels-photo-2010794.jpeg" style="height: auto;" alt="First slide">
			</div>
			<div class="carousel-item">
			<img class="d-block w-100" src="images/pexels-photo-374016.jpeg" alt="Second slide">
			</div>
			<div class="carousel-item">
			<img class="d-block w-100" src="images/pexels-photo-669996.jpeg" alt="Third slide">
			</div>
		</div>
		</a>
	</div>
        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="../js/nossosScripts/adicionarItens.js"></script>
        <script src="../js/nossosScripts/validacoes.js"></script>
        <script src="js/jquery-3.4.1.slim.min.js" crossorigin="anonymous"></script>
        <script src="js/popper.min.js" crossorigin="anonymous"></script>
        <script src="js/bootstrap.min.js" crossorigin="anonymous"></script>
</body>

</html>
        