public class Pedido extends Cliente {
    private int id;
    private Cliente cliente;
    private Double valorTotal;
    private int tipoPagamento;
    public int getId() {
        return id;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public Double getValorTotal() {
        return valorTotal;
    }
    public int getTipoPagamento() {
        return tipoPagamento;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public void setTipoPagamento(int tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public void adicionarItem(){

    }
    public void removerItem(){

    }
    public void cancelarPedido(){

    }
}
