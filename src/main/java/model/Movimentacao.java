package model;

/**
 *
 * @author Paulo Henrique
 */
public class Movimentacao {

    String nomeItem, nomeCliente;
    int codVenda, quantidade;
    double valor, desconto, subTotal;

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setCodVenda(int codVenda) {
        this.codVenda = codVenda;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getCodVenda() {
        return codVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValor() {
        return valor;
    }

    public double getDesconto() {
        return desconto;
    }

    public double getSubTotal() {
        return subTotal;
    }
}