package br.com.alura.escola.external.indicacao;

import br.com.alura.escola.useCases.indicacao.EnviarEmailIndicacao;
import br.com.alura.escola.domain.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {

	@Override
	public void enviarPara(Aluno indicado) {
		// logica de envio de email com a lib Java Mail
	}
}
