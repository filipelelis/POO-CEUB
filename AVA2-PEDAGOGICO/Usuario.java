public class Usuario {
    protected String nomeCompleto;
    protected String matricula;

    public Usuario(String nomeCompleto, String matricula) {
        this.nomeCompleto = nomeCompleto;
        this.matricula = matricula;
    }

    public String getNomeCompleto() { return nomeCompleto; }
    public void setNomeCompleto(String nome) { this.nomeCompleto = nome; }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
}

