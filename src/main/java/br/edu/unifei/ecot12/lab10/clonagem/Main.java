package br.edu.unifei.ecot12.lab10.clonagem;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.setMarca("BYD");
        c1.setModelo("Dolphin");
        c1.setPlaca("FIA0845");
        c1.setPotencia(1);
        Carro c2 = c1.clone();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1.isEqual(c2));
    }
}