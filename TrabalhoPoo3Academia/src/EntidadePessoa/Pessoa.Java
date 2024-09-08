package EntidadePessoa;

import java.time.LocalDate;


public abstract class Pessoa {
    protected static int numPessoas = 0;
    // private ArrayList<Pessoa> tdsPessoas = new ArrayList<>();
    
    protected long codPessoa;
    protected String nome;
    protected String sNome;
    protected String cpf;
    protected LocalDate dataNasc;
    protected char sexo;
    protected String telefone;

    protected Pessoa(String nome, String sNome, String cpf, LocalDate dataNasc, char sexo) {
        this.codPessoa = numPessoas;
        this.nome = nome;
        this.sNome = sNome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
        numPessoas++;
    }

    public void listaPessoa(){
        System.out.println("\n -- Pessoa -- ");
        System.out.println("Nome: " + getNome() + "\tSobrenome: " + getSNome() + "\tsexo: " + sexo);
        System.out.println(" ----------------------- ");
    }
    
    String getNome() {
        return nome;
    }

    String getSNome() {
        return sNome;
    }

    char getSexo() {
        return sexo;
    }
}
