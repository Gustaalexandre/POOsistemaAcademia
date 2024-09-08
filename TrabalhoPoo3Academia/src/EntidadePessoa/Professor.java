package EntidadePessoa;
import Turmas.Turma;

import java.util.ArrayList;
import java.time.LocalDate;


public class Professor extends Pessoa{
    private LocalDate dtContrato;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private ArrayList<Turma> turmas = new ArrayList<>();


    public Professor(String nome, String sNome, String cpf, LocalDate dataNasc, char sexo, LocalDate dtContrato) {
        super(nome, sNome, cpf, dataNasc, sexo);  // Chama o construtor da classe Pessoa
        this.dtContrato = dtContrato;
    }

    
}
