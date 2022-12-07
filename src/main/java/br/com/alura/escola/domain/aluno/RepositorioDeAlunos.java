package br.com.alura.escola.domain.aluno;

import br.com.alura.escola.VOUtils.CPF;
import java.util.List;

public interface RepositorioDeAlunos {
	
	void matricular(br.com.alura.escola.domain.aluno.Aluno aluno);
	
	br.com.alura.escola.domain.aluno.Aluno buscarPorCPF(CPF cpf);
	
	List<br.com.alura.escola.domain.aluno.Aluno> listarTodosAlunosMatriculados();
	
	//...

}
