package br.com.alura.escola;

import br.com.alura.escola.VOUtils.CPF;
import br.com.alura.escola.VOUtils.Email;
import br.com.alura.escola.useCases.aluno.matricular.MatricularAluno;
import br.com.alura.escola.useCases.aluno.matricular.MatricularAlunoDto;
import br.com.alura.escola.external.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoPorLinhaDeComando {
	
	public static void main(String[] args) {
		String nome = "Fulano da Silva";
		CPF cpf = new CPF( "123.456.789-00");
		Email email = new Email("fulano@email.com");
		
		MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
		matricular.executa(
				new MatricularAlunoDto(nome, 
						cpf, 
						email));
	}

}
