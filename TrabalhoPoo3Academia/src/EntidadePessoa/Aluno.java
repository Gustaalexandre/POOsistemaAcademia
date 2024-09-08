package EntidadePessoa;

import fichaAvaliacao.Avaliacao;
import java.util.ArrayList;
import java.time.LocalDate;

public class Aluno extends Pessoa {
    private LocalDate dtMatricula;
    private ArrayList<Avaliacao> avaliacoes = new ArrayList<>();
    private Professor prof;

    public Aluno(String nome, String sNome, String cpf, LocalDate dataNasc, char sexo) {
        super(nome, sNome, cpf, dataNasc, sexo); 
        this.dtMatricula = LocalDate.now();
        
    }




}
