package br.edu.unifei.ecot12.lab10.clonagem;

public class Carro implements Prototipo<Carro>, Igualdade<Carro> {
    public String marca;
    public String modelo;
    public String placa;
    public int potencia;

    public Carro clone() {
        Carro c = new Carro();
        c.marca = this.getMarca();
        c.modelo = this.getModelo();
        c.placa = this.getPlaca();
        c.potencia = this.getPotencia();
        return c;
    }

    @Override
    public boolean isEqual(Carro obj) {
        return this.marca.equals(obj.marca) &&
                this.modelo.equals(obj.modelo) &&
                this.placa.equals(obj.placa) &&
                this.potencia == obj.potencia;
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

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

}
