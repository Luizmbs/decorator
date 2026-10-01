package org.example;

public class Renewal extends LoanDecorator {

    public Renewal(Loan loan) {
        super(loan);
    }

    public float getPercentualAcrescimo() {
        return 5.0f;
    }

    public String getNomeAdicional() {
        return "Renovação Automática";
    }
}
