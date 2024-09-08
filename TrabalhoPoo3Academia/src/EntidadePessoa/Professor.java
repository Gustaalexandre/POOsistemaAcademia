package EntidadePessoa;
import Turmas.Turma;

import java.util.ArrayList;
import java.util.Date;


public class Professor extends Pessoa{
    private Date dtContrato;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private ArrayList<Turma> turmas = new ArrayList<>();

}
