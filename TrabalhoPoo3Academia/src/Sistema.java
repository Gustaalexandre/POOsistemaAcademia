import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import EntidadePessoa.Aluno;
import EntidadePessoa.Pessoa;

public class Sistema {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // Menu De LOGIN  //

        int opcao;
        do{
            System.out.println();
            System.out.println("---LOGIN---");
            System.out.println("1 - Adminstrador"); 
            System.out.println("2 - Aluno");
            System.out.println("3 - Professor");
            System.out.println("0 - SAIR");

            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    moduloAdm();
                    break;
                case 2:
                    moduloAluno();
                    break;
                case 3: 
                    moduloProfessor();
                    break;
                default:
                    break;
            }
        }while(opcao != 0);

        

    }

   static void moduloAdm(){
    int opcao;

    do{
            System.out.println("-- ADM --");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("0 - LOGOUT");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("\n1 - Cadastrar Aluno");
                    System.out.println("2 - Cadastrar professor");

                    
                    if(sc.nextInt() == 1)
                        inserirAluno();
                    else if(sc.nextInt() == 2)
                        inserirProfessor();
                    else
                        System.out.println("Opção inválida");
                    break;
                
                case 2:
                    // imprimeAlunos();
                case 0:
                    break;
                default:
                    break;
            }
        }while(opcao != 0);
   }
   
    static void moduloAluno(){
        System.out.println("Logado com ALuno ");
    }

    static void moduloProfessor(){
        System.out.println("Logado Professor com Sucesso");
    }

    static void inserirAluno(){ //Cadastra um Aluno
        System.out.println();
        System.out.println("--> Cadastro de Alunos <--");
        
        System.out.print("Nome -> ");
        String nome = sc.next();
        sc.nextLine();
        
        System.out.print("Sobrenome -> ");
        String sNome = sc.nextLine();
        
        System.out.print("CPF -> ");
        String cpf = sc.nextLine();

        System.out.print("Data Nascimento (dd/MM/yyyy) -> ");
        String data = sc.nextLine();
        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dtNasc = LocalDate.parse(data, dataFormatada);

        System.out.print("Sexo -> ");
        char sexo = sc.next().charAt(0);

        Aluno a1 = new Aluno(nome, sNome, cpf, dtNasc, sexo);
        
        System.out.println(" --> Cadastro realizado com sucesso");

        a1.listaPessoa(); //Imprime as informações do aluno Cadastrado
        
    }

    static void inserirProfessor(){
 
    }
}
