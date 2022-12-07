package br.com.alura.escola.useCases.aluno.matricular;

import br.com.alura.escola.domain.aluno.Aluno;
import br.com.alura.escola.VOUtils.CPF;
import br.com.alura.escola.VOUtils.Email;

public class MatricularAlunoDto {

  private String nomeAluno;
  private CPF cpfAluno;
  private Email emailAluno;

  public MatricularAlunoDto(String nomeAluno, CPF cpfAluno, Email emailAluno) {
    this.nomeAluno = nomeAluno;
    this.cpfAluno = cpfAluno;
    this.emailAluno = emailAluno;
  }

  public String getNomeAluno() {
    return nomeAluno;
  }

  public void setNomeAluno(String nomeAluno) {
    this.nomeAluno = nomeAluno;
  }

  public CPF getCpfAluno() {
    return cpfAluno;
  }

  public void setCpfAluno(CPF cpfAluno) {
    this.cpfAluno = cpfAluno;
  }

  public Email getEmailAluno() {
    return emailAluno;
  }

  public void setEmailAluno(Email emailAluno) {
    this.emailAluno = emailAluno;
  }

  public Aluno criarAluno() {
    return new Aluno(
        cpfAluno,
        nomeAluno,
        emailAluno);
  }
}
