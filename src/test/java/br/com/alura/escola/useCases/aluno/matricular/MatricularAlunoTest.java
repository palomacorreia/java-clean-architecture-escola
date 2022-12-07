package br.com.alura.escola.useCases.aluno.matricular;

import static org.junit.jupiter.api.Assertions.assertEquals;

import br.com.alura.escola.VOUtils.Email;
import org.junit.jupiter.api.Test;

import br.com.alura.escola.domain.aluno.Aluno;
import br.com.alura.escola.VOUtils.CPF;
import br.com.alura.escola.external.aluno.RepositorioDeAlunosEmMemoria;

class MatricularAlunoTest {

	@Test
	void alunoDeveriaSerPersistido() {
		// MOCK -> Mockito
		RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
		br.com.alura.escola.useCases.aluno.matricular.MatricularAluno useCase = new br.com.alura.escola.useCases.aluno.matricular.MatricularAluno(repositorio);
		
		br.com.alura.escola.useCases.aluno.matricular.MatricularAlunoDto dados = new br.com.alura.escola.useCases.aluno.matricular.MatricularAlunoDto(
				"Fulano",
				new CPF( "123.456.789-00"),
		 new Email("fulano@email.com"));
		useCase.executa(dados);
		
		Aluno encontrado = repositorio.buscarPorCPF(
				new CPF("123.456.789-00"));
		
		assertEquals("Fulano", encontrado.getNome());
		assertEquals("123.456.789-00", encontrado.getCpf());
		assertEquals("fulano@email.com", encontrado.getEmail());
	}

}
