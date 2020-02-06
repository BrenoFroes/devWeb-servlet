function validaLogin() {
	var form = document.getElementById("formLogin");
	var email = document.getElementById("inputEmail");
	var senha = document.getElementById("inputPassword");
	if (email.value === '' || email.value === null || senha.value === '' || senha.value === null) {
		var mensagem = document.getElementById('loginHelp');
		mensagem.innerHTML = 'Login inválido. Tente novamente.';
		return false;
	}
	return true;
}
