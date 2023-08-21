public class Aluno {
//atributos da classe Aluno
    private String nome;

    private int matricula;

    private double nota;

//metodos getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    /**
     * metodo para registrar notas
     */
    public void registrarNota(double nota){
        this.nota = nota;
    }
}
