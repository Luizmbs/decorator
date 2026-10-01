package org.example;

public class StandardLoan implements Loan {

    public float valor;

    public StandardLoan() {
    }

    public StandardLoan(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public String getDetalhes() {
        return "Empréstimo Padrão";
    }

}
