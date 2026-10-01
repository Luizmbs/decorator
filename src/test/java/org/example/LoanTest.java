package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoanTest {

    @Test
    void deveRetornarValorLoan() {
        Loan loan = new StandardLoan(100.0f);

        assertEquals(100.0f, loan.getValor(), 0.01f);
    }

    @Test
    void deveRetornarValorLoanComHomeDelivery() {
        Loan loan = new HomeDelivery(new StandardLoan(100.0f));

        assertEquals(110.0f, loan.getValor(), 0.01f);
    }

    @Test
    void deveRetornarValorLoanComDamageInsurance() {
        Loan loan = new DamageInsurance(new StandardLoan(100.0f));

        assertEquals(120.0f, loan.getValor(), 0.01f);
    }

    @Test
    void deveRetornarValorLoanComRenewal() {
        Loan loan = new Renewal(new StandardLoan(100.0f));

        assertEquals(105.0f, loan.getValor(), 0.01f);
    }

    @Test
    void deveRetornarValorLoanComHomeDeliveryMaisDamageInsurance() {
        Loan loan = new HomeDelivery(new DamageInsurance(new StandardLoan(100.0f)));

        assertEquals(132.0f, loan.getValor(), 0.01f);
    }

    @Test
    void deveRetornarValorLoanComHomeDeliveryMaisRenewal() {
        Loan loan = new HomeDelivery(new Renewal(new StandardLoan(100.0f)));

        assertEquals(115.5f, loan.getValor(), 0.01f);
    }

    @Test
    void deveRetornarValorLoanComDamageInsuranceMaisRenewal() {
        Loan loan = new DamageInsurance(new Renewal(new StandardLoan(100.0f)));

        assertEquals(126.0f, loan.getValor(), 0.01f);
    }

    @Test
    void deveRetornarValorLoanComHomeDeliveryMaisDamageInsuranceMaisRenewal() {
        Loan loan = new HomeDelivery(new DamageInsurance(new Renewal(new StandardLoan(100.0f))));

        assertEquals(138.6f, loan.getValor(), 0.01f);
    }

}
