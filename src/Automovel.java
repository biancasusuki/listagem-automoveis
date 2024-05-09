/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */

public class Automovel {

    String placa;
    String marca;
    String modelo;
    double preco;
    int anoDeFabricacao;

    public Automovel(String placa, String marca, String modelo, double preco, int anoDeFabricacao) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void set(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    @Override
    public String toString() {
        return "Placa: " + this.getPlaca()
                + "\nMarca: "
                + this.getMarca()
                + "\nModelo: " + this.getModelo() + "\nPreco: "
                + this.getPreco()
                + "\nANo de Fabricação: " + this.getAnoDeFabricacao();
    }
}
