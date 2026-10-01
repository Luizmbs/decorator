package org.example;

public class HomeDelivery extends LoanDecorator {

    public HomeDelivery(Loan loan) {
        super(loan);
    }

    public float getPercentualAcrescimo() {
        return 10.0f;
    }

    public String getNomeAdicional() {
        return "Entrega em Domicílio";
    }
}
