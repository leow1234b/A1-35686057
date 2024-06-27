
    import java.util.List;

public class Telas {

    public static void main(String[] args) {
        List<Aluno> listaDeAlunos = Main.lerAlunosDoCSV("alunos.csv");

        // Exibir os dados dos alunos
        exibirDadosDosAlunos(listaDeAlunos);
    }

    public static void exibirDadosDosAlunos(List<Aluno> alunos) {
        System.out.println("=== Dados dos Alunos ===");
        for (Aluno aluno : alunos) {
            System.out.println("Matrícula: " + aluno.getMatricula() +
                               ", Nome: " + aluno.getNome() +
                               ", Nota: " + aluno.getNota());
        }
    }
}


