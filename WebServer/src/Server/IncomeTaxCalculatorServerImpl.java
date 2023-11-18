package Server;

import javax.jws.WebService;

@WebService(name = "IncomeTaxCalculator", targetNamespace = "http://Server/")

public class IncomeTaxCalculatorServerImpl implements IncomeTaxCalculatorServer {
    @Override
    public double calculateIncomeTax(double income) {
        double tax = 0.0;
        if (income <= 5000) {
            tax = income - 5000;
        } else if (income > 5000 && income <= 8000) {
            tax = 0.05 * (income - 5000);
        } else if (income > 8000 && income <= 17000) {
            tax = 0.1 * (income - 8000);
        } else if (income > 17000 && income <= 30000) {
            tax = 0.2 * (income - 17000);
        } else if (income > 30000 && income <= 50000) {
            tax = 0.25 * (income - 30000);
        } else if (income > 50000 && income <= 80000) {
            tax = 0.3 * (income - 50000);
        } else if (income > 80000 && income <= 100000) {
            tax = 0.35 * (income - 80000);
        } else if (income > 100000) {
            tax = 0.45 * (income - 100000);
        }
        return tax;
    }
}
