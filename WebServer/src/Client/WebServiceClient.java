package Client;


import Server.IncomeTaxCalculatorServer;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;
import java.util.Scanner;

public class WebServiceClient {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入工资：");
        double bound= sc.nextDouble();
        // Web服务的WSDL地址
        URL wsdlURL = new URL("http://localhost:8080/IncomeTaxCalculator?wsdl");
        // 命名空间和服务名称
        QName serviceName = new QName("http://Server/", "IncomeTaxCalculatorServerImplService");
        // 创建服务
        Service service = Service.create(wsdlURL, serviceName);
        // 获取Web服务端点
        IncomeTaxCalculatorServer calculator = service.getPort(IncomeTaxCalculatorServer.class);
        // 调用Web服务方法
        double result = calculator.calculateIncomeTax(bound);
        // 打印结果
        System.out.println("收入:"+bound);
        System.out.println("所得税: " + result);
    }
}
