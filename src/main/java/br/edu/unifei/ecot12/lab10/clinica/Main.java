package br.edu.unifei.ecot12.lab10.clinica;

public class Main {
    public static void main(String[] args) {
        Historico h = new Historico();
        h.setConsulta(new Consulta());
        h.getConsulta().setSintomas("Dor de cabeça");
        // Novos Sintomas
        h.getDiagnosticos().add(h.getConsulta().criar());
        h.getConsulta().setSintomas("Insônia");
        System.out.println(h.getConsulta().getSintomas());
        h.desfazer();
        System.out.println(h.getConsulta().getSintomas());
    }
}
