package br.edu.unifei.ecot12.lab10.clinica;

import java.util.Stack;

public class Historico {
    private Stack<Diagnostico> diagnosticos = new Stack<Diagnostico>();
    private Consulta consulta;

    public void desfazer() {
        if (!diagnosticos.isEmpty() && consulta != null) {
            consulta.restaurar(diagnosticos.pop());
        }
    }

    public Stack<Diagnostico> getDiagnosticos() {
        return diagnosticos;
    }

    public void setDiagnosticos(Stack<Diagnostico> diagnosticos) {
        this.diagnosticos = diagnosticos;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

}
