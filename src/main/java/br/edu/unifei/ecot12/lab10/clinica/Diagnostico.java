package br.edu.unifei.ecot12.lab10.clinica;

public class Diagnostico {
    private String sintomas;
    private String tratamento;

    public Diagnostico(String sintomas, String tratamento) {
        this.sintomas = sintomas;
        this.tratamento = tratamento;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getTratamento() {
        return tratamento;
    }

    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }

}
