package com.senaigo.mobile.atividade01_pedido;

public class Pedido {

    private String cliente;
    private String data;
    private String valor;

    public Pedido(){
    }

    public Pedido(String cliente, String data, String valor){
        this.setCliente(cliente);
        this.setData(data);
        this.setValor(valor);
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    public String toString(){
        return "Pedido realizado: " + " cliente: " + this.getCliente() + " data: " + this.getData() + " valor: " + this.getValor();

    }
}
