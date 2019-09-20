
package atividadelp3;

import java.sql.SQLException;
import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import javax.swing.JOptionPane;


public class Main {

    
    public static void main(String[] args) throws SQLException{
        CamadaDao dao = new CamadaDao();
        EntradaDeDados entrada = new EntradaDeDados();
        Aluno a = new Aluno ();
        Professor p = new Professor();
        

        String menu = "0- Sair\n1 - Salvar Aluno\n2 - Buscar Aluno por nome"
                + "\n 3 - Exibir Todos os Alunos\n4- Remover Aluno por CPF:\n"
                + "5 - Alterar Aluno por RA:\n6 - Salvar Professor:\n"+
                "7 - Buscar Professor por Nome :\n 8 - Exibir Todos os Professores\n 9-Remover Professor por CPf\n 10 -Alterar Professor por siape"
                ;

        String opt = "";
        do {
            opt = JOptionPane.showInputDialog(menu);
            switch (opt) {
                case "0":
                    break;
                case "1":
                    entrada.leituraAluno(a);
                    dao.salvarAluno(a);
                    break;
                case "2":
                    dao.buscarAlunoNome();
                    break;
                case "3":
                    dao.buscarTodosAlunos();
                    break;
                case "4":
                    dao.deletarAlunoCpf();
                    break;
                case "5":
                    dao.alterarAluno();
                    break;
                case "6":
                    entrada.leituraProfessor(p);
                    dao.salvarProfessor(p);
                    break;
                case "7":
                    dao.buscarProfessorNome();
                    break;
                case "8":
                    dao.buscarTodosprofessores();
                    break;
                case "9":
                    dao.deletarProfessorCpf();
                    break;
                case "10":
                    dao.alterarProfessor();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        } while (!opt.equals("0"));

        
    }
    
}
