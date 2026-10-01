package org.example;

public class DamageInsurance extends LoanDecorator {

    public DamageInsurance(Loan loan) {
        super(loan);
    }

    public float getPercentualAcrescimo() {
        return 20.0f;
    }

    public String getNomeAdicional() {
        return "Seguro contra Danos";
    }
}
