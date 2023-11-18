package Server;

import javax.jws.WebMethod;
import javax.jws.WebService;
@WebService(name = "IncomeTaxCalculator", targetNamespace = "http://Server/")
public interface IncomeTaxCalculatorServer {
    @WebMethod
    double calculateIncomeTax(double income);
}