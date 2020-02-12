<%-- 
    Document   : instrutores.jsp
    Created on : 08/02/2020, 14:36:27
    Author     : Breno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>

<div class="container-fluid mt-5">
    <div class="text-center">
        <h3>INSTRUTORES</h3>
        <hr class="cursos">
        <a href="criarInstrutor.jsp" class="btn btn-lg btn-light addCurso">
            <i class="fa fa-plus mr-1 mb-0"></i>
            cadastrar instrutor
        </a>
        <a href="turma.jsp">
            <button class="btn btn-lg btn-secondary addTurma">
                <i class="fa fa-plus mr-1"></i>
                abrir turma
            </button>
        </a>

        <div class="container pl-5 pb-5">
            <div class="row">

                <div class="col-3 col-sm-3">
                    <div class="card bg-secondary mt-3">
                        <img src="images/kowada.jpg" class="card-img-top" alt="Luis">
                        <div class="card-body">
                            <h5 class="card-title">Luis Antonio Kowada</h5>
                            <hr>
                            <p class="card-text">Doutor em Engenharia de Sistemas e Computação pela UFRJ.</p>
                            <a href="#" class="btn btn-info">Visualizar</a>
                        </div>
                    </div>
                </div>

                <div class="col-3 col-sm-3">
                    <div class="card bg-secondary mt-3">
                        <img src="images/flavio.jpg" class="card-img-top" alt="Flavio">
                        <div class="card-body">
                            <h5 class="card-title">Flavio Seixas</h5>
                            <hr>
                            <p class="card-text">Obteve Doutorado em Ciência da Computação, e mestrado em Engenharia de Telecomunicações, ambos pela UFF.</p>
                            <a href="#" class="btn btn-info">Visualizar</a>
                        </div>
                    </div>
                </div>

                <div class="col-3 col-sm-3">
                    <div class="card bg-secondary mt-3">
                        <img src="images/lauro.png" class="card-img-top" alt="Lauro">
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
    <%@include file="foot.jsp" %>