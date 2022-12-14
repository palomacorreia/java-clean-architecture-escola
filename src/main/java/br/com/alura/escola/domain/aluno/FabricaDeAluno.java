package br.com.alura.escola.domain.aluno;

import br.com.alura.escola.VOUtils.CPF;
import br.com.alura.escola.VOUtils.Email;

public class FabricaDeAluno {
	
	private br.com.alura.escola.domain.aluno.Aluno aluno;

	public FabricaDeAluno comNomeCPFEmail(String nome, String cpf, String email) {
		this.aluno = new br.com.alura.escola.domain.aluno.Aluno(new CPF(cpf), nome, new Email(email));
		return this;
	}
	
	public FabricaDeAluno comTelefone(String ddd, String numero) {
		this.aluno.adicionarTelefone(ddd, numero);
		return this;
	}
	
	public br.com.alura.escola.domain.aluno.Aluno criar() {
		return this.aluno;
	}
	
}
