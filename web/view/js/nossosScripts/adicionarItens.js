function adicionarCurso(form) {
    var form = form;
    var retorno = true;
    var nome = form.inputNomeM.value;
    var requisito = form.inputRequisitoM.value;
    var ementa = form.inputEmentaM.value;
    var carga = form.inputCargaM.value;
    var preco = form.inputPrecoM.value;
    if (nome == '' || nome == null) {
        var mensagem = document.getElementById('nomeHelpM');
        mensagem.innerHTML = 'O nome é obrigatório.';
        retorno = false;
    } else if (nome.length < 3 || nome.length > 50) {
        var mensagem = document.getElementById('nomeHelpM');
        mensagem.innerHTML = 'Quantidade de caracteres inválida.';
        retorno = false;
    }
    if (requisito.length < 3 || requisito.length > 255) {
        var mensagem = document.getElementById('requisitoHelpM');
        mensagem.innerHTML = 'Quantidade de caracteres inválida.';
        retorno = false;
    }
    if (ementa.length < 3 || ementa.length > 255) {
        var mensagem = document.getElementById('ementaHelpM');
        mensagem.innerHTML = 'Quantidade de caracteres inválida.';
        retorno = false;
    }
    if (carga.length < 3 || carga.length > 5) {
        var mensagem = document.getElementById('cargaHelpM');
        mensagem.innerHTML = 'Quantidade de números inválida.';
        retorno = false;
    }
    if (preco.length < 3 || preco.length > 255) {
        var mensagem = document.getElementById('precoHelpM');
        mensagem.innerHTML = 'Quantidade de números inválida.';
        retorno = false;
    }
    if (retorno) {
        alert('Curso adicionado com sucesso!');
    }
    return retorno;
}

function adicionarInstrutor(form) {
    var form = form;
    var retorno = true;
    var nome = form.inputNomeM.value;
    var email = form.inputEmailM.value;
    var hora = form.inputHoraM.value;
    var login = form.inputLoginM.value;
    var senha = form.inputSenhaM.value;
    var experiencia = form.inputExperienciaM.value;
    if (nome == '' || nome == null) {
        var mensagem = document.getElementById('nomeHelpM');
        mensagem.innerHTML = 'O nome é obrigatório.';
        retorno = false;
    } else if (nome.length < 3 || nome.length > 50) {
        var mensagem = document.getElementById('nomeHelpM');
        mensagem.innerHTML = 'Quantidade de caracteres é inválida.';
        retorno = false;
    }
    if (email.indexOf("@") == -1 || email.indexOf(".") == -1 || email == '' || email == null) {
        var mensagem = document.getElementById('emailHelpM');
        mensagem.innerHTML = 'Por favor, indique um email válido.';
        retorno = false;
    } else if (email.length < 3 || email.length > 50) {
        var mensagem = document.getElementById('emailHelpM');
        mensagem.innerHTML = 'Quantidade de caracteres é inválida.';
        retorno = false;
    }
    if (hora.length < 3 || hora.length > 5) {
        var mensagem = document.getElementById('horaHelpM');
        mensagem.innerHTML = 'A quantidade informada é inválida.';
        retorno = false;
    }
    if (login == null || login == '') {
        var mensagem = document.getElementById('loginHelpM');
        mensagem.innerHTML = 'O login é obrigatório.';
        retorno = false;
    } else if (login.length < 3 || login.length > 20) {
        var mensagem = document.getElementById('loginHelpM');
        mensagem.innerHTML = 'Quantidade de caracteres é inválida.';
        retorno = false;
    }
    if (senha == null || senha == '') {
        var mensagem = document.getElementById('senhaHelpM');
        mensagem.innerHTML = 'O login é obrigatório.';
        retorno = false;
    } else if (senha.length < 3 || senha.length > 255) {
        var mensagem = document.getElementById('senhaHelpM');
        mensagem.innerHTML = 'Quantidade de caracteres é inválida.';
        retorno = false;
    }
    if (experiencia == null || experiencia == '') {
        var mensagem = document.getElementById('experienciaHelpM');
        mensagem.innerHTML = 'A experiência é obrigatória.';
        retorno = false;
    } else if (experiencia.length < 3 || experiencia.length > 255) {
        var mensagem = document.getElementById('experienciaHelpM');
        mensagem.innerHTML = 'Quantidade de caracteres é inválida.';
        retorno = false;
        if (retorno) {
            alert('Instrutor adicionado com sucesso!');
        }
        return retorno;
    }

    function adicionarAluno(form) {
        var form = form;
        var retorno = true;
        var cpf = form.inputCpfM.value;
        var nome = form.inputNomeM.value;
        var email = form.inputEmailM.value;
        var celular = form.inputCelularM.value;
        var login = form.inputLoginM.value;
        var senha = form.inputSenhaM.value;
        var endereco = form.inputEnderecoM.value;
        var cidade = form.inputCidadeM.value;
        var bairro = form.inputBairroM.value;
        var cep = form.inputCepM.value
        if (cpf == '' || cpf == null) {
            var mensagem = document.getElementById('cpfHelpM');
            mensagem.innerHTML = 'O CPF é obrigatório.';
            retorno = false;
        } else if (nome.length < 3 || nome.length > 11) {
            var mensagem = document.getElementById('cpfHelpM');
            mensagem.innerHTML = 'Quantidade de caracteres é inválida.';
            retorno = false;
        }
        if (nome == '' || nome == null) {
            var mensagem = document.getElementById('nomeHelpM');
            mensagem.innerHTML = 'O nome é obrigatório.';
            retorno = false;
        } else if (nome.length < 3 || nome.length > 50) {
            var mensagem = document.getElementById('nomeHelpM');
            mensagem.innerHTML = 'Quantidade de caracteres é inválida.';
            retorno = false;
        }
        if (email.indexOf("@") == -1 || email.indexOf(".") == -1 || email == '' || email == null) {
            var mensagem = document.getElementById('emailHelpM');
            mensagem.innerHTML = 'Por favor, indique um email válido.';
            retorno = false;
        } else if (email.length < 3 || email.length > 50) {
            var mensagem = document.getElementById('emailHelpM');
            mensagem.innerHTML = 'Quantidade de caracteres é inválida.';
            retorno = false;
        }
        if (celular == null || celular == 0) {
            var mensagem = document.getElementById('celularHelpM');
            mensagem.innerHTML = 'O celular é obrigatório.';
            retorno = false;
        } else if (celular.length < 3 || celular.length > 14) {
            var mensagem = document.getElementById('celularHelpM');
            mensagem.innerHTML = 'A quantidade de dígitos informada é inválida.';
            retorno = false;
        }
        if (login == null || login == '') {
            var mensagem = document.getElementById('loginHelpM');
            mensagem.innerHTML = 'O login é obrigatório.';
            retorno = false;
        } else if (login.length < 3 || login.length > 20) {
            var mensagem = document.getElementById('loginHelpM');
            mensagem.innerHTML = 'Quantidade de caracteres é inválida.';
            retorno = false;
        }
        if (senha == null || senha == '') {
            var mensagem = document.getElementById('senhaHelpM');
            mensagem.innerHTML = 'O login é obrigatório.';
            retorno = false;
        } else if (senha.length < 3 || senha.length > 255) {
            var mensagem = document.getElementById('senhaHelpM');
            mensagem.innerHTML = 'Quantidade de caracteres é inválida.';
            retorno = false;
        }
        if (endereco.length < 3 || endereco.length > 50) {
            var mensagem = document.getElementById('enderecoHelpM');
            mensagem.innerHTML = 'Quantidade de caracteres é inválida.';
            retorno = false;
        }
        if (cidade.length < 3 || cidade.length > 30) {
            var mensagem = document.getElementById('cidadeHelpM');
            mensagem.innerHTML = 'Quantidade de caracteres é inválida.';
            retorno = false;
        }
        if (bairro.length < 3 || bairro.length > 30) {
            var mensagem = document.getElementById('bairroHelpM');
            mensagem.innerHTML = 'Quantidade de caracteres é inválida.';
            retorno = false;
        }
        if (cep.length < 3 || cep.length > 9) {
            var mensagem = document.getElementById('cepHelpM');
            mensagem.innerHTML = 'Quantidade de caracteres é inválida.';
            retorno = false;
        }
        if (retorno) {
            alert('Aluno adicionado com sucesso!');
        }
        return retorno;
    }

    function adicionarComentario(form) {
        var form = form;
        var retorno = true;
        var nome = form.inputNomeM.value;
        var comentario = form.inputComentarioM.value;
        if (nome == '' || nome == null) {
            var mensagem = document.getElementById('nomeHelpM');
            mensagem.innerHTML = 'O nome é obrigatório.';
            retorno = false;
        } else if (nome.length < 3 || nome.length > 50) {
            var mensagem = document.getElementById('nomeHelpM');
            mensagem.innerHTML = 'Quantidade de caracteres inválida.';
            retorno = false;
        }
        if (comentario == '' || comentario == null) {
            var mensagem = document.getElementById('comentarioHelpM');
            mensagem.innerHTML = 'O comentário é obrigatório.';
            retorno = false;
        } else if (comentario.length < 3 || comentario.length > 255) {
            var mensagem = document.getElementById('comentarioHelpM');
            mensagem.innerHTML = 'Quantidade de caracteres inválida.';
            retorno = false;
        }
        if (retorno) {
            alert('Comentário adicionado com sucesso!');
        }
        return retorno;
    }

    function adicionarAdministrador(form) {
        var form = form;
        var retorno = true;
        var nome = form.inputNomeM.value;
        var login = form.inputLoginM.value;
        var senha = form.inputSenhaM.value;
        if (nome == '' || nome == null) {
            var mensagem = document.getElementById('nomeHelpM');
            mensagem.innerHTML = 'O nome é obrigatório.';
            retorno = false;
        } else if (nome.length < 3 || nome.length > 50) {
            var mensagem = document.getElementById('nomeHelpM');
            mensagem.innerHTML = 'Quantidade de caracteres inválida.';
            retorno = false;
        }
        if (login == '' || login == null) {
            var mensagem = document.getElementById('loginHelpM');
            mensagem.innerHTML = 'O login é obrigatório.';
            retorno = false;
        } else if (login.length < 3 || login.length > 20) {
            var mensagem = document.getElementById('loginHelpM');
            mensagem.innerHTML = 'Quantidade de caracteres inválida.';
            retorno = false;
        }
        if (senha == '' || senha == null) {
            var mensagem = document.getElementById('senhaHelpM');
            mensagem.innerHTML = 'A senha é obrigatória.';
            retorno = false;
        } else if (senha.length < 3 || senha.length > 255) {
            var mensagem = document.getElementById('senhaHelpM');
            mensagem.innerHTML = 'Quantidade de caracteres inválida.';
            retorno = false;
        }
        if (retorno) {
            alert('Cadastro realizado com sucesso!');
        }
        return retorno;
    }
    function adicionarMatricula(form) {
        var form = form;
        var retorno = true;
        var turma = form.inputTurmaM.value;
        var aluno = form.inputAlunoM.value;
        var nota = form.inputNotaM.value;
        var data = form.inputDataM.value;
        if (turma == '' || turma == null) {
            var mensagem = document.getElementById('turmaHelpM');
            mensagem.innerHTML = 'A turma é obrigatório.';
            retorno = false;
        } else if (turma.length < 3 || turma.length > 11) {
            var mensagem = document.getElementById('turmaHelpM');
            mensagem.innerHTML = 'Quantidade de caracteres é inválida.';
            retorno = false;
        }
        if (aluno == '' || aluno == null) {
            var mensagem = document.getElementById('alunoHelpM');
            mensagem.innerHTML = 'O nome é obrigatório.';
            retorno = false;
        } else if (aluno.length < 3 || aluno.length > 50) {
            var mensagem = document.getElementById('alunoHelpM');
            mensagem.innerHTML = 'Quantidade de caracteres é inválida.';
            retorno = false;
        }
        if (nota == '' || nota == null) {
            var mensagem = document.getElementById('notaHelpM');
            mensagem.innerHTML = 'A nota é obrigatória.';
            retorno = false;
        } else if (nota < 0 || nota > 10) {
            var mensagem = document.getElementById('notaHelpM');
            mensagem.innerHTML = 'O valor informado é inválido.';
            retorno = false;
        }
        if (retorno) {
            alert('Matrícula adicionada com sucesso!');
        }
        return retorno;
    }
    function adicionarTurma(form) {
        var form = form;
        var retorno = true;
        var instrutores = form.inputInstrutoresM.value;
        var cursos = form.inputCursosM.value;
        var dataIni = form.inputDataIniM.value;
        var dataFin = form.inputDataFinM.value;
        var carga = form.inputCargaM.value;
        if (instrutores == '' || instrutores == null) {
            var mensagem = document.getElementById('instrutoresHelpM');
            mensagem.innerHTML = 'Os instrutores são obrigatórios.';
            retorno = false;
        } else if (instrutores.length < 3 || instrutores.length > 11) {
            var mensagem = document.getElementById('instrutoresHelpM');
            mensagem.innerHTML = 'Quantidade de caracteres é inválida.';
            retorno = false;
        }
        if (cursos == '' || cursos == null) {
            var mensagem = document.getElementById('cursosHelpM');
            mensagem.innerHTML = 'Os cursos são obrigatórios.';
            retorno = false;
        } else if (cursos.length < 3 || cursos.length > 10) {
            var mensagem = document.getElementById('cursosHelpM');
            mensagem.innerHTML = 'Quantidade de caracteres é inválida.';
            retorno = false;
        }
        if (carga.length < 3 || carga.length > 5) {
            var mensagem = document.getElementById('cargaHelpM');
            mensagem.innerHTML = 'Quantidade de caracteres é inválida.';
            retorno = false;
        }
        if (retorno) {
            alert('Turma adicionada com sucesso!');
        }
        return retorno;
    }
}