public class Cliente {
    private final String nomeCliente;
    private final String cpfCliente;
    private final String endereçoCliente;
    private final String telefoneCliente;

    public Pessoa(String nome, String cpf, String endereço, String telefone) {
        this.nomePedido = nome;
        this.cpfPedido = cpf;
        this.endereçoPedido = endereço;
        this.telefonePedido = telefone;
    }
    public String getNome(){
        return nomeCliente;
    }
    public String getCpf(){
        return cpfCliente;
    }
    public String getEndereço(){
        return endereçoCliente;
    }
    public String getTelefone(){
        return telefoneCliente;
    }
}