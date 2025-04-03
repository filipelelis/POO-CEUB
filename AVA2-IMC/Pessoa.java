// Classe Pessoa
public class Pessoa {
    // Atributos da Classe Pessoa
    private String nomePessoa;
    private double pesoPessoa;
    private double alturaPessoa;
    private double imcPessoa;

    // Construtor da Classe Pessoa
    public Pessoa(String nomePessoa, double pesoPessoa, double alturaPessoa) {
        this.nomePessoa = nomePessoa;
        this.pesoPessoa = pesoPessoa;
        this.alturaPessoa = alturaPessoa;
        this.imcPessoa = calcularImcPessoa(pesoPessoa, alturaPessoa);
    }

    // Método para cálculo do IMC da Classe Pessoa
    private static double calcularImcPessoa(double peso, double altura) {
        // Fórmula do IMC = Peso ÷ (Altura × Altura)
        return peso / (Math.pow(altura, 2));
    }

    // Método para mostrar a Pessoa e resultado do cálculo do IMC
    public void mostrarImcPessoa() {
        // Exibe as informações da pessoa
        System.out.println("Nome: " + this.nomePessoa);
        System.out.println("Peso: " + this.pesoPessoa + " kg");
        System.out.println("Altura: " + this.alturaPessoa + " m");
        System.out.println("IMC: " + String.format("%.2f", this.imcPessoa));
        // Exibe a classificação do IMC
        System.out.println("Analise IMC " + analiseImcPessoa());
    }

    // Método para classificar o IMC da Pessoa
    private String analiseImcPessoa() {
        if (imcPessoa < 18.5) {
            return "Baixo peso";
        } else if (imcPessoa >= 18.5 && imcPessoa <= 24.9) {
            return "Peso adequado";
        } else if (imcPessoa >= 25.0 && imcPessoa <= 29.9) {
            return "Sobrepeso";
        } else if (imcPessoa >= 30.0 && imcPessoa <= 34.9) {
            return "Obesidade grau 1";
        } else if (imcPessoa >= 35.0 && imcPessoa <= 39.9) {
            return "Obesidade grau 2";
        } else {
            return "Obesidade grau 3";
        }
    }
}
