package Modelos.daos;
public class Aluno {
    private String matricula;
    private String nome;
    private double nota;
    public static String getStatus(double nota) {
        if (nota >= 6.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    // Construtor da classe Aluno
    public Aluno(String matricula, String nome, double nota) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota = nota;
    }

    // Getters e Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    // Método para representação textual do objeto Aluno
    @Override
    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", nota=" + nota +
                '}';
    }
}
}
