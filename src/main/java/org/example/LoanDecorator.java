package org.example;

public abstract class LoanDecorator implements Loan {

    private Loan loan;
    public String detalhes;

    public LoanDecorator(Loan loan) {
        this.loan = loan;
    }

    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }

    public abstract float getPercentualAcrescimo();

    public float getValor() {
        return this.loan.getValor() * (1 + (this.getPercentualAcrescimo() / 100));
    }

    public abstract String getNomeAdicional();

    public String getDetalhes() {
        return this.loan.getDetalhes() + "/" + this.getNomeAdicional();
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }
}
