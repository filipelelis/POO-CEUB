public class Pedido {
    private final String identificaçãoPedido;
    private final String datahoraPedido;
    private final String vendedorPedido;
    private final String clientePedido;
    private final String statusPedido;
    private final float valortotalPedido;
    private final float itensPedido;

    public Pessoa(String identificação, String datahora, String vendedor, String cliente, float valortotal, float itens) {
        this.identificaçãoPedido = identificação;
        this.datahoraPedido = datahora;
        this.vendedorPedido = vendedor;
        this.clientePedido = cliente;
        this.valortotalPedido = valortotal;
        this.itensPedido = itens;
    }
    public String getIdentificação(){
        return identificaçãoPedido;
    }
    public String getDatahora(){
        return datahoraPedido;
    }
    public String getVendedor(){
        return vendedorPedido;
    }
    public String getCliente(){
        return clientePedido;
    }
    public float getValortotal(){
        return valortotalPedido;
    }
    public float getItens(){
        return itensPedido;
    }
        
}