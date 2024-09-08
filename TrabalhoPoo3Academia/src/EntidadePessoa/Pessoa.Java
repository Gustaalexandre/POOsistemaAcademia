package EntidadePessoa;

public abstract class Pessoa {
    protected long codPessoa;
    protected String nome;
    protected String sNome;
    protected String cpf;
    protected Date dataNasc;
    protected char sexo;
    protected String telefone;


    public Pessoa(String nome, String sNome, String cpf, Date dataNasc, String sexo){
        this.nome = nome;
        this.sNome = sNome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
    }
}
