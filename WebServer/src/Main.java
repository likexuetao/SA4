
import Server.IncomeTaxCalculatorServerImpl;


import javax.xml.ws.Endpoint;


public class Main {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/IncomeTaxCalculator",new IncomeTaxCalculatorServerImpl());
        System.out.println("WebService发布成功！");
    }
}