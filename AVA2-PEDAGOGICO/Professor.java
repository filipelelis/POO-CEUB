public class Professor extends Usuario {
    private List<Aluno> alunos;
    private List<Atividade> atividades;

    public Professor(String nomeCompleto, String matricula) {
        super(nomeCompleto, matricula);
        this.alunos = new ArrayList<>();
        this.atividades = new ArrayList<>();
    }

    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void cadastrarAtividade(Atividade atividade) {
        atividades.add(atividade);
    }

    public void lancarNota(Aluno aluno, Atividade atividade, double nota) {
        aluno.adicionarNota(atividade, new Nota(aluno, atividade, nota));
    }

    public List<Aluno> getAlunos() { return alunos; }
    public List<Atividade> getAtividades() { return atividades; }
}

