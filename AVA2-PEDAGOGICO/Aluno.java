public class Aluno extends Usuario {
    private String turma;
    private Map<Atividade, Nota> notas;

    public Aluno(String nomeCompleto, String matricula, String turma) {
        super(nomeCompleto, matricula);
        this.turma = turma;
        this.notas = new HashMap<>();
    }

    public String getTurma() { return turma; }
    public void setTurma(String turma) { this.turma = turma; }

    public void adicionarNota(Atividade atividade, Nota nota) {
        notas.put(atividade, nota);
    }

    public Nota consultarNota(Atividade atividade) {
        return notas.get(atividade);
    }

    public Map<Atividade, Nota> getNotas() {
        return notas;
    }
}

